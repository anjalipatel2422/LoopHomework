import java.util.Scanner;

public class Sum_Of_digit {
    public static void main(String[] args) {//create main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any five digit ");//user input any five digit
        int num = scanner.nextInt();
        int storevalue, total = 0;
        if (num >= 10000 && num < 100000) {//apply if else condition
            while (num >= 1) {//apply while loop
                storevalue = num % 10;
                total = total + storevalue;
                num = num / 10;

            }
            System.out.println("total of given digit =" + total);//print result


        } else {
            System.out.println("invalid number");//print result
        }
    }
}








