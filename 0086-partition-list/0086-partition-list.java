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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        
        ListNode smaller_list = new ListNode(-1);
        ListNode larger_list = new ListNode(-1);
        ListNode curr = head, s_ptr = smaller_list, g_ptr = larger_list;
        while(curr != null){
            ListNode frw = curr.next;
            if(curr.val < x){
                curr.next = null;
                s_ptr.next = curr;
                s_ptr = s_ptr.next;
            }else{
                 curr.next = null;
                g_ptr.next = curr;
                g_ptr = g_ptr.next;
            }

            curr = frw;

        }

        s_ptr.next = larger_list.next;
        return smaller_list.next;
    }
}