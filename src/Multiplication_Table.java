import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args) { // create main method

        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("enter number you want table");//user input any number
        int num =scanner.nextInt();
        System.out.println("multiplication table of " +num);
        for (int a = 1; a <=10 ; a++) // apply for loop
        {
            System.out.println(num+"x"+a+"="+num*a);//print table

        }






    }
}

