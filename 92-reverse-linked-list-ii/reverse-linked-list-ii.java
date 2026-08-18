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
class Solution 
{
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(left == right)
            return head;
        
        int node = 0 ;
        ListNode prevLeft = null , temp = head , prev = null , after = null , LEFT = null;
        boolean flag = false;

        while(node <= right)
        {
            node++;
            if(node == left-1)
            {
                prevLeft = temp;
                LEFT = temp.next;
            }
            if(node == left)
            {
                LEFT = temp;
                flag = true;
            }
            if(node == right)
            {
                break;
            }
            if(flag)
            {
                if(prev == null)
                    prev = temp;
                else
                {
                    after = temp.next;
                    temp.next = prev;
                    prev = temp;
                    temp = after;
                    continue;
                }
            }
            temp = temp.next;
        }
        if(left == 1)
            head = temp;
        LEFT.next = temp.next;
        temp.next = prev;
        if(prevLeft != null)
            prevLeft.next = temp;

        return head;
    }
}