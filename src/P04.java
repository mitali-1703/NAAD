//Program to convert string type variables into int

public class P04 {
    public static void main(String[] args) {
        //Method-1-->Using parseInt()
        String str1 = "748";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        //Method-2-->Using valueOf()
        String str = "748";
        int num = Integer.valueOf(str);
        System.out.println(num);
    }
}
