package leetcode.solutions;

/**
 * Created by hp2016 on 2016/7/30.
 */
public class Q021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode head = new ListNode(0);
        ListNode listNode = head;
        while (l1 != null && l2 != null){
            if(l1.val > l2.val){
                listNode.next = l2;
                listNode = listNode.next;
                l2 = l2.next;
            }else {
                listNode.next = l1;
                listNode = listNode.next;
                l1 = l1.next;
            }
        }
        if (l1 == null){
            listNode.next = l2;
        }else
            listNode.next = l1;
        return head.next;
    }
}
