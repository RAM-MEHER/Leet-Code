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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode temp1 = list1 ;
        ListNode temp2 = list2;
        ListNode temp = null;
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode ans , realAns;
        if(list1.val <= list2.val)
        {
            realAns = list1;
            ans = list1;
            temp1 = ans.next;
        }
        else 
        {
            realAns = list2;
            ans = list2;
            temp2 = ans.next;
        }
        while(temp1 != null && temp2 != null)
        {
            if(temp1.val <= temp2.val)
            {
                temp = temp1.next;
                ans.next = temp1;
                temp1 = temp;
            }
            else
            {
                temp = temp2.next;
                ans.next = temp2;
                temp2 = temp;
            }
            ans = ans.next;
        }    
        while(temp1 != null)
        {
            ans.next = temp1;
            ans = temp1 ; 
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            ans.next = temp2;
            ans = temp2;
            temp2 = temp2.next;
        }
        return realAns;
    }
}