public class Qno10 {
    String brand;
    String model;
    double price;

    public Qno10(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        Qno10 car1 = new Qno10("Toyota", "Fortuner", 4200000);
        Qno10 car2 = new Qno10("Hyundai", "Creta", 1800000);
        Qno10 car3 = new Qno10("BMW", "X5", 7500000);
        Qno10 car4 = new Qno10("Honda", "City", 1500000);
        Qno10 car5 = new Qno10("Mercedes", "GLA", 4300000);

        if (car1.price > 2000000) {
            System.out.println(car1.brand + " " + car1.model + " - Price: " + car1.price);
        }

        if (car2.price > 2000000) {
            System.out.println(car2.brand + " " + car2.model + " - Price: " + car2.price);
        }

        if (car3.price > 2000000) {
            System.out.println(car3.brand + " " + car3.model + " - Price: " + car3.price);
        }

        if (car4.price > 2000000) {
            System.out.println(car4.brand + " " + car4.model + " - Price: " + car4.price);
        }

        if (car5.price > 2000000) {
            System.out.println(car5.brand + " " + car5.model + " - Price: " + car5.price);
        }
    }
}
