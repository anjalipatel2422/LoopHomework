import java.util.Scanner;

public class Multiplication_Table_Do_While_Loop
{
    public static void main(String[] args) {//create main method


            Scanner scanner=new Scanner(System.in);//create new object for Scanner class
            System.out.println(" enter first number");//user input first number
            int num1=scanner.nextInt();
        System.out.println("enter last number ");//user input last number
        int num2=scanner.nextInt();
        int i;
        int j;
        do {//apply do while loop
            for (i = num1; i <= num2; i++) {//apply for loop
                System.out.println( "  " );
                for (j = 1; j <= 10; j++) {
                    System.out.print( " " + i  *  j + " " );

                }

                }
                i++;
            }
            while (i <= num2 ) ; //apply do while loop


        }}