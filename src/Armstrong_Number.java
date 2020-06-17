

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {//create main method
        Scanner scanner = new Scanner(System.in); //create new object for Scanner class
        System.out.println("Enter any number");//user input any number
        int num = scanner.nextInt();//number to calculate armstrong number
        int a = 0;
        int total = num;
        while (num > 0) {//apply while loop
           int b = num % 10;
            num = num / 10;
            a = a + (b * b * b);
        }
        if (total == a)//apply if else condition
            System.out.println("This is armstrong number");//print result
        else
            System.out.println("This is Not armstrong number");//print result
    }
}