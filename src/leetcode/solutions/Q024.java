package leetcode.solutions;

/**
 * Created by hp2016 on 2016/8/6.
 */
public class Q024 {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        while(true){
            cur = swap(cur);
            if(cur == null ||cur.next ==null){
                break;
            }
            cur = cur.next.next;
        }
        return newHead.next;
    }

    public ListNode swap(ListNode head){
        if(head == null){ return null;}
        if(head.next == null){return null;}
        if(head.next.next == null){return head.next;}
        ListNode tempHead = head;
        ListNode swapNode1 = head.next;
        ListNode swapNode2 = head.next.next;
        ListNode tail= head.next.next.next;
        tempHead.next = swapNode2;
        swapNode2.next = swapNode1;
        swapNode1.next = tail;
        return tempHead;
    }
}
