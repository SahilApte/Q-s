/*There is an heirarchy in the organization starting from level-1 to level-3.
Each level has got department with numbers.We need to move to each level 
and print all the department numbers in each level.
Sample input =1 2 3 4 5 6 7
       output=[[1], [2, 3], [4, 5, 6, 7]]
              
*/
import java.io.*;
import java.util.*;
import java.lang.*;

class Node {
  int data;
  Node left, right;

  public Node(int item) {
  data = item;
  left = right = null;
  }
}

class BFS {
  
  static  Node root;
  List <List<Integer>> bfs(Node root) {
				List<List<Integer>> output = new ArrayList<>();
				levelOrderHelper(output,root, 0);
				return output;
			}
		
    void levelOrderHelper(List<List<Integer>> output,Node root, int level) {
    Queue<Node> qu = new LinkedList<>();
    qu.add(root);
    while(!qu.isEmpty())
    {
        int count  = qu.size();
        List <Integer>lst = new ArrayList<>();
        while(count > 0)
        {
            Node curr = qu.remove();
            lst.add(curr.data);
            if(curr.left!=null)
            {
                qu.add(curr.left);
            }
            if(curr.right!=null)
            {
                qu.add(curr.right);
            }
            count--;
        }
        output.add(lst);
    
    
  }
}
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    Test tree = new Test();
    
    tree.root=new Node(sc.nextInt());
    tree.root.left = new Node(sc.nextInt());
    tree.root.right = new Node(sc.nextInt());
    tree.root.left.left = new Node(sc.nextInt());
    tree.root.left.right= new Node(sc.nextInt());
    tree.root.right.left = new Node(sc.nextInt());
    tree.root.right.right = new Node(sc.nextInt());
    System.out.println(tree.bfs(root));
  }
}
