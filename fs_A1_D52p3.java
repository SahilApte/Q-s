/*
James is given a list of values. He constructs a binary search tree using these 
values. He is also provided with a target value.  He gives the root of BST and 
the target value to his friend Mark and asks if the BST has a node whose value 
equals to the target. If such a node is found, Mark has to return the subtree 
rooted with that node. If such node does not exist then he has to return null. 
Your task is to help James in his task.

Sample test case
case=1
input=5
5 3 8 2 4
3
output=[3, 2, 4]

       5 
     /   \
    3     8         =>         3 
   / \                        / \ 
  2   4                      2   4

*/

// Solution.java

// class TreeNode
// {
//     public int data;
//     public TreeNode left, right;
//     public TreeNode(int data)
//     {
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }
//*/
import java.util.*;
class Solution
{
    public TreeNode search(TreeNode node, int k)
    {
        // Implement your code here
        if(node == null)return null;
        if(node.data == k) return node;
        if(node.right.data == k) return node.right;
        return node.left;
    }
}
