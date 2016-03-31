/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	//set rules for a comparator
    private Comparator<ListNode> myComparator = new Comparator<ListNode>()
    {
        public int compare(ListNode a, ListNode b) 
        {
        	if (a.val > b.val)
        		return 1;
        	else if(a.val == b.val)
        		return 0;
        	else 
        		return -1;
		}
    };
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k == 0) return null;
      //never used before, need more prectice
        PriorityQueue<ListNode> prior = new PriorityQueue<>(k, myComparator);
        for(ListNode nod: lists)
            if(nod != null)
                prior.add(nod);
        ListNode tmp = new ListNode(0);
        ListNode head = tmp;
        ListNode newtmp = new ListNode(0);
        while(prior.size() != 0)
        {
	//obtain and remove the head of this queue
            newtmp = prior.poll();
            head.next = newtmp;
	//the next element of removed node
            if (newtmp.next != null)
				prior.add(newtmp.next);
			head = head.next;
        }
       return tmp.next; 
    }
}