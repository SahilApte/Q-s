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
public class Hi
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.valueOf(s[i]);
        }
        int n = arr.length;
   
        for(int i = 0;i<=n-k;i++)
        {
            int curr =0;
            for(int j=0;j<k;j++)
            {
                curr = Math.max(curr,arr[i+j]);
            }
            lst.add(curr);
        }
  
        System.out.println(lst);
       
        
    }
}
