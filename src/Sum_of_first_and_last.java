import java.util.Scanner;

public class Sum_of_first_and_last
{
    public static void main(String[] args) { //create main method
        Scanner scanner = new Scanner(System.in);//create new object for Scanner class
        System.out.println("enter five digit number:");//user input five numbers
        int num = scanner.nextInt();
        int a = num / 10000;
        int b = num % 10;
        int sum = a + b;
        if (num >= 10000 && num < 100000) {//apply if else condition
            System.out.println("total of first and last number :" + sum);//print result

    }else{
    System.out.println("invalid entry");//print result
}
}}
