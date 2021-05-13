//Program to Iterate through each characters of the string.

import java.util.Scanner;
public class P09 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("The characters of the entered string are: ");

        for(int i=0;i<str.length();i++){

            //access each character
            char a = str.charAt(i);
            System.out.print(a + "");
        }
    }
}
