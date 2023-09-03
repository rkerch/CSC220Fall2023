package chapter8;

import java.util.Scanner;

public class DoubleArraysDemo {

    public static void main (String[] args) {
        /*
        a double array is a multidimensional array, used to create tabled of Dat
         */

        int[][] a;

        //add its reference to a variable
        a = new int[5][10]; //5 rows and 10 columns
        //create and add reference in oone line

        int[][] b = new int[5][5];

        b[0][0] = 1; //assigning 1 to element at row 0 column 0 (0,0)
        b[0][1] = 2; //assigning 2 to element at (0,1)


        //declare and initialize a double array
        double[][] scores = {
                {90.5, 67.8, 78.9},
                {85.8, 58.8, 90.1},
                {88, 86, 96}
        }; //Must have semicolon after squiggly

        //Scanner is a class used to get input using the keyboard

        Scanner input = new Scanner(System.in); //alt + enter

        //Notify the user to print a value
        //sout ctrl + space


        System.out.println("Enter a value: ");
        //double num = input.nextDouble(); //enter a double
        //int integer1 = input.nextInt(); //enter an integer
        String str = input.next(); //enter a line of strings
        String lineStr = input.nextLine(); //enter a line of strings
        System.out.println("The value you just entered is " + lineStr);




    }
}
