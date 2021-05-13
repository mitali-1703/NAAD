//Program to Calculate Average Using Arrays

public class P06 {
    public static void main(String[] args) {
        int arr[] = {2,-10,0,33,100},sum=0;
        for (int i=0;i<5;i++)
             sum+=arr[i];
        float avg = sum/arr.length;
        System.out.println("The average of the numbers is: "+avg);
    }

}
