
public class Qno4 {

  
    class Rectangle {
        double length;
        double width;

      
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Method to calculate area
        public double calculateArea() {
            return length * width;
        }
    }

   
    public static void main(String[] args) {
        Qno4 outer = new Qno4();

        Rectangle r1 = outer.new Rectangle(5.0, 3.0);
        Rectangle r2 = outer.new Rectangle(7.5, 4.0);
        Rectangle r3 = outer.new Rectangle(6.0, 2.5);

        System.out.println("Area of Rectangle 1: " + r1.calculateArea());
        System.out.println("Area of Rectangle 2: " + r2.calculateArea());
        System.out.println("Area of Rectangle 3: " + r3.calculateArea());
    }
}
