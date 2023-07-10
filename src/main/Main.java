import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        Conversions conversions = new Conversions();

        System.out.print("""
                Welcome to the unit converter program.
                                
                ************
                1. feet
                2. inches
                ************
                                
                Enter corresponding unit menu number here:                
                """);
        int userSelection = keyboard.nextInt();
        keyboard.nextLine();

        switch (userSelection) {
            case 1 -> feetConversions(df, keyboard, conversions);
            case 2 -> inchConversions(df, keyboard, conversions);
        }
    }


    public static void feetConversions(DecimalFormat df, Scanner keyboard, Conversions conversions) {
        System.out.println("test");
    }

    private static void inchConversions(DecimalFormat df, Scanner keyboard, Conversions conversions) {
    }
}
