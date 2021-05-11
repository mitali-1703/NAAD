//Program to convert int type variables into string

public class P05 {
    public static void main(String[] args) {
        //Method-1-->Using valueOf()
        int num1 = 73;
        String str1 = String.valueOf(num1);
        System.out.println(str1);

        //Method-2-->Using toString method of Integer class
        int num2 = 73;
        String str2 = Integer.toString(num2);
        System.out.println(str2);

        //Method-3-->Using + operator
        int num3 = 73;
        String str3 = "" + num3;
        System.out.println(str3);

        //Method-4-->Using format()
        int num4 = 73;
        String str4 = String.format("%d",num4);
        System.out.println(str4);
    }
}
