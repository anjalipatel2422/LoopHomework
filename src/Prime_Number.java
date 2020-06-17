import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {//create main method

        Scanner scanner = new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter any number");//user input any number
        int num = scanner.nextInt();
       int b=1,c=0;
       while (b<=num)//apply while loop
       {
           if(num%b==0)//apply if else condition
               c=c+1;
           b++;
       }
       if(c==2)
           System.out.println("This" +num+"is prime number");
       else
           System.out.println("This" +num+"is not prime number");

    }
}






