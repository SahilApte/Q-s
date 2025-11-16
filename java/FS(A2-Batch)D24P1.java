/*Construct BST and count the total number of nodes that lie within a given range.
Input Format:
-----------------------
Line:1 Size of 'N'
Line:2 N array elements
Line:3 Ranges 'R1' and 'R2'

Sample TestCase:
---------------------------
input
---------------
11
15 25 20 22 30 18 10 8 9 12 6
12
20

output:
----------------
4

Explanation:the total number of nodes in range 12 20 is 4.
The nodes are 12, 15, 18, and 20.*/
import java.util.*;
class Node
{
    int data;
    Node left=null;
    Node right=null;
    Node(int key)
    {
        data=key;
    }
}
class FS(A2-Batch)D24P1
{
    public static Node create(int[]arr,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        Node node=new Node(arr[s]);
        int i;
        for(i=s;i<=e;i++)
        {
            if(arr[i]>node.data) break;
        }
    
        node.left=create(arr,s+1,i-1);
        node.right=create(arr,i,e);
        return node;
    }
    public static int count(Node node,int c,int l,int h)
    {
        if(node==null) return c;
        if(node.data<=h && node.data>=l)
        {
            c++;
        }
        c=count(node.left,c,l,h);
        c=count(node.right,c,l,h);
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int h=sc.nextInt();
        Node root =create(arr,0,n-1);
        System.out.print(count(root,0,l,h));
        
    }
}
