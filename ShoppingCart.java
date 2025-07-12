class Product {
    private String name;
    private double price;

    public Product(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Node {
    private Product product;
    private Node next;

    public Node(Product product) {
        this.product = product;
        this.next = null;
    }

    public Product getProduct() {
        return product;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class ShoppingCart {
    private Node head;

    public ShoppingCart() {
        this.head = null;
    }

    public void addProduct(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newNode);
        }
    }

    public void removeProduct(String productName) {
        if (head == null) {
            System.out.println("Cart is empty");
            return;
        }

        if (head.getProduct().getName().equalsIgnoreCase(productName)) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && !current.getProduct().getName().equalsIgnoreCase(productName)) {
            prev = current;
            current = current.getNext();
        }

        if (current != null) {
            prev.setNext(current.getNext());
        } else {
            System.out.println("product not found in cart.");
        }
    }

    public void displayProducts() {
        if (head == null) {
            System.out.println("cart is empty:(");
            return;
        }

        System.out.println("Items in the cart:");
        Node current = head;
        while (current != null) {
            Product p = current.getProduct();
            System.out.println(p.getName() + " - sar" + p.getPrice());
            current = current.getNext();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.getProduct().getPrice();
            current = current.getNext();
        }
        return total;
    }
}

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

