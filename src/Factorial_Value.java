import java.util.Scanner;

public class Factorial_Value
{
    public static void main(String args[]) //create main method
    {
        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter any number");//user input any number
        int fact=1;
        int number=scanner.nextInt();// the number to calculate factorial
        for(int i=1;i<=number;i++){//apply for loop
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);//print result
    }
}

