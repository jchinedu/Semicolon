from turtle import *
pencil = Turtle()
def square(t,size,color):
    t.color(color)
    t.begin_fill()
    for i in range(4):
        t.forward(size)
        t.right(90)
    t.end_fill()

def circle(t, radius, color):
    t.color(color)
    t.begin_fill()
    t.circle(radius)
    t.end_fill()

def pentagon(t, size, color):
    t.color(color)
    t.begin_fill()
    t.end_fill()
    for i in range(5):
        t.forward(size)
        t.right(72)

start = input("square/circle/pentagon: ").lower()
while start != "stop":
    if start == "square":
        size = int(input("enter a size"))
        color = input("enter a color")
        square(pencil, size, color)

    elif start == "circle":
        radius = int(input("enter a radius"))
        color = input("enter a color")
        circle(pencil, radius, color)

    elif start == "pentagon":
        size = int(input("enter a size"))
        color = input("enter a color")
        pentagon(pencil, size, color)
    else:
        print("error: shape not found")

    start = input("square/circle/pentagon: ").lower()

done()

