package edu.whccd.jcruz;

import java.util.Scanner;

/*
    The purpose of this application is to learn about debugging using an IDE
    author: jonathan cruz
 */

public class Main {

    public static void main(String[] args) {

        // fix the runtime error caused by the line below by deleting, commenting, or encapsulating it in a try-catch block
        getDouble(null, null);


        // fix the logic error so it calls the getDouble() on the 100th iteration
        for (int i = 1; i < 100; i++) {
            if (i == 50)
            {
                Scanner sc = new Scanner(System.in);
                getDouble(sc, "Enter a double: ");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    // fix the syntax errors in the method below
    public static double getDouble(Scanner sc, String prompt)
    {
        d = 0.0;
        while (true)
        {
            System.out.print(prompt)
            if (sc.hasNextDouble() {
            d = sc.NextDouble();
            sc.nextLine();
            return d;
            } else {
            System.out.println("Error! Invalid number. Try again.");
            sc.nextLine();
            }
        }
    }
}
