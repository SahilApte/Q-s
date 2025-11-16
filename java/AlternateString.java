You are merging data from two sources connected to a network access 
point to create a new data packet. 

You must merge strings a and b, and the return a single merged string. 
A merge operation on two strings is described as follows.

Append alternating characters from a and b, respectively, to some new 
string mergedString.
Once all of the characters in one of the strings have been merged, 
append the remaining characters in the other string to mergedString.

As an example, assume you have two strings to merge : 'abc' and 'stuvwx'. 
Alternate between the first and second strings as long as you can :

'a' + 's'+'b'+'t'+'c' +'u'. At this point you have traversed the first string 
and have generated 'asbtcu'. 
The remainder of the second string ,'vwx' is now added to the end of 
the string, creating 'asbtcuvwx'.

Sample Testcase:
----------------------------------
input=kmit
ngit
output=
knmgiitt

Sample Testcase:
----------------------------------
input=aceg ikmo
bdfh jlnp
output="abcdefgh  ijklmnop"


import java.util.*;

public class Sfff {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        int a = s.length();
        int b = s1.length();
        String res = "";
        int i =0;
        int j= 0;
        while(i<a&&j<b)
        {
            res+=s.charAt(i++);
            res+=s1.charAt(j++);
        }
        while(i<a)
        {
            res+=s.charAt(i++);
        }
        while(j<b)
        {
            res+=s1.charAt(j++);
        }
        System.out.println(res);
    }
}
