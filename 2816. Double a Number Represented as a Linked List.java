/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        List<Integer> num = new ArrayList<Integer>();
        ListNode curr = head;

        while (curr != null) {
            num.add(curr.val);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        int carry = 0;

        for (int i = num.size() - 1; i >= 0; i--) {
            int sum = num.get(i) * 2 + carry;
            ListNode node = new ListNode(sum % 10);
            prev.next = node;
            prev = node;
            carry = sum / 10;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            prev.next = node;
            prev = node;
        }
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, forw = null;
        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}