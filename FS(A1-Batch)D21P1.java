/*
Given the hierarchy of MegaTech company in the form of a binary tree, Ranjan, 
the CEO, wants to find the employees who are the left child and at the lowest
level. He wants to add the values associated with these nodes and return the 
sum. Given the top position of the organization’s hierarchy as root of a binary 
tree, your task is to help Ranjan in his task. 

Sample test case1
Input: 
        3
       / \
      9  20
        /  \
       15   7

Output: 24

Sample test case2

Input: 
          3
           \
            20

Output: 0

Sample test case

case=1
input=3 9 20 -1 -1 15 7
output=24

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
    public int sumOfLeftLeaves(TreeNode root)
    {
        //Implement Your Code here
        /*
        if(root == null) return 0;
        if(root.left!=null && root.left.left == null && root.left.right == null){
            return root.left.data + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        */
        Stack<TreeNode> stack = new Stack<>();
        //List<Integer> al = new ArrayList<>();
        stack.add(root);
        int sum = 0;
        if(root == null)return 0;
        while(!stack.isEmpty()){
            TreeNode s = stack.pop();
            if(s.left!=null){
                stack.push(s.left);
                sum = sum + s.left.data;
            }
            if(s.right!=null) stack.push(s.right);
        }
        return sum;
    }
}
