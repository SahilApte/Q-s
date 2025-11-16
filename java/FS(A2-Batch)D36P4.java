In the kingdom of Akbar, Birbal was one of the most intelligent persons in the
kingdom. One day Akbar called Birbal and gave a challenge to prove his intelligence.

The challenge for Birbal was to circumvent N villages of a district in a state. 
Every village in a district is numbered from 0 to n-1. Between any two villages,
at strategic locations, some check posts were created and soldiers were stationed.
During the journey from one village to another, Birbal must tender one gold coin
at every check post. If he doesn’t tender a gold coin at any of the check posts 
then his journey ends and will be killed.

At the beginning, Birbal is presented with information about the number of 
gold coins that a village is allocated and the number of check posts with 
its neighboring village.

So, now write a program for Birbal to read the information of villages and 
locate the village from where he can begin his journey and return to the same
village without getting killed.


Sample Testcase:
----------------------------------
input=3
1 5
10 3
3 4
output=1

Explanation :
------------------------------------------

First Line (3) – represents the total villages that must be covered.

Second Line (1 5)
o First Village (id-0).
o (1) - Number of gold coins. (5) - Number of check posts.

Third Line (10 3)
o Second Village (id-1).
o (10)- Number of gold coins. (3)-Number of check-posts.

Fourth Line (3 4)
o Third village (id-2).
o (3)-Number of Gold Coins. (4)-Number of check-posts.

Output (1) means, Birbal must start his journey from second village in order
to visit all villages and come back without getting killed.

Note : If No Solution then print  -1 No Solution

Sample Testcase:
-------------------------------------
input=3
5 10
2 8
3 7
output=-1
import java.util.*;

public class PO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] goldCoins = new int[n];
        int[] checkPosts = new int[n];
        int goldSum =0;
        int postSum =0;
        for (int i = 0; i < n; i++) {
            goldCoins[i] = sc.nextInt();
            checkPosts[i] = sc.nextInt();
            goldSum+=goldCoins[i];
            postSum+=checkPosts[i];
        }
        if(goldSum<postSum)
        {
            System.out.println(-1);
            return;
        }
        int startVillage = -1;
        int currentGoldCoins = 0;
        for (int i = 0; i < n; i++) {
            currentGoldCoins += goldCoins[i] - checkPosts[i];
            if (currentGoldCoins < 0) {
                startVillage = i;
                currentGoldCoins = 0;
            }
        }
        System.out.println(startVillage + 1);
    }
}
