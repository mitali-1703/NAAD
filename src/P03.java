//Program to Swap Two Numbers

public class P03 {
    public static void main(String[] args) {
        //Method-1-->Using a temporary variable
        int a=5,b=3,temp;
        System.out.println("Value before swapping: "+a+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value after swapping: "+a+b);

        //Method-2-->Without using temporary variable
        int c=5,d=3;
        System.out.println("Value before swapping is: "+c+d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("Value after swapping is: "+c+d);
    }
}
