package leetcode.solutions;

/**
 * Created by hp2016 on 2016/7/29.
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Q19{
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next == null){
                return null;
            }
            ListNode p1 = head;
            ListNode p2 = head;
            for(int i = 0;i<n-1;i++){
                p1=p1.next;
            }
            if(p1.next ==null){
                return head.next;
            }else {
                p1 = p1.next;
            }
            while (p1.next != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;
            return head;
        }
}

