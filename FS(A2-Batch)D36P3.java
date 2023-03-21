Given a pointer to the head node of a linked list, the task is to reverse the 
linked list. We need to reverse the list by changing the links between nodes.

Sample TestCase:
-----------------------------------------
input=1->2->3->4->NULL 
output=4->3->2->1->NULL


Sample TestCase:
-----------------------------------------
input=NULL 
output=NULL

import java.util.*;
public class Laddu
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        Stack <Integer> stc= new Stack<>();
        String s[] = sc.nextLine().split("->");
        List<String> lst = new ArrayList<>();
        for(String s1:s)
        {
            if(s1!="NULL")
            {
            lst.add(s1);
            }
            // stc.push(Integer.parseInt(s1)
        }
        lst.remove(lst.size()-1);
        // lst.add(null);
        Collections.reverse(lst);
        for(int i=0;i<lst.size();i++)
        {
            System.out.print(lst.get(i));
            // if(i!=lst.size()-1)
            // {
                System.out.print("->");
            // }
        }
        System.out.print("NULL");
        
    }
}
