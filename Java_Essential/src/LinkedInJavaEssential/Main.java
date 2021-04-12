package LinkedInJavaEssential;

import LinkedInJavaEssential.model.ClothingItem;

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


    } // end main
} // end class Main
