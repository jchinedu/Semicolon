import bcrypt

USERS = "users.tx"

def hash_password(password):
    return bcrypt.hashpw(password.encode(), bcrypt.gensalt())



def register(username, password):
    with open(USERS, "a") as file:
        hpass = hash_password(password)
        file.write(f'{username},{hpass}\n')
    bcrypt.checkpw(username, hpass)
    return "registration successful"







def main():
    option = input("enter 1 to register and 2 to log in: ")
    match option:
        case "1":
            name = input("enter your name: ")
            password = input("enter your password: ")
            register(name, password)


main()