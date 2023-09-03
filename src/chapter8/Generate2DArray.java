package chapter8;

import java.util.Scanner;

public class Generate2DArray {

    public static void main(String[] args) {

        //souf is system.out.printf
        //print2DArray(generateRandom2DArray());

        int[][] array2D = generateRandom2DArray();
        print2DArray(array2D);
        System.out.println("The elements sum is: " + sumElement(array2D));
        System.out.println("The largest number is: " + largestElement(array2D));
        System.out.println("The smallest number is: " + smallestElement(array2D));
        System.out.println("The sum of row 2 is " + sumRowElement(array2D, 2));
    }

    public static int[][] generateRandom2DArray() {
        Scanner input= new Scanner(System.in);

        System.out.print("Please enter the rows number: ");
        int rows = input.nextInt();
        System.out.print("Please enter the column number: ");
        int columns = input.nextInt();

        //Declare and initialize the 2D array
        int[][] arr = new int[rows][columns];

        final int MIN = 1;
        final int MAX = 100;

        for(int i = 0; i< arr.length; i++) { //i = rows
            for (int j = 0; j < arr[i].length; j++) { // j = columns

                arr[i][j] = (int) (MIN + Math.random() * (MAX - MIN + 1)); //Generates random number from max to min

            }

        }
        return arr;
    }

    public static void print2DArray(int[][] a) {
        System.out.print("[");
        for(int i = 0; i< a.length; i++){ //i = rows
            for(int j = 0; j< a[i].length; j++){ // j = columns
                if(i == a.length - 1 && j == a[i].length - 1)
                    System.out.print(a[i][j]);
                else
                    System.out.printf("%-6s", a[i][j] + ", ");
            }
            if(i == a.length-1) {
                System.out.println("]");
                return;
            }
            System.out.print("\n ");
        }
        System.out.print("]");
    }

    public static int sumElement(int[][] a) {

        int sum = 0;

        for(int i = 0; i < a.length; i++) { //Rows
            for(int j = 0; j < a[i].length; j++) { //Columns
                sum += a[i][j];

            }
        }
        return sum;
    }

    public static int largestElement(int[][] a) {

        int large = a[0][0];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(large < a[i][j]){
                    large = a[i][j];
                }
            }
        }
        return large;
    }

    public static int smallestElement(int[][] a) {
        int small = a[0][0];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(small > a[i][j]){
                    small = a[i][j];
                }
            }
        }
        return small;
    }

    //create a method that returns the element sum of a specific row
    public static int sumRowElement(int[][] a, int r){
        int sum = 0;

        for(int j = 0; j < a[r].length; j++) {
            sum += a[r][j];
        }
        return sum;
    }

    public static int sumColumnElement(int[][] a, int c){
        int sum = 0;

        for(int i = 0; i < a.length; i++){
            sum += a[i][c];
        }
        return sum;
    }


}
