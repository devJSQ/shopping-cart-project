
// TEST
public class ShoppingCartTest {
    public static void main(String[] args) {
        Product p1 = new Product("shirt", 100.97);
        Product p2 = new Product("ddress", 299.10);
        Product p3 = new Product("shoes", 368.90);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayProducts();
        System.out.printf("The total price is $%.2f\n", cart.calculateTotalPrice());

        // here ill remove one item
        cart.removeProduct("Shoes");

        // here ill display updated cart
        System.out.println("\nItems in the cart after removing an item:");
        cart.displayProducts();
    }
}

