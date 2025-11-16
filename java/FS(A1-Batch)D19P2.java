/*
Raj set up lighting for Christmas celebrations. The lighting bulbs are arranged 
in a sequence, each bulb is marked by a unique number and represented in the 
form of a linked list. Given a list of bulbs (root node of the linked list), 
your task is to help Raj find the bulb which is at the middle of the list. If 
there are two bulbs at the middle, return the latter one. 

Sample test case

case=1
input=1(head) -> 2 -> 5 -> 6 -> 8
output=5

case=2
input=1(head) -> 3 -> 4 -> 7 -> 8 ->9
output=7

class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

*/
import java.util.*;
class Solution
{
    public void centreNode(ListNode head) {

        //Implement Your Code here/*
        /*
        List<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp =  temp.next;
        }
        int res = al.size()/2;
        System.out.println(al.get(res));
        */
        //Two Pointer method(slow-fast method)
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        
    }
}
