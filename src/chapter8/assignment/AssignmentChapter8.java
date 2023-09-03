package chapter8.assignment;

import java.util.Scanner;

public class AssignmentChapter8 {

    public static void main(String[] args) {

        double[][] array2d;
        int[] locate = new int[2];

//        array2d = inputArray();

        array2d = generateRandom2DArray();
        print2DArray(array2d);

        locate = locateLargest(array2d);



        System.out.println("The location of the largest element is (" + locate[0] + ", " + locate[1] + ")");
    }

    public static double[][] generateRandom2DArray() {
        Scanner input= new Scanner(System.in);

        System.out.print("Please enter the rows number: ");
        int rows = input.nextInt();
        System.out.print("Please enter the column number: ");
        int columns = input.nextInt();

        //Declare and initialize the 2D array
        double[][] arr = new double[rows][columns];

        final int MIN = 1;
        final int MAX = 100;

        for(int i = 0; i< arr.length; i++) { //i = rows
            for (int j = 0; j < arr[i].length; j++) { // j = columns

                arr[i][j] = (int) (MIN + Math.random() * (MAX - MIN + 1)); //Generates random number from max to min

            }

        }
        return arr;
    }

    public static int[] locateLargest(double[][] arr) {
        int[] location = new int[2];
        double max = arr[0][0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    location[0] = j;
                    location[1] = i;
                }
            }
        }

//        location[0]++;
//        location[1] = arr.length - location[1];
        return location;
    }

    public static double[][] inputArray(){

        double[][] arr;
        int rows;
        int columns;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of rows for the array: ");
        rows = scan.nextInt();
        System.out.print("Please enter the number of columns for the array: ");
        columns = scan.nextInt();

        arr = new double[rows][columns];

        //System.out.print("[");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
//                if(i != 0){
//                    System.out.print(" ");
//                }
                arr[i][j] = scan.nextDouble();
                //System.out.print(",");
            }
            //System.out.println();
        }

        return arr;
    }

    public static void print2DArray(double[][] a) {
        System.out.print("\n[");
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
}
