//Write a function int totalWeight(String s, int[] weights)where :
//
//String s consists characters (A-E).
//int[] weights consists weights of characters A-E in the order A-E.
//Your task is to return the total weight of string s according to weights given.
//Example :
//
//        totalWeight("EEDBCCAB", [4, 3, 2, 1, 5]) = 25
//
//        { (1A = 4) + (2B = 6) + (2C = 4) + (1D = 1) + (2E = 10) = 25 }

import java.util.HashMap;
public class P12 {
    public static void main(String[] args) {

        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }
    public static int totalWeight(String s, int[] weights){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0;i<weights.length;i++){
            char ch = 'A';
            ch+=i;
            hashMap.put(ch,weights[i]);
        }
        int totalWeight = 0;
        for (int i=0;i<s.length();i++)
            totalWeight+=hashMap.get(s.charAt(i));

        return totalWeight;
    }
}
