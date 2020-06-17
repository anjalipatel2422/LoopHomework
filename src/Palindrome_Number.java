import java.util.Scanner;

public class Palindrome_Number
{
    public  static void main(String[] args) {//create main method
    Scanner scanner = new Scanner(System.in);//create new object for Scanner class
    System.out.println("Enter any number");//user input any number
    int num = scanner.nextInt();
        int a = 0;
        int total = num;
        while (num > 0) {//apply while condition
            int b = num % 10;
            num = num / 10;
            a = (a*10)+b;
        }
        if (total == a) //apply if else condition
            System.out.println("This is palindrome number");//print result
        else
            System.out.println("This is Not palindrome number");//print result
    }
}

