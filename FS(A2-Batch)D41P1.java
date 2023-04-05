In an institution there is a special keyboard.
It contains only one row of 26-keys, keys[]

The order of keys will be given, You need to findout the time taken to type a word.

The rules to find the time is as follows:
Initially you will be at first key .i.e, keys[0].
To type a character, you have to move to a key having desired character, key[j].
Time taken to type the character from key at ith index to key at jth index is |i - j|.

NOTE: You have to use only one finger to type the word.


Sample Testcase:
------------------------------------
input =abcdefghijklmnopqrstuvwxyz
code
output =26

Sample Testcase:
------------------------------------
input =qazwsxedcrfvtgbyhnujmikolp
confirmation
output =117
import java.util.*;
public class Keyboard
{
    public static void main(String ar[])
    {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),i);
        }
        int time =hm.get(s1.charAt(0));
        for(int i=0;i<s1.length()-1;i++)
        {
            if(hm.containsKey(s1.charAt(i)))
            {
                time+=Math.abs(hm.get(s1.charAt(i+1))-hm.get(s1.charAt(i)));
            }
        }
        System.out.println(time);
    }
}
