import java.util.*;
class Clock
{
    public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    String [] s = sc.nextLine().split(":");
    String s1 = s[0];
    String s2 = s[1];
    char h1 = s1.charAt(0);
    char h2 = s1.charAt(1);
    char h3 = s2.charAt(0);
    char h4 = s2.charAt(1);
    int count =1;
    if((h1=='#') && (h2=='#'))
    {
        count*=24;
    }
    else if(h1=='#')
    {
        if(h2<='3')
        {
            count *=3;
        }
        else if(h2>'3')
        {
            count *=2;
        }
    }
    else if((h2)=='#')
    {
        if(h1<='1')
        {
            count *=10;
        }
        else if(h1=='2')
        {
            count *=5;
        }
    }
    if((h3 == '#') && (h4=='#'))
    {
        count *=60;
    }
    else if(h3 =='#')
    {
        count *=6;
    }
    else if(h4 =='#')
    {
        count *=10;
    }
System.out.println(count);
}
}
