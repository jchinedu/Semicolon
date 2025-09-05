from turtle import*

def start(t,width,size,color):
    t.color(color)
    t.width(width)
    t.begin_fill()
    for i in range(5):
        t.forward(size)
        t.left(144)
        t.end_fill()

def circle(t,radius,color):
    t.color(color)
    t.circle(radius)
    t.begin_fill()
    t.end_fill()


t = Turtle()
ask = input("enter shape: ")
while ask != "done":
    if ask == "star":
        width = int(input("enter width: "))
        col = input("enter color: ")
        size = int(input("enter a length: "))
        start(t,width,size,col)
    elif ask == "circle":
        radius = int(input("enter radius: "))
        col = input("enter color: ")
        circle(t,radius,col)
    else:
        print("no shape entered")
        ask = input("enter shape: ")
done()
