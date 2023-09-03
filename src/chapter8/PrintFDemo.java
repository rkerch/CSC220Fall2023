package chapter8;

public class PrintFDemo {

    public static void main(String[] args) {

        int num = 1000;
        double x = 100.56;
        char y = 'g';
        String name = "Ryan";

        System.out.printf("This is an integer: %d, this is a double: %.2f, this is a character: %c, This is a String: %s ", num, x, y, name);
        //Decimal after percent sign is the number of decimals the value will be rounded to
        System.out.printf("\n%-20.2f%d", 100.7, 1000);
        //If number right after percent sign is number of spaces on left side of the value
        //If number after percent sign is negative spaces will be added to the right side of the value

    }
}
