from turtle import *
from random import *

pencil = Turtle()

start = input()
while start != "off":

    for i in range(10):
        radius = randint(5,100)
        x = randint(-200,200)
        y = randint(-200,200)


        pencil.up()
        pencil.goto(x,y)
        pencil.down()

        pencil.circle(radius)
    start = input()




done()