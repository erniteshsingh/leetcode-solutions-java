package DAY22;

public class RemoveNthNodeFromList {

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

    // Approach: Two Pass (Count length, then delete node)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode ptr = head;

        while (ptr != null) {
            ptr = ptr.next;
            count++;
        }

        if (count == n) {
            return head.next;
        }

        ListNode temp = head;
        for (int i = 0; i < count - n - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }

    public static void main(String[] args) {

    }

}
