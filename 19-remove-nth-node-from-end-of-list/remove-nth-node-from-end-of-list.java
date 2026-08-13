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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null)
            return head;
        
        int nodes = 0 , pos = 0;
        ListNode temp = head , prev = null;
        while(temp != null)
        {
            nodes++;
            temp = temp.next;
        }
        if(nodes == 1)
            return null;
        temp = head;
        while(temp != null)
        {
            pos++;
            if(pos == nodes-n+1)
            {
                if(prev == null)
                {
                    head = temp.next;
                    break;
                }
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}