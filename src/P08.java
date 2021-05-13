//Program to Capitalize the first character of each word in a String

import java.util.Scanner;
public class P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        // create two substrings from name
        // first substring contains first letter of name
        // second substring contains remaining letters
        String firstLetter = str.substring(0,1);
        String remainingLetters = str.substring(1,str.length());

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        //join the two substrings
        str = firstLetter + remainingLetters;
        System.out.println(str);
    }
}