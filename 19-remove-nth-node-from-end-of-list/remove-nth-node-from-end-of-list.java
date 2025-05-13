class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
            count++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        if (count == n) {
            dummy.next = head.next;
            return dummy.next;
        }

        int ith = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
            ith++;

            if (ith == count - n) {
                tmp.next = tmp.next.next;
                break;
            }
        }

        return head;
    }
    
}