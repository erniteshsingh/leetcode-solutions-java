package DAY22;

public class DeleteMiddleNode {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Approach: Fast and Slow Pointer
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slowptr = head;
        ListNode fastptr = head.next;

        while (fastptr.next != null && fastptr.next.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        slowptr.next = slowptr.next.next;
        return head;

    }

    public static void main(String[] args) {

    }

}
