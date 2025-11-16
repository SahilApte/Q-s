/*
Return the pre-order tree traversal of N-ary tree. You are given the root of 
the tree.
Note: Use Recursive approach.

Input: root = [1,-1,3,2,4,-1,5,6]

       1
     / | \
    3  2  4
   / \
  5   6

Output: [1,3,5,6,2,4]

Solution.java
/*
class TreeNode
{
    int data;
    List<TreeNode> children = new ArrayList<>();

    TreeNode(int _data)
    {
        data = _data;
    }
}
*/

import java.util.*;
class Solution
{
    List<Integer> list = new LinkedList<>();
    public List<Integer> preOrder(TreeNode root)
    {
    if(root == null) return list;
        list.add(root.data);
        for(TreeNode child: root.children)
            preOrder(child);

    return list;
    }
}
