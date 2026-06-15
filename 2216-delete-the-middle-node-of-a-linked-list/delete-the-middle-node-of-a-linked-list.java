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
    public ListNode deleteMiddle(ListNode head) 
    {
        int count = 0;
        ListNode temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        count = (count/2)+1;
        temp = head;
        if(count == 1)
            return null;
        while(temp != null)
        {
            if(count == 2)
            {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count--;
        }
        return head;
    }
}