public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2, int carry = 0) {

        if (l1 == null && l2 == null && carry == 0) return null;

    int val = (l1?.val ?? 0) + (l2?.val ?? 0) + carry;
    var node = new ListNode(val % 10);
    node.next = AddTwoNumbers(l1?.next, l2?.next, val / 10);
    return node;
    }
}