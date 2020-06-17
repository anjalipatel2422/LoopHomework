import java.util.Scanner;

public class Reverse_Digit_Number
{
    public static void main(String[] args) {//create main method
        Scanner scanner = new Scanner(System.in);//create new object for Scanner class
        System.out.println("enter any five number");//user enter only five number
        int num = scanner.nextInt();
        int reverse = 0, digit;
        if (num >= 10000 && num < 100000) {//apply if else condition
            while (num != 0) {//apply while loop
                digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;

            }
            System.out.println("reverse num=" + reverse);//print result

    }else{
    System.out.println("invalid entry");//print result
}
}}
