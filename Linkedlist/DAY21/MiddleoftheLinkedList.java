package DAY21;

public class MiddleoftheLinkedList {
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

    public ListNode middleNode(ListNode head) {

        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;

    }

    public static void main(String[] args) {

    }

}
