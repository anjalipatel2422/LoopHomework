import java.util.Scanner;

public class Odd_Even_Digit_Number
{
    public static void main(String[] args) {//create mian method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any five digit ");//user input only five digit
        int num=scanner.nextInt();
        int eventotal=0,oddtotal=0,counteven=0,countodd=0;//create variable
        if(num>=10000&&num<100000) {//user only enter any five digit,10000=five digit,100000=six digit
            while (num >= 1) {//apply while loop
                int a = num % 10;
                int b = num % 2;

                if (b == 0) { //apply if else condition
                    eventotal = eventotal + a;
                    counteven++;

                } else {
                    oddtotal = oddtotal + a;
                   countodd++;

                }
                num = num / 10;
            }
            System.out.println("total of even number" + eventotal);
            System.out.println("number of even ="+counteven);//print number of even digit
            System.out.println("total of odd number " + oddtotal);
            System.out.println("number of odd ="+countodd);//print number of odd digit
        }else{
            System.out.println("Invalid entry except five digit ");
        }



    }
}
