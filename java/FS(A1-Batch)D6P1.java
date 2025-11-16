/*
Give the root of a Binary Tree, return the pre-order traversal of the tree.

Sample test case:
Input=1 2 3 -1 5 -1 7

      1
     / \
    2   3
     \   \
      5   7
      
Output=[1, 2, 5, 3, 7]

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
    public List<Integer> preOrder(TreeNode root)
    {
        //Implement Your Code here
    List<Integer> list = new ArrayList<>();
    if(root == null) return list;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
        TreeNode curr = stack.pop();
        list.add(curr.data);
        if(curr.right != null) stack.add(curr.right);
        if(curr.left != null) stack.add(curr.left);
    }
    return list;
    }
    }

