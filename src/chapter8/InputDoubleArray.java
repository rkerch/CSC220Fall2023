package chapter8;

import java.util.Scanner;

public class InputDoubleArray {

    public static void main(String[] args) {

        int[][] a= new int[3][3];
        Scanner in = new Scanner(System.in);
        //to initialize or access a double array, use a nested for loop

        System.out.println("enter the elements of the double array");

        for(int row= 0; row< a.length; row++){
            for(int column= 0; column< a[row].length; column++){

                a[row][column]= in.nextInt();
            }
        }
        //to display a double array we need to use a nested for loop again

        for(int row= 0; row< a.length; row++){
            for(int column= 0; column<a[row].length; column++){
                //System.out.println(a[row][column]);
                System.out.print(a[row][column] + ", ");
            }
            System.out.println(); //Just to separate the rows from the columns in output
        }

        //how to generate a random number from min to max
        //(int)(Min + Random()*(max-min))
        //(int)(0 + Random()*(100-0)) Generates a random number from 0 to 100
        //If you want to include max in the generation add one to max-min


    }
}
