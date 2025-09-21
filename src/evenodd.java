// create a simple program to know even or odd integer
import java.util.Scanner;
public class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);          //this opens line to read keyword input
        System.out.print("enter an integer:");
        int n = sc.nextInt();                        //read an integer from user
        if (n % 2 == 0)                     //checks if the remainder when dividing by 2 is zero=even
            System.out.println(n + "even");
        else                                //prints whether the number is even or odd
            System.out.println(n + "is odd");
    }
}
/*
enter an integer:9
9is odd
enter an integer:8
8even

 */
//2=brings the scanner class from the java library,Scanner lets program read input typed by the user
//3=declares a public class named evenodd.in java ,every application is wrapped inside a class.
//5=that is the main method, the entry point of the program ,when you run the program,
// java starts executing from here.

//7=creates a new scanner object called sc.
//9= read the next integer that the user types and stores in the variable n

//10= % is modulas operator,n%2 gives the remainder when n is divided by 2,if the remainder is 0,
// the number is even.

