/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        Node ans = null , temp = null;
        HashMap<Node , Node> map = new HashMap<>();

        while(head != null)
        {
            if(ans == null)
            {
                ans = new Node(head.val);
                temp = ans;
            }
            else
            {
                temp.next = new Node(head.val);
                temp = temp.next;
            }
            map.put(head , temp);
            temp.next = head.next;
            head = head.next;
        }
        for(Map.Entry<Node,Node> entry : map.entrySet())
        {
            if(entry.getKey().random == null)
                map.get(entry.getKey()).random = null;
            else
                map.get(entry.getKey()).random = map.get(entry.getKey().random);
        }
        return ans;
    }
}