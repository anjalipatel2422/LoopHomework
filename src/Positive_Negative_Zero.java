import java.util.Scanner;

public class Positive_Negative_Zero
{
public static void main(String[]args) {//create main method

    int num,positive=0,negative=0,zero=0;
    char choice;
    do{
        Scanner scanner=new Scanner(System.in);//create new object
        System.out.println("enter any number");//user input any number
        num=scanner.nextInt();
        if(num>0)
        {
            positive++;
        }else if(num<0){
            negative++;
        }
        else {
            zero++;
        }
        System.out.println("do you want to continue number y/n");//user choose option yes or no
        choice=scanner.next().charAt(0);
    }while (choice=='y'|| choice=='Y');
    System.out.println("positive numbers are:"+positive);//print result
    System.out.println("negative numbers are:"+negative);//print result
    System.out.println("numbers are zero:"+zero);//print result

    }
}

