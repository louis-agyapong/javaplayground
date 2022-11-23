package org.playground;

/**
 * This program calculates the sale price of an
 * item that is regularly priced at $59, with a
 * 20 percent discount subtracted.
 */

public class Discount {
    public static void main(String[] args) {
        // variables to hold the regular price, the amount
        // of a discount, and the sale price.
        double regularPrice = 59.0;
        double discountAmount;
        final double DISCOUNT = 0.2;
        double salePrice;

        // calculate the amount of 20% discount.
        discountAmount = regularPrice * DISCOUNT;

        // calculate the sale price by subtracting the discount
        // from the regular price.
        salePrice = regularPrice - discountAmount;

        // Display the result.
        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount amount $" + discountAmount);
        System.out.println("Sale price: $" + salePrice);
    }
}
