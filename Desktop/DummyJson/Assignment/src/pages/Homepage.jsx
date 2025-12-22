import React from 'react';
import Header from '../components/header';
import Sidebar from '../components/sidebar';
import Footer from '../components/footer';
import { RouterProvider } from 'react-router-dom';
import router from '../Route/route.jsx';
import { Provider } from 'react-redux';
import { store } from '../store/store.jsx';
import styles from './Homepage.module.css';
import AllProducts from '../components/AllProduct/AllProducts.jsx';

const HomePage = () => {
  return (
    <Provider store={store}>
      <div className="homepage">
          <div>
            <AllProducts/>
          </div>
      </div>
    </Provider>
  );
};

export default HomePage;