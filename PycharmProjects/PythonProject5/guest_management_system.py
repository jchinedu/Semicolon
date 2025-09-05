class Guest:
    def __init__(self,last, first, rank, age):
        self.last = last
        self.first = first
        self.rank = int(rank)
        self.age = int(age)

    def guest_safe(self, all_guests):
        print("\nGuest List:")
        for guest in all_guests:
            print(f"{guest.first} {guest.last}, Age: {guest.age}")


    def loyalty_program(self, all_guests):
        gold_members = [guest.last for guest in all_guests if guest.rank >= 10]
        if gold_members:
            print("Gold Members:")
            for member in gold_members:
                print("\tGuests", member)
    def guest_avg(self, all_guests):
        total_age = 0
        for guest in all_guests:
          total_age +=guest.age
        ave_age = total_age / len(all_guests)
        print("Average customer age:", ave_age)
all_guests = []
num_guest = int(input("How many guests do you have?"))
for i in range(num_guest):
    first_name = input("First Name:")
    last_name = input("Last Name:")
    age = int(input("Age:"))
    rank = int(input("Rank:"))
    guest = Guest(first_name, last_name, rank, age)
    all_guests.append(guest)



guest = all_guests[0]
guest.loyalty_program(all_guests)
guest.guest_safe(all_guests)
guest.guest_avg(all_guests)

