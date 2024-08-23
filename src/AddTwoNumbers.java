class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class AddTwoNumbers {
    public AddTwoNumbers() {
        ListNode l1_10 = new ListNode(1);
        ListNode l1_9 = new ListNode(0, l1_10);
        ListNode l1_8 = new ListNode(2, l1_9);
        ListNode l1_7 = new ListNode(7, l1_8);
        ListNode l1_6 = new ListNode(6, l1_7);
        ListNode l1_5 = new ListNode(3, l1_6);
        ListNode l1_4 = new ListNode(3, l1_5);
        ListNode l1_3 = new ListNode(0, l1_4);
        ListNode l1_2 = new ListNode(6, l1_3);
        ListNode l1 = new ListNode(1, l1_2);


        ListNode l2_10 = new ListNode(1);
        ListNode l2_9 = new ListNode(6, l2_10);
        ListNode l2_8 = new ListNode(9, l2_9);
        ListNode l2_7 = new ListNode(6, l2_8);
        ListNode l2_6 = new ListNode(6, l2_7);
        ListNode l2_5 = new ListNode(9, l2_6);
        ListNode l2_4 = new ListNode(8, l2_5);
        ListNode l2_3 = new ListNode(0, l2_4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2 = new ListNode(6, l2_2);

        ListNode result = addTwoNumbers(l1, l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int addNum = l1.val + l2.val;
        int y = addNum % 10;
        int c = addNum / 10;
        if (l1.next != null || l2.next != null || c != 0) {
            ListNode l1Next = l1.next == null? new ListNode(0): l1.next;
            l1Next.val += c;
            ListNode l2Next = l2.next == null? new ListNode(0): l2.next;;
            result.next = addTwoNumbers(l1Next, l2Next);
        }
        result.val = y;
        return result;
    }
}
