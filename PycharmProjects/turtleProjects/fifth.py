from turtle import *
t1 = Turtle()
t2 = Turtle()
t3 = Turtle()
t4 = Turtle()


def traingle(t,color):
    t.color(color)
    t.begin_fill()
    for i in range(3):
        t.forward(100)
        t.left(120)
    t.end_fill()

turtle = [t1, t2, t3, t4]
y=100
for t in turtle:
    t.up()
    t.goto(0,y)
    t.down()
    y-= 100


traingle(t1,"red")
traingle(t2,"blue")
traingle(t3,"green")
traingle(t4,"purple")

done()


