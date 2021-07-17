package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        int length;
        int width;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        length = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle:");
        width = input.nextInt();
        input.close();

        int area = (length * 2 + width * 2);


        System.out.println("The area of the rectangle is : " + area);

        //str.concat(length).concat(width);

    }
}
