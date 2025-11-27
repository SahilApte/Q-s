/*
Alan is given a list of values. He constructs a binary search tree using these 
values. He is also provided with a new value.  He gives the root of BST and the 
new value to his friend Peter and asks him to insert the new node in the BST. 
Peter has to return the root of the BST after the insertion. 
Your task is to help Peter in his task.

Sample test case
case=1
input=5
5 3 8 2 4
6
output=[5, 3, 8, 2, 4, 6]

       5                          5
     /   \                      /   \
    3     8         =>         3     8
   / \                        / \   /
  2   4                      2   4 6	


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
    public TreeNode insertNodeBST(TreeNode node, int k)
    {
        // Implement your code here
        if(node == null){
            node = new TreeNode(k);
            return node;
        }
        if(k<node.data){
            node.left = insertNodeBST(node.left,k);
        }else{
            node.right = insertNodeBST(node.right,k);
        }
        return node;
    }
}
