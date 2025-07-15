

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
