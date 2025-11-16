/*
Ram and Shyam are friends. Ram is good at multiplication, while Shyam is good 
at addition. Ranjit, their manager gives them a number and asks them to perform 
multiplication and addition respectively for each digit in the given number. 
Ranjit then finds the result by subtracting the result of addition from the 
result of multiplication. Your task is to help Ranjit compute the result.

case=1
input=782
output=95
*/
import java.util.*;

class d2p2{
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int add = 0, multi = 1 ;
        while(n>0){
            int res = n%10;
            add+=res;
            multi*=res;
            n = n/10;
        }
        System.out.println(multi-add);
    }
}
