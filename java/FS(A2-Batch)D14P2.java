/*D-Mart Online Shopping portal is giving a buy-2 get-1 free discount.
There are various categories of goods and the offer is valid on a group of items
if they belong to the same category.

    -All items in the same category are priced equal.
    -If you buy 3 items of category A, you pay only for 2 items. 
    -if you buy 2 items of category A and 1 of category B,
        you pay for all 3 items. 
        
Given the categories for various items in your shopping cart and 
the price for each category,calculate the total price that you will have to pay.

Input Format:
-----------------------------
Line-1:- will be a string comprising of only alphabets (only upper case)
Each character represents a category in the shop. 
Line-2:- will contain a space separated list of 26 integers where 1st integer
is price for category A, 
2nd integer is price for category B and 26th integer is price for category Z.

Output Format:
------------------------------
For each test case, print on a single line the price that the customer will 
have to pay.

Sample TestCase:
----------------------------------------
input
---------------
ABAAABBCDEZDF
1 2 3 3 2 1 4 7 9 10 11 13 12 1 1 4 5 6 7 8 9 10 2 11 14 15

output
-----------------
34

Explanation :-
A B C D E F G H I J  K  L  M  N O P Q R S T U V  W X  Y  Z
1 2 3 3 2 1 4 7 9 10 11 13 12 1 1 4 5 6 7 8 9 10 2 11 14 15

in the above input we have the frequency count of category as follows

      I * P  =  Amount
A-4 - 3 * 1  =   3
B-3 - 2 * 2  =   4
C-1 - 1 * 3  =   3
D-2 - 2 * 3  =   6
E-1 - 1 * 2  =   2
F-1 - 1 * 1  =   1
Z-1 - 1 * 15 =  15
                -----
       Total  =  34

if we buy two items we get one item free, so in 4 items of Category-A 
we have to bill only for 3 items for Category B we have to bill only for 2 items. 

In the above frequency I represents the Number of Items for each Category and P
represent the cost if we sum all of them we get the total price to be paid by
the customer.

Sample TestCase:
----------------------------------------
input
---------------
ZABCDBCADZZZRRRTTURTUTRASDERF
17 5 3 3 2 1 4 7 19 10 1 3 2 1 1 4 5 6 7 8 9 1 2 1 4 12

output
-----------------
168

Explanation :-
A  B C D E F G H I  J  K L M N O P Q R S T U V W X Y Z
17 5 3 3 2 1 4 7 19 10 1 3 2 1 1 4 5 6 7 8 9 1 2 1 4 12

in the above input we have the frequency count of category as follows
      C *  P    AMOUNT
Z-4 - 3 * 12  =  36
A-3 - 2 * 17  =  34
B-2 - 2 *  5  =  10
C-2 - 2 *  3  =   6
D-3 - 2 *  3  =   6
R-6 - 4 *  6  =  24
T-4 - 3 *  8  =  24
U-2 - 2 *  9  =  18
S-1 - 1 *  7  =   7
E-1 - 1 *  2  =   2 
F-1 - 1 *  1  =   1
       TOTAL  = 168

*/

import java.util.*;
public class FS(A2-Batch)D14P2
{
    public static void main(String args[])
    {
        HashMap<Character,Integer> cost = new HashMap<>();
        HashMap<Character,Integer> count = new HashMap<>();
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] sr = sc.nextLine().split(" ");
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        ArrayList<Character> arr = new ArrayList<>(hs);
        for(int i=0;i<sr.length;i++)
        {
            cost.put((char)(65+i),Integer.parseInt(sr[i]));
        }
        // System.out.println(cost);
        for(int i=0;i<s.length();i++)
        {
            if(count.containsKey(s.charAt(i)))
            {
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
            else
            {
                count.put(s.charAt(i),1);
            }
        }
        int sum =0;
        int amount =0;
        for(int i=0;i<arr.size();i++)
        {
            amount = (count.get(arr.get(i))-count.get(arr.get(i))/3)*cost.get(arr.get(i));
            sum += amount;
            amount =0;
        }
        System.out.println(sum);
        
    }
}
