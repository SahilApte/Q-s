Given a binary tree, determine if it is height-balanced.

 

Sample Testcase:
-------------------------------------------
input=3,9,20,-1,-1,15,7
output=true

Sample Testcase:
-------------------------------------------
input=1,2,2,3,3,-1,-1,4,4]
Output=false

Sample Testcase:
-------------------------------------------
input=[]
output=true
 import java.util.*;
public class Solution
{
    public int count(Node p)
    {
        int count =1;
        if(p==null)
        {
            return count;
        }
        return count(p.left)+count(p.right);
    }
    public boolean isBalanced(Node p)
    {
        return ((count(p.left)-count(p.right))>1?false:true);
    }
}
