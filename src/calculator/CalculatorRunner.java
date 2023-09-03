package calculator;

import java.util.Scanner;
import java.lang.Math;

public class CalculatorRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String equation;
        double[] terms;
        double solution = 0;

        System.out.print("Please enter a calculation: ");
        equation = formatEquation(input.nextLine());

        //addition(equation);


        System.out.println(equation);

        separateTerms(equation);
    }

    //makes an array of the terms in the equation without the operations
    public static double[] separateTerms(String s){

        double[] arr;
        int[] numSize;
        int numTerms = 0;
        int index = 0;

        for(int i = 0; i < s.length(); i++){
            if(isNumber(s.charAt(i))){
                numTerms++;
                while(i < s.length() && isNumber(s.charAt(i))){
                    i++;
                }
            }
        }
        //System.out.println(numTerms);
        arr = new double[numTerms];
        numSize = new int[numTerms];

        //This creates the array numSize which holds the number of digits in each number in the equation
        int x = 0;
        for(int i = 0; i < s.length(); i++){
            if(isNumber(s.charAt(i))){
                numSize[x]++;
            }
            if(isMathOperation(s.charAt(i))){
                x++;
            }
        }
        //This loops through the formatted equation
        //for(int z = 0; z < s.length(); z++) {
        int z = 0;
            //This loops the same number of times as the number of numbers in the equation
            for (int i = 0; i < numTerms; i++) {
                //This loops the same number of times as the number of digits in the number
                for (int j = 0; j < numSize[i]; j++) {
                    if (isNumber(s.charAt(z))) {
                        arr[i] += (Math.pow(10, (numSize[i] - j - 1)) * (s.charAt(z) - '0'));
                        System.out.println("i is " + i + ", j is " + j + ", z is " + z);
                        System.out.println(s.charAt(z) - '0');
//                        System.out.println(numSize[i] - j);
//                        System.out.println(Math.pow(10, (numSize[i] - j - 1)));
                    }
                }
                z++;
                while(!isNumber(s.charAt(z))){
                    z++;
                }
            }
        //}




        printArray(numSize);
        printArray(arr);


        return arr;
    }

    //Formats the string to have a space between operators but not numbers
    public static String formatEquation(String s){

        String goodEquation = "";
        for(int i = 0; i < s.length(); i++){
            while(isMathOperation(s.charAt(i))){
                goodEquation = goodEquation + ' ' + s.charAt(i) + ' ';
                i++;
            }
            if(s.charAt(i) != ' '){
                goodEquation += s.charAt(i);
            }
        }



        return goodEquation;
    }

    //True if c is + - / *
    public static boolean isMathOperation(char c){

        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    //True if c is a number
    public static boolean isNumber(char c){
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }

    public static void printArray(double[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }


//    public static double addition(String s){
//
//    }

}
