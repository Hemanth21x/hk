package com.methods;
import java.util.Scanner;

public class FoodOrder {

    // method for price, quantity, delivery charge, discount
    void calculateTotal(double price, int quantity, double deliverycharge, double discount) {

        double total = (price * quantity) + deliverycharge - discount;

        System.out.println("******** Bill Details **********");
        System.out.println("Entered price is: " + price);
        System.out.println("Entered quantity is: " + quantity);
        System.out.println("Entered delivery charge is: " + deliverycharge);
        System.out.println("Entered discount is: " + discount);
        System.out.println("******** Total Bill **********");
        System.out.println("Total amount: " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price per item: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.println("Enter delivery charge: ");
        double deliverycharge = sc.nextDouble();

        System.out.println("Enter discount: ");
        double discount = sc.nextDouble();

        FoodOrder order = new FoodOrder();
        order.calculateTotal(price, quantity, deliverycharge, discount);

        sc.close();
    }
}