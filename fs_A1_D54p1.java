/*
Peter is given a list of values. He constructs a binary search tree using these 
values. He is also provided with a target value.  He gives the root of binary 
search tree and the target value to his friend Jerry and asks if there exist 
two elements in the binary search tree such that their sum is equal to the 
target value. If such two nodes are found, Jerry has to return true, else return 
false. Your task is to help Jerry in his task.

Sample test case
case=1
input=7
8 4 10 2 5 -1 11
7
output=true

       8  
     /   \ 
    4     10
   / \      \ 
  2   5      11

Solution.java

class TreeNode
{
    public int data;
    public TreeNode left, right;
    public TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

import java.util.*;
class Solution
{
    public boolean findTarget(TreeNode node, int k)
    {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(node, values);
        int left = 0, right = values.size() - 1;
        while (left < right) {
            int sum = values.get(left) + values.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    
    private void inorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, values);
        values.add(node.data);
        inorderTraversal(node.right, values);
    }
}
