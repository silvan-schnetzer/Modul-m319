// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbreviation purpose to static functions
import static java.lang.Math.*;     // Mathematics Library for abbreviation purpose to static functions
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the input-functions can be used now!



public class CinemaTickets {

    public static void main(String[] args ) {

        System.out.println("User inputs");

        String name = inputString("was ist dein Name: ");

        int age = inputInt("Wie alt bist du: ");

        int tickets = inputInt("Wie viele Tickets willst du kaufen: ");

        double price = 18.50;

        boolean jung = age <= 16;

        boolean alt = age >= 65;

        boolean rabatt =  jung || alt;

        if (rabatt == true) {
           System.out.println("Du hast einen Rabatt!");
           price = price * 0.8;
        }

        System.out.println("Visitor name: "+ name);

        System.out.println("the price per ticket "+ price);

        System.out.println("total cost is "+ price * tickets);

}
}
