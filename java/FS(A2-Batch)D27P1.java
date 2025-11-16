/*Bunny is playing with binary strings. He wants to break
a binary string B into 3 parts, of length atleast '1',
when we merge the 3 parts will result the string B.

Your task is to find the count the various forms to break 
the Binary String B into 3 parts, where each part should 
contain equal number of 1's.


Input Format:
-------------
A string S.

Output Format:
--------------
Print an integer, count the various forms to break.


Sample Input-1:
---------------
01010010

Sample Output-1:
----------------
6

Explanation:
------------
There are six forms to break S into 3 parts 
where each part contain the equal number of  1's.
01 | 01 | 0010
01 | 010 | 010
01 | 0100 | 10
010 | 1 | 0010
010 | 10 | 010
010 | 100 | 10


Sample Input-2:
---------------
010010

Sample Output-2:
----------------
0
*/

import java.util.*;
public class FS(A2-Batch)D27P1
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    HashSet<String> map = new HashSet<>();
    int count = 0;
    for (int i = 0; i < s.length() - 2; i++) 
    {
      for (int j = i + 1; j < s.length() - 1; j++) 
      {
        String first = s.substring(0, i + 1);
        String second = s.substring(i + 1, j + 1);
        String third = s.substring(j + 1);
        if (countOnes(first) == countOnes(second) && countOnes(second) == countOnes(third)) 
        {
          String key = first + "|" + second + "|" + third;
          if (!map.contains(key)) 
          {
            map.add(key);
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
  public static int countOnes(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}
