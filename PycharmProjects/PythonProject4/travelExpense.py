class Travel:
    def __init__(self, country, month, type):
        self.country = country
        self.month = int(month)
        self.type = type
        self.price = 0

    def trip_safe(self):
        if self.month == 10 and self.month == 3:
            print(f"you are going to {self.country} in the winter, this is a {self.type} trip!")
        elif self.month > 3 and self.month < 10:
            print(f"you are going to {self.country} in the summer, this is a {self.type} trip!")
        else:
            print("invalid input")

    def calc_cost(self, cost):
        costs = []
        while cost !=0:
            self.price = cost
            costs.append(cost)
            cost = int(input("enter another  cost: "))
        advice = self.advice(self.price)
        inspect = self.list_inspect(costs)
        return advice, inspect
    def advice(self, num):
        if num < 500:
            print("low budget")
        elif num >= 500 and num < 1500:
            print("take a flight to anywhere")
        else:
            print("luxury")


    def list_inspect(self,costs):
        less_than_10 = 0
        for i in costs:
            if i >= 10:
                less_than_10 += 1
        if less_than_10 == 10:
            self.price = 100
            print(f"update price: {self.price}")



location = input("enter a contry: ").capitalize()
trip_type = input("leisure or business: ").capitalize()
month = input("enter a month: ")



test = Travel(location,month, trip_type,)

flight_cost = int(input("enter a flight cost: "))
test.calc_cost(flight_cost)