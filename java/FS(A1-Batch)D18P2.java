/*
Rajiv is a project leader in UltraTech. He wants to enhance the technical skills 
of his team. He conducts a test to identify the skills that need improvement. 
The test consists of few words and the order for the characters. He asks his 
team to check if the words are arranged in sorted order (as in dictionary), and 
should follow the order given for each character. Given the test, it should 
return true if the words are sorted as per above rule, else return false. 
Your task is to help Rajiv in conducting the test.

Sample test case

input=habbit letout
hlabcdefgijkmnopqrstuvwzxy
output=true

*/
import java.util.*;
class d18p2{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        HashMap<Character,Integer> hmap = new HashMap<>();
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] str = s1.split(" ");
        int n = str.length;
        boolean ans = true;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<s2.length();i++){
            hmap.put(s2.charAt(i),i+1);
        }
        for(int j = 0;j<str.length-1;j++){
            String curr = str[j];
            String next = str[j+1];
            for(int k = 0;k<Math.min(curr.length(),next.length());k++){
                if(hmap.get(curr.charAt(k))>hmap.get(next.charAt(k))){
                    ans = false;
                }
                if(curr.length()>next.length()){
                    ans = false;
                }
            }
        }
        System.out.println(ans);
        //System.out.println(isSorted(str,s1));
        
}
/*
public static boolean isSorted(String arr[],String str){
    int[] orderSeq = new int[26];
    int seq = 0;
    for(char ch = 'a';ch<='z';ch++){
        char temp = str.charAt(seq);
        orderSeq[temp-'a'] = seq++;
    }
    for(int i=0;i<arr.length-1;i++){
        String curr = arr[i];
        String next = arr[i+1];
        int len = Math.min(curr.length(),next.length());
        for(int j = 0;j<len;j++){
            char curChar = curr.charAt(j);
            char nextChar = next.charAt(j);
            if(orderSeq[curChar-'a']>orderSeq[nextChar-'a']){
                return false;
            }
        }
        if(curr.length()>next.length()){
            return false;
        }
    }
    return true;
}
*/

}
