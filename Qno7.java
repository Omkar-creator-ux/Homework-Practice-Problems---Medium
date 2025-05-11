package Medium;

public class Qno7 {

    // Product class defined inside Qno7
    static class Product {
        String productName;
        double price;
        double discountPercentage;

        public Product(String productName, double price, double discountPercentage) {
            this.productName = productName;
            this.price = price;
            this.discountPercentage = discountPercentage;
        }

        public double calculateFinalPrice() {
            double discountAmount = (discountPercentage / 100) * price;
            return price - discountAmount;
        }
    }

    // Main method
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 10);
        Product product2 = new Product("Smartphone", 800, 15);
        Product product3 = new Product("Headphones", 200, 5);

        System.out.printf("%s final price: $%.2f%n", product1.productName, product1.calculateFinalPrice());
        System.out.printf("%s final price: $%.2f%n", product2.productName, product2.calculateFinalPrice());
        System.out.printf("%s final price: $%.2f%n", product3.productName, product3.calculateFinalPrice());
    }
}
