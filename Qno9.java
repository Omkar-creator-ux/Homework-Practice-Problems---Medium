public class Qno9 {
    double radius;
    static final double PI = 3.14159;

    public Qno9(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Qno9 circle1 = new Qno9(5);
        Qno9 circle2 = new Qno9(7.5);

        System.out.println("Circle 1 - Area: " + circle1.calculateArea() + ", Circumference: " + circle1.calculateCircumference());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea() + ", Circumference: " + circle2.calculateCircumference());
    }
}
