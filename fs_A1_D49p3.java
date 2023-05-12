/*
David has two strings Sentence and Characters. He wants to find out whether he 
can make the Sentence by using the letters from Characters. Each letter from 
Characters can only be used once in Sentence. Return true if he can make the 
Sentence, other wise return false. Your task is to help David in his task. 

Sample test case
case=1
input=bb
bbc
output=true
*/
import java.util.*;
class d49p3{
    public static boolean check(String s1,String s2){
    int[] charCount = new int[26];
    for(int i=0;i<s2.length();i++){
        charCount[s2.charAt(i) - 'a']++;
    }
    for(int i=0;i<s1.length();i++){
        if(--charCount[s1.charAt(i) - 'a']<0){
            return false;
        }
    }
    return true;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String senten = in.nextLine();
        String charac = in.nextLine();
        System.out.print(check(senten,charac));
    }
}
