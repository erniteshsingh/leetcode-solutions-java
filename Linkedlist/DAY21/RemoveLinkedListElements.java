package DAY21;

class RemoveLinkedListElements {
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

    // Approach: Use dummy node to handle head deletion cases
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode ptr = dummy;

        while (ptr.next != null) {

            if (ptr.next.val == val) {
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }

        return dummy.next;

    }

    public static void main(String[] args) {

    }

}