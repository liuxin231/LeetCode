public class MergeTwoLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public MergeTwoLists() {
//        ListNode l1_10 = new ListNode(1);
//        ListNode l1_9 = new ListNode(0, l1_10);
//        ListNode l1_8 = new ListNode(2, l1_9);
//        ListNode l1_7 = new ListNode(7, l1_8);
//        ListNode l1_6 = new ListNode(6, l1_7);
//        ListNode l1_5 = new ListNode(1, l1_6);
//        ListNode l1_4 = new ListNode(3, l1_5);
        ListNode l1_3 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_3);
        ListNode l1 = new ListNode(1, l1_2);


//        ListNode l2_10 = new ListNode(1);
//        ListNode l2_9 = new ListNode(6, l2_10);
//        ListNode l2_8 = new ListNode(9, l2_9);
//        ListNode l2_7 = new ListNode(6, l2_8);
//        ListNode l2_6 = new ListNode(6, l2_7);
//        ListNode l2_5 = new ListNode(9, l2_6);
//        ListNode l2_4 = new ListNode(8, l2_5);
        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2 = new ListNode(1, l2_2);
        ListNode result = mergeTwoLists(l1, l2);
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode result;
        ListNode nextNode;
        if (list1 == null) {
            result = new ListNode(list2.val);
            nextNode = mergeTwoLists(null, list2.next);
        } else if (list2 == null) {
            result = new ListNode(list1.val);
            nextNode = mergeTwoLists(list1.next, null);
        } else {
            if (list1.val > list2.val) {
                result = new ListNode(list2.val);
                nextNode = mergeTwoLists(list1, list2.next);
            } else {
                result = new ListNode(list1.val);
                nextNode = mergeTwoLists(list1.next, list2);
            }
        }
        if (null != nextNode) {
            result.next = nextNode;
        }
        return result;
    }
}
