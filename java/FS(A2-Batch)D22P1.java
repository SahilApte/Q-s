/*Given a sequence of keys representing the preorder sequence 
of a binary search tree (BST), construct a BST from it.And 
traverse the tree in inorder sequence and print.

Sample TestCase:
----------------------------
Input:
-------------
7
15 10 8 12 20 16 25 
output:
-------------
8 10 12 15 16 20 25*/
import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int key){
        this.key=key;
    }
}
public class FS(A2-Batch)D22P1{
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }
    public static Node constructBT(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        Node node=new Node(preorder[start]);
        int i;
        for(i=start;i<=end;i++){
            if(preorder[i]>node.key){
                break;
            }
        }
        node.left=constructBT(preorder,start+1,i-1);
        node.right=constructBT(preorder,i,end);
        return node;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] preorder=new int[n];
        for(int i=0;i<n;i++){
            preorder[i]=sc.nextInt();
        }
        Node root=constructBT(preorder,0,preorder.length-1);
        inorder(root);
    }
}
