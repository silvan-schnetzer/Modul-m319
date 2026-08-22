package ch.tbz;

// Imports libraries

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the input-functions can be used now!

public class LearnOperations {
    public static void main(String[] args) {
        String mytext = "Hallo welt";
        int x = inputInt("give a value for x: ");
        int a = x + 15 * mytext.length();
        System.out.println("lenght = " + mytext.length());
        System.out.println("a=" + a);

    }
}
