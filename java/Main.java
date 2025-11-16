import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    
	public static void main(String[] args) {
	    int summ =0,pos=0;
		Scanner sc = new Scanner(System.in);
		String kbr = sc.next();
		String wd = sc.next();
		
		for(int i =0;i<wd.length();i++)
		{
		   
		    int spos=kbr.indexOf(wd.charAt(i));
		    summ = summ + Math.abs(pos-spos);
		    pos = spos;
		}
		System.out.println(summ);
	}
}
