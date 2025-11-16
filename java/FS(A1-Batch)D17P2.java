/*
Mr.Short is a poet. He writes his poems in a special book. The specialty of 
the book is that it can only takes small letters. If he tries to write in 
large letter, it automatically changes to its equivalent small letter in the 
book. 
Given a string, your task is to help the book perform the conversion.

Note: Do not use string conversion functions.

Sample test case

input=PoeT
output=poet

*/
import java.util.*;

class d17p2{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String res = "";
        char ch;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                ch = (char)(s1.charAt(i)+32);
            }
            else{
                ch = (char)(s1.charAt(i));
            }
            res += ch;
        }
        System.out.print(res);
    }
}
