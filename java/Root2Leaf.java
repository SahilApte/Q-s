Given the root of a binary tree, return all root-to-leaf paths
in any order.

A leaf is a node with no children.

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
import java.util.*;
   /* class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }*/




class Solution
{
public static List<String> binaryTreePaths(Node root)
{
    List<String>  lst= new ArrayList<>();
   if(root!=null)
        {traverse(root," ",lst);
    }
    return lst;
}
public static void traverse(Node node,String path,List<String> paths)
{
    path+=node.data;
    if(node.left == null && node.right ==null)
    {
        paths.add(path);
    }
    else
    {
        path+="->";
        if(node.left!=null)
        {
            traverse(node.left,path,paths);
        }
        if(node.right!=null)
        {
            traverse(node.right,path,paths);
        }
    }
}
}
   
