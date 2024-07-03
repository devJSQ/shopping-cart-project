# Shopping Cart Project


## Objective

 The project aims to simulate a basic shopping experience for testing and learning purposes by using a `Linked List` data structure


## Problem



The online `shopping cart` system allows users to browse and purchase products from an online store. we need a simple system that can manage by adding items to the cart, removing, displaying, and calculating the total price.


## Implementation

1. Create the `Product` class.
   * Create an instance variable for `productName` and `productPrice`.
   * Implement a constructor to initialize `productName` and `productPrice`.
   * Add getter methods to retrieve the name and price of a product.


2. Create the `Node` class.
   * Create instance variables for the product and a reference to the next node.
   * Implement a constructor to initialize the product and set the next node to None.


3. Create the `ShoppingCart` class.
   * Create an instance variable to store the reference to the head node of the linked list (ex: head).
   * Implement a constructor to initialize the head node as None.
   * Implement methods to add, remove, display, and calculate the total price:
     * add_product(): Creates a new node with the given Product object and inserts it at the end of the linked list.
     * remove_product(): Removes the node containing the given Product object from the linked list if it exists.
     * display_products(): Iterates over the linked list and prints the name and price of each product. If the cart is empty (head is None), display a message indicating 
     that it is empty.
     * calculate_total_price(): Traversing the linked list, sums up the prices of the products, and returns the total price.

       
 4. Test the functionality.
     * Instantiate a few product objects with different names and prices.
     * Create an instance of the `ShoppingCart` class.
     * Add the product to the cart using the `add_product` method.
     * Display the contents of the cart using the `display_products` method.
     * Calculate and print the total price using the `calculate_total_price`.
     * Remove a product from the cart using the `remove_product` method.
     * Display the updated cart contents and calculate the total price again.
     










