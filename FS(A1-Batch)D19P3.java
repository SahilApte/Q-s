/*
Peter wants to rise in the organization’s hierarchy to the top position. 
Currently he is at the least position in the hierarchy. Given the top position 
of the organization’s hierarchy as root of a binary tree, return how for away 
is Peter’s position in the organization.

Sample test case1:
Input=

      1
     / \
    2   3
         \
          7
      
Output=3

Sample test case2:
Input=
	    1
       / \
      2   3

Output=2

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
    List<Integer> res = new ArrayList<>();
  public int maximumDepth(TreeNode root) {
        
        //Implement Your Code here
        /*
        List<Integer> al = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int flag = -1;
        while(!stack.isEmpty()){
        TreeNode temp = stack.pop();
            al.add(temp.data);
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
            flag++;
        }
        return flag;
        */
        int count = 0;
        TreeNode curr = root;
        if(curr!=null){
            res.add(curr.data);
            count++;
            
        }
  }
}
