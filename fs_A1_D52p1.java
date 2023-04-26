/*
Peter is given the root of a binary tree. He wants to invert the tree 
i.e., a tree with root r, and subtrees right and left, is a tree with root r, 
whose right subtree is the inverse of left and whose left subtree is the 
inverse of the right. After inverse, return the root. 
Your task is to help Peter in his task.

Sample test case

       1                          1
     /   \                      /   \
    2     3         =>         3     2
   / \   / \                  / \   / \
  4   5 6   7                7   6 5   4	


case=1
input=7
1 2 3 4 5 6 7
output=[1, 3, 2, 7, 6, 5, 4]

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
    public TreeNode Inverse(TreeNode node)
    {
        // Implement your code here
        dfs(node);
        return node;
    }
    public void dfs(TreeNode node){
        if(node == null) 
        {
            return;
        }
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
        dfs(node.right);
        dfs(node.left);
    }
}
