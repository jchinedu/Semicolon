package Cynlinder;

public class Cylinder {
    private double radius = 1;
    private double height = 1;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new CylinderNotLessThaNZero();
        }
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height < 0) {
            throw new CylinderNotLessThaNZero();
        }
        this.height = height;
    }
    public double calculateVolume(double radius, double height,double PI) {
        return height * (radius * radius) * PI;

    }
}
