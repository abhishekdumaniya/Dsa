package com.abhishek.LeetCode;

public class LinkedListSum {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class LinkedListSum {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0); // Dummy head to simplify list manipulation
            ListNode current = dummyHead;
            int carry = 0;

            while (l1 != null || l2 != null) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + carry;

                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            if (carry > 0) {
                current.next = new ListNode(carry);
            }

            return dummyHead.next; // Skip the dummy head and return the result
        }

        // Helper function to print a linked list
        public void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

    }

}
