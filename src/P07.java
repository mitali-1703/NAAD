//Program to Find the Largest Among Three Numbers

import java.util.Scanner;
public class P07 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("The largest no. is "+a);
        }
        else if(b>a && b>c)
            System.out.println("The largest no. is "+b);
        else
            System.out.println("The largest no. is "+c);
        
    }
}
