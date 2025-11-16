/*
John give a test to his students. He gives them a string and tell them to find 
the index of the first non-repeating character. If there are no non-repeating 
character then they should return -1. Your task is to help the students in 
their task.

Sample test case
case=1
input=abbcdeb
output=0

*/
import java.util.*;
class d49p2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c) == 1){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
