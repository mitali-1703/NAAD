//Write a function String modify(String s, String replacements)where :
//
//String s consists of digits (0-9).
//String replacements consists pairs of < int, char >.
//Your task is to form a new string such that each digit in s is replaced
// by its corresponding character as given in replacements string.
//Example :
//
//        modify("12332321", "2R3S1T4D") = "TRSSRSRT"

public class P11 {
    public static void main(String[] args) {

        System.out.println(modify("12332321", "2R3S1T4D"));
    }
    public static String modify(String s,String replacements){

        StringBuilder sb = new StringBuilder();

            for(int i=0;i<s.length();i++){

                for (int j=0;j<replacements.length();j++){

                    if(s.charAt(i)==replacements.charAt(j)){

                        char ch = replacements.charAt(j+i);
                        sb.append(ch);

                    }
                }
            }
            return sb.toString();
    }
}
