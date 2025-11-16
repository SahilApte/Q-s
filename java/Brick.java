import java.io.*;
import java.util.*;
public class Brick
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
            System.out.println("true");
        if(a%2!=0)
            System.out.println("false");
    }
}
