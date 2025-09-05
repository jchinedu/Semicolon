class App:
    def __init__(self, users, storage, username):
        self.users = users
        self.storage = storage
        self.username = username

    def login(self):
        if self.username =="owner" and self.users >=1:
            print("welcome,", self.username)
            print("your storage is:", self.storage)
        else:
            print("you are not a user")


    def increase_capacity(self, number):
        self.storage += number
        print("current storage is:", self.storage)

    def check_upgard(self):
        if self.users >=self.storage:
            upgrade_amt = int(input("upgrade amount: "))
            self.storage += upgrade_amt
        else:
            print("the remaining amount of storage is:", str(self.storage-self.users))





product1 = App(35, 256, "owner")
product1.login()
product1.increase_capacity(44)

print()

product2 = App(12, 128, "john")
product2.login()
product2.check_upgard()