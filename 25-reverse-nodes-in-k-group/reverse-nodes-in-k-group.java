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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(k == 1)
            return head;
        int totNodes = 0 , node = 0 , stop = 0;
        boolean assignHead = true;
        ListNode temp = head , prevLeft = null , prev = null , left = null , after = null;

        while(temp != null)
        {
            totNodes++;
            temp = temp.next;
        }
        stop = (totNodes/k)*k;
        temp = head;
        while(temp != null)
        {
            ++node;
            if(node == stop+1)
                break;
            if(node%k == 1)
            {
                left = temp;
                prev = temp;
            }
            else if(node%k == 0)
            {
                if(assignHead)      /// Assiging the head to its real value after modifing the initial multipole of k nodes.
                {
                    head = temp; 
                    assignHead = false;
                }
                after = temp.next;
                temp.next = prev;
                prev = temp;    // reversing with-in multiple of k 

                left.next = after;
                if(prevLeft != null)
                    prevLeft.next = temp;
                temp = after;
                prevLeft = left;
                continue;
            }
            else
            {
                after = temp.next;
                temp.next = prev;
                prev = temp;    // reversing with-in multiple of k 
                temp = after;
                continue;
            }
            temp = temp.next;
        }
        return head;    
    }
}