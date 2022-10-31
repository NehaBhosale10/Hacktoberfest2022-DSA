
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.println("Enter a number");
      int num = sc.nextInt();
        if (num % 2 == 0) {
 
            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        }
 
        else {
 
            // If remainder is not zero then this number is
            // odd
            System.out.println("Entered Number is Odd");
        }
    }
}
