import React, { useState } from 'react';
import { useLoginUserMutation } from '../Api/LoginApi.jsx';
import { NavLink, useNavigate } from 'react-router';   
import styles from '../Auth/login/login.module.css'; 


function Login() {
    const [formData, setFormData] = useState({
        username: '',
        password: '',
    }); 
    const [loginUser] = useLoginUserMutation();
    const navigate = useNavigate();
    const handleChange = (event) => {

        setFormData((prev) => ({
            ...prev,
            [event.target.id]: event.target.value,
        }));
    };

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            const response = await loginUser({
                username: formData.username,
                password: formData.password,
                expiresInMins: 30,
            }).unwrap();
            console.log('Login successful:', response);
            localStorage.setItem('token', response.token);


            alert('Login Successful');
            navigate('/home');
        } catch (error) {
            console.error('Login failed:', error);
            alert("invalid credentials");
        }
    };

    return (
        <div className={styles.container}>
            <form className={styles.form} onSubmit={handleSubmit}>
                <h2 className={styles.title}>Login</h2>
                <input
                    type="text"
                    id="username"
                    placeholder="Username"
                    className={styles.input}
                    value={formData.username}
                    onChange={handleChange}
                    required
                />
                <input
                    type="password"
                    id="password"
                    placeholder="Password"
                    className={styles.input}
                    value={formData.password}
                    onChange={handleChange}
                    required
                />
                <button type="submit" className={styles.button}>Login</button>
                <p className={styles.registerText}>
                    Don't have an account? <NavLink to="/register" className={styles.registerLink}>Register</NavLink>
                </p>
            </form>
        </div>
    );
};
export default Login;