/*
Allen invents a machine which compares two inputs and provides result as true 
if both are same, false when they are not same. Each input is a collection of 
alphabets. His boss asks him to add a new feature to the machine. In case the 
inputs are not same, the new feature should allow the machine to interchange a 
character from two indices once and then perform the comparison. 
Your task is help Allen implement this feature.

Sample Testcase
case=1
input=2
one eno
output=true

*/
import java.util.*;
class test
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("input=");
        int inp=sc.nextInt();
        String s=sc.next();
        String s1=sc.next();
        int count=0;
        if(s.equals(s1))
        {
            System.out.println("true");
        }
        else
        {
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s.charAt(i)==s1.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count==s.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        }
    }
}
