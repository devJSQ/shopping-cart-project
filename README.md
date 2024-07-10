# Shopping Cart Project


## Objective

 The project aims to simulate a basic shopping experience for testing and learning purposes by using a Linked List data structure


## Problem



The online shopping cart system allows users to browse and purchase products from an online store. we need a simple system that can manage by adding items to the cart, removing, displaying, and calculating the total price.


## Implementation

1. Create the `Product` class.
   * Create a private variable `productName` and `productPrice`.
   * Implement a constructor to initialize `productName` and `productPrice`.
   * Add getter methods to retrieve the name and price of a product.


2. Create the `Node` class.
   * Create a private variable for the product and a reference to the next node.
   * Implement a constructor to initialize the product and set the next node to None.


3. Create the `ShoppingCart` class.
   * Create a private variable to store the reference to the head node of the linked list (ex: head).
   * Implement a constructor to initialize the head node as None.
   * Implement methods to add, remove, display, and calculate the total price:
     * addProduct(): Creates a new node with the given `Product` object and inserts it at the end of the linked list.
     * removeProduct(): Removes the node containing the given `Product` object from the linked list if it exists.
     * displayProducts(): Iterates over the linked list and prints the name and price of each product. If the cart is empty (head is None), display a message indicating 
     that it is empty.
     * calculatetotalPrice(): Traversing the linked list, sums up the prices of the products, and returns the total price.

       
 4. Test the functionality.
     * Instantiate a few product objects with different names and prices.
     * Create an instance of the `ShoppingCart` class.
     * Add the product to the cart using the `addProduct` method.
     * Display the contents of the cart using the `displayProducts` method.
     * Calculate and print the total price using the `calculatetotalPrice`.
     * Remove a product from the cart using the `removeProduct` method.
     * Display the updated cart contents.



### Output


```
Items in the cart
Shirt - $100.97
Dress - $299.1
shoes - $368.9
the total price is 768.97
Items in the cart after removing an item:
Shirt - $100.97
Dress - $299.1
```

     

## Qualification to pass

* The code should run successfully.
*  Write all required methods correctly addProduct(), removeProduct(), displayProduct() and calculatetotalPrice.




