/*
Given two strings s and t, return true if t is an anagram of s, and false 
otherwise. An Anagram is a word or phrase formed by rearranging the letters 
of a different word or phrase, typically using all the original letters exactly 
once.

Sample test case

case=1
input=dormitory dirtyroom
output=true
*/
import java.util.*;
class d46p3{
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        
        Map<Character,Integer>charCount = new HashMap<>();
        for(char c:s1.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            if(!charCount.containsKey(c)){
                return false;
            }
            charCount.put(c,charCount.get(c)-1);
            if(charCount.get(c)==0){
                charCount.remove(c);
            }
        }
        return charCount.isEmpty();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        in.close();
        boolean anagramCheck = isAnagram(s1,s2);
        System.out.println(anagramCheck);
        
    }
}
