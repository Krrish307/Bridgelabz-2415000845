class Circle {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Area = " + c.getArea());
        System.out.println("Circumference = " + c.getCircumference());
    }
}
