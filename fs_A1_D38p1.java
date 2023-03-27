/*
James observes his kid Teddy play in the garden. In the middle of the garden 
is a slider , which has a few metallic steps to go up the slider. Teddy can 
take either one step or two steps to go up the slider. Given the number of 
steps on the slider, James wants to know the total number of ways Teddy can 
reach the top of the slider from the ground.

Sample test case
case=1
input=5
output=8
*/
import java.util.*;
class fs_A1_D38p1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(func(n));
    }
    public static int func(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }else {
            return func(n-2) + func(n-1);
        }
        
        //if(n<2)return 1;
        //return func(n-2) + func(n-1);
    }
}
