//Create a simpple program to get the input from the user....
import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your name: " );
        String str=sc.nextLine();
        System.out.printf("Enter your age: ");
        int num=sc.nextInt();
        System.out.printf("My name is "+ str + " and my age is: " + num );

    }
}
/*
output:
Enter your name: Suvarna P N
Enter your age: 20
My name is Suvarna P N and my age is: 20
 */