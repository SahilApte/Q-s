/*
Given a string return the occurrence of words in the string using HashMap. 

Sample test case
case=1
input=Alice is girl and Bob is boy
output= {Alice=1, is=2, girl=1, and=1, Bob=1, boy=1}

*/
import java.util.*;
class d45p1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Map<String, Integer> wordC = new LinkedHashMap<>();
        String[] words = s.split("\\s+");
        for(String word:words){
            wordC.put(word,wordC.getOrDefault(word,0)+1);
        }
        System.out.println(wordC);
    }
}
