Mohith and Rohith are good friends, They are used to chat very often.
Mohith is lazy to type the complete word, so he find a way to shorten the words.
For example,if the original word is "banana", he type it as "ba2[na]".

Can you help Rohith, to find the original word from the shorten word he 
received from Mohith .

NOTE: You may assume that the input string is always valid and does not 
contain any digits. No white spaces, brackets are well-formed.

Sample Testcase:
----------------------------------
Input:	  ba2[na]
Output: banana

Sample Testcase:
----------------------------------
Input:     2[takita]
Output:  takitatakita

import java.util.*;
public class Prg {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stc = new Stack<>();
        Stack<Integer> numstc = new Stack<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                numstc.push(num);
            } else if (c != ']') {
                stc.push(c);
            } else {
                String s1 = "";
                while (stc.peek() != '[') {
                    s1 = stc.pop() + s1;
                }
                stc.pop(); 
                int kus = numstc.pop();
                String s2 = "";
                for (int j = 0; j < kus; j++) {
                    s2 += s1;
                }
                for (int k = 0; k < s2.length(); k++) {
                    stc.push(s2.charAt(k));
                }
            }
        }
        String ans ="";
        while (!stc.empty()) {
            ans = stc.pop()+ans;
        }
        System.out.println(ans);
    }
}
