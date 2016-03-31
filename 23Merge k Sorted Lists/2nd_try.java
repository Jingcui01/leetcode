/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k == 0) return null;
        LinkedList<ListNode> alist = new LinkedList<ListNode>();
        for(ListNode nod: lists)
        {
            alist.add(nod);
        }
        
        ListNode newtmp = new ListNode(0);
        ListNode head = newtmp;
        int i = 0;
        ListNode tmp = null;
        //while(alist.size() != 0)
        while(true)
        {
            tmp = null;
            for(int j=0; j<alist.size();j++)
            {
                if(lists[j]==null)
                {
                    alist.remove(lists[j]);
                    continue;
                }
                else if(tmp == null) 
                {
                    tmp = lists[j];
                    i=j;
                }
                else if(tmp.val > lists[j].val)
                {
                    tmp = lists[j];
                    i = j;
                }
            }
            if(tmp == null) return head.next;
            else
            {
                newtmp.next = lists[i];
                lists[i] = lists[i].next;
                newtmp = newtmp.next;
            }
        }
       //return head.next; 
    }
}