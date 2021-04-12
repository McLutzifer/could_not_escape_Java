package LinkedInJavaEssential;

import LinkedInJavaEssential.model.ClothingItem;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Test");

        double x  = CalcHelper.addValues(2, 4);

        var item = new ClothingItem();
        item.setType("Shirt");
        item.setSize("M");
        item.setPrice(19.99);
        item.setQuantity(3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order will cost %s",
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);

    } // end main
} // end class Main
