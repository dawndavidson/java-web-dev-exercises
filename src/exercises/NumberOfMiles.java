package exercises;

import java.util.Scanner;

public class NumberOfMiles {
    public static void main(String[] args) {
        double miles;
        double gallonsOfGas;


        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven:");
        miles = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("Please enter the amount of gas you've consumed in miles:");
        gallonsOfGas = input.nextDouble();
        input.close();

        double milesPerGallon = (miles/gallonsOfGas);

        System.out.println("Your miles per gallon are : " + milesPerGallon);

    }
}
