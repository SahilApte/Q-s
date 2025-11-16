Three Friends are given three rows of the keyboard, The first row is given to
Shyam,second row is given to gopal, third row is given to ramu. 

Teacher has given them few lines of words and asked each individual if they
can print the words that can be printed using the letters of the rows given 
to them 

Shyam has given the row -   QWERTYUIOP/qwertyuiop
Gopal has given the row -    ASDFGHIJKL/asdfghjkl
Ramu has given the row -   ZXCVBNM/zxcvbnm

Teacher also gave the following rules in addition ;
    You may use one character in the row more than once.
    You may assume the input string will only contain letters of 
    alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 

    Print -1 for all Boundary Conditions 
    
Sample Testcase:
------------------------------------

input =hello Alaska Dad Peace
output = 
Alaska 
Dad

Here the words Alaska and Dad are the characters of second student gopal only 

Sample Testcase:
------------------------------------
input =asdf qwer zxcv
output =
asdf
qwer
zxcv

Sample Testcase:
------------------------------------
input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO
import java.util.*;
public class Friends
{
  public static void main (String ar[])
  {

    Scanner sc = new Scanner (System.in);
    String S = "qwertyuiop";
    String G = "asdfghjkl";
    String R = "zxcvbnm";

      String[] s = sc.nextLine ().split (" ");
      ArrayList < String > lst = new ArrayList <> ();

    for (String word:s)
      {
	int scnt = 0;
	int gcnt = 0;
	int rcnt = 0;
	for (char c:word.toCharArray ())
	  {
	    if (S.contains (Character.toString (Character.toLowerCase (c))))
	      {
		scnt++;
	      }
	    if (G.contains (Character.toString (Character.toLowerCase (c))))
	      {
		gcnt++;
	      }
	    if (R.contains (Character.toString (Character.toLowerCase (c))))
	      {
		rcnt++;
	      }
	  }
	int len = word.length ();
	if (len == scnt || len == gcnt || len == rcnt)
	  {
	    lst.add (word);
	  }
      }

    if (lst.isEmpty ())
      {
	System.out.println ("-1");
      }
    else
      {
      for (String word:lst)
	  {
	    System.out.println (word);
	  }
      }

  }
}
