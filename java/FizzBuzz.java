/*Write a program that prints the numbers from 1 to n and for multiples of '3' print "Fizz" 
instead of the number, for the multiples of '5' print "Buzz" and 
for multiples of '15' print FizzBuzz.

Sample Testcases:
------------------------
input:16
output=                                                                                                                      
1                                                                                                                       
2                                                                                                                       
Fizz                                                                                                                    
4                                                                                                                       
Buzz                                                                                                                    
Fizz                                                                                                                    
7                                                                                                                       
8                                                                                                                       
Fizz                                                                                                                    
Buzz                                                                                                                    
11                                                                                                                      
Fizz                                                                                                                    
13                                                                                                                      
14                                                                                                                      
FizzBuzz                                                                                                                
16                                                                                                                      
*/


*/
  import java.util.*;
public class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
                if(i%15==0)
                {
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0)
                {
                    System.out.println("Fizz");
                }
                else if(i%5==0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }
            }
    }
}
