You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. 
Implement the function which returns 1 if given string str is 
valid password else 0.str is a valid password if it satisfies
the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number

Assumption:
Input string will not be empty.

Sample Testcase:
------------------------------
input=aA1_67
Output=1

Sample Testcase:
-------------------------------
input=a987 abC012
Output=0
import java.util.*;
    public class File
    {
        public static void main(String ar[])
        {//aA1_67
            Scanner sc= new Scanner(System.in);
            String[] s= sc.nextLine().split(" ");
            
            if(s.length>1)
            {
                System.out.println(0);
                return;
            }
            String s1 = s[0];
            if(s1.length()<=4)
            {
                System.out.println(0);
                return;
            }
            boolean small = false;
            boolean capital = false;
            boolean digit = false;
            for(int i=0;i<s1.length();i++)
            {
                char c = s1.charAt(i);
                if(c=='/')
                {
                    System.out.println(0);
                    return;
                }
                if(c>='a'&&c<='z')
                {
                    small=true;
                }
                else if(c>='A'&&c<='Z')
                {
                    capital = true;
                }
                else if(c>='0'&&c<='9')
                {
                    digit=true;
                }
            }
           if(!digit ||!small||!capital)
           {
               System.out.println(0);
               return;
           }
           System.out.println(1);
        }
    }
