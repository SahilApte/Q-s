/*
You are given a tree, Print in a zigzag manner as given below.


Input
3 9 20 -1 -1 15 7
Expected output
3
20 9
15 7
---------------------
Input
2 8 19 -1 -1 14 6
Expected output
2
19 8
14 6
------------------
Input
3 9 20 8 5 -1 -1
Expected output
3
20 9
8 5

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

class Zigzag {
 static  Node root;

 public List<List<Integer>> bfsZigzag(Node root) {
     //Write your code here...
     List<List<Integer>> output=new ArrayList<>();
     Queue<Node> qu=new ArrayDeque<>();
     int level=0;
     qu.add(root);
     while(!qu.isEmpty())
     {
         int n=qu.size();
         List<Integer> ls=new ArrayList<>();
         while(n!=0)
         {
             Node curr=qu.remove();
             if(curr.data!=-1)
             {
             ls.add(curr.data);
             }
             if(curr.left!=null)
             {
                 qu.add(curr.left);
             }
             if(curr.right!=null)
             {
                 qu.add(curr.right);
             }
             n--;
         }
         if(level%2!=0)
         {
             Collections.reverse(ls);
         }
         level++;
         output.add(ls);
     }
     
     return(output);






    }
  
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    // create an object of BinaryTree
    Test tree = new Test();
    tree.root=new Node(sc.nextInt());

    // create nodes of the tree
    //tree.root = new Node(1);
    tree.root.left = new Node(sc.nextInt());
    tree.root.right = new Node(sc.nextInt());
    tree.root.left.left = new Node(sc.nextInt());
    tree.root.left.right= new Node(sc.nextInt());
    tree.root.right.left = new Node(sc.nextInt());
    tree.root.right.right = new Node(sc.nextInt());
    System.out.println(tree.bfsZigzag(root));
   // System.out.println(root);

    // System.out.print("\nBinary Tree: ");
    // tree.traverseTree(tree.root);
  }
}

















