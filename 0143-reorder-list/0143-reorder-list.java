class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) 
            return;

        ListNode B = head, A = head;
        while (A != null && A.next != null) {
            B= B.next;
            A = A.next.next;
        }

        ListNode secondHalf = reverse(B.next);
        B.next = null; 
        ListNode firstHalf = head;
        while (secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }}

 