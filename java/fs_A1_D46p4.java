/*
Convert a decimal to binary through recursion. 

Sample test case
case=1
input=8
output=1000

*/
import java.util.*;
class d46p4{
    public static int conversion(int n){
        if(n==0){
            return 0;
        }
        return(n % 2 + 10 *conversion(n/2));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(conversion(n));
    }
}
