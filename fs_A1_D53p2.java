/*
Tom is given a list of values. He constructs a binary tree using these values. 
He gives the root of the tree his friend Jerry and asks him to find out if the 
tree is a valid binary search tree (BST). Jerry has to return true if it is a 
valid binary search tree, else return false.
Your task is to help Jerry in his task.

Sample test case
case=1
input=3
3 2 4
output=true

       3  
     /   \
    2     4

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
    public boolean isBST(TreeNode root)
    {
        // Implement your code here
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public boolean isBSTUtil(TreeNode node, int min, int max){
        if(node == null){
            return true;
        }
        if(node.data<min || node.data >max){
            return false;
        }
        return (isBSTUtil(node.left,min,node.data-1)) && (isBSTUtil(node.right,node.data+1,max));
    }
}
