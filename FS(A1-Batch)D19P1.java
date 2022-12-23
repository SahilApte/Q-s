/*
Johnny inherits 10 million dollars’ worth of gold from his father. He hides this 
fortune at a location and prepares few clues which leads to the location. 
Starting from his house, the clues are spread across several different locations. 
To ensure he remembers all these locations, he uses google map at each location 
which will tells the next location of the clue. To get the fortune, the clues 
have to be arranged in the same order of visiting each location, the value so 
obtained will be a binary number. The decimal equivalent of this binary number 
is the location of the fortune. The clues are arranged using a linked list. 
Given the start location as head of linked list, your task is to find the fortune. 

Sample test case

case=1
input=1(head) -> 1 -> 0
output=6

case=2
input=1(head) -> 1 -> 1 -> 1
output=15


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
    public int getFortune(ListNode head) 
    {
        //Implement Your Code here
        /*
        String s = "";
        ListNode temp = head;
        while(temp!=null){
            s+=""+temp.val;
            temp = temp.next;
        }
        int res = Integer.parseInt(s,2);
        return res;
        */
        /*
        ListNode temp = head;
        int num = temp.val;
        List<Integer> res = new ArrayList<>();
        while(temp.next!=null){
            num = num<<1 | temp.next.val;
            temp = temp.next;
        }
        */
        int fortune = 0;
        ListNode current = head;
        int exponent =0;
        while(current!=null){
            fortune+=current.val*Math.pow(2,exponent);
            exponent++;
            current = current.next;
        }
        return fortune;
    }
}
