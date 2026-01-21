/*
Adam is given the root of a binary tree and an integer target. He asks his 
friend Joe to find whether the tree has path from root to a leaf such that 
adding up all the values along the path equals the target. He has to return 
true if there is a path, else return false. 
Your task is to help Joe in his task.

Sample test case
case=1
input=3
1 2 4
3
output=true

       1            
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
    public boolean sum(TreeNode node, int sum)
    {
        // Implement your code here
        if(node == null) return false;
        // if(node == null && sum==0)return true;
        // if(node == null && sum!=0)return false;
        if(node.data == sum) return true;
        /*if(node.left == null || node.right == null || sum - node.data == 0){
            return true;
        }*/
        return sum(node.left, sum - node.data) || sum(node.right, sum - node.data);
    }

}
