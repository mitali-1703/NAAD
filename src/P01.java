//Program to Print an Integer (Entered by the User)

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Taking input from user: ");
        int a = s.nextInt();
        System.out.println("The value entered by user is: " + a);
    }
}
