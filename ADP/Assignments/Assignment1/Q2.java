class Product {
    private int prodId;
    private double price;
    private int quantity;
    private static double totalPrice = 0;

    public Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }

    public void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + (price * quantity));
        System.out.println();
    }

    public static double getTotalPrice() {
        return totalPrice;
    }
        
}


public class Q2 {
    public static void main(String[] args) {
        // Creating 5 products
        Product product1 = new Product(1, 100, 2);
        Product product2 = new Product(2, 200, 3);
        Product product3 = new Product(3, 300, 1);
        Product product4 = new Product(4, 400, 4);
        Product product5 = new Product(5, 500, 2);

        // Displaying product details
        System.out.println("Product Details:");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();

        // Displaying total price
        System.out.println("Total Price of all products: " + Product.getTotalPrice());
    }
}