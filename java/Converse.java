import java.util.*;
class Converse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= Integer.toBinaryString(n);
        int size = s.length();
        boolean flag = false;
        for(int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
            {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
}}
