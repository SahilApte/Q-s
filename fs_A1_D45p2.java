/*
Mark gives his student Andrew a string and ask him to find a sub-string that 
is the longest that can be found without any repeating characters. Your task 
is to help Andrew in his task.

Sample test case
case=1
input=bcabcacc
output=3

*/
import java.util.*;
class d45p2{
    public static int distinct(String str){
        int n = str.length();
        Set<Character> hs = new HashSet<>();
        int res = 0,i=0,j=0;
        while(i<n && j<n){
            if(!hs.contains(str.charAt(j))){
            hs.add(str.charAt(j++));
            res = Math.max(res,j-i);
        }
        else{
            hs.remove(str.charAt(i++));
        }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(distinct(s));
    }
}
