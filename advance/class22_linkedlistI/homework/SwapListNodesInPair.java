package advance.class22_linkedlistI.homework;

import java.util.List;

public class SwapListNodesInPair {


    static void print(ListNode head) {

       ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();


    }

    private ListNode pairSwap(ListNode next1, ListNode next2) {

        next1.next = next2.next;
        next2.next = next1;
        return next2;


    }


    public ListNode swapPairs(ListNode A) {

        ListNode dummyNode  = new ListNode(0);
        dummyNode.next = A;
        ListNode current = dummyNode;

        while(current.next != null && current.next.next != null){

            current.next = pairSwap(current.next, current.next.next);
            current = current.next.next;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        print(one);
        ListNode newHead = new SwapListNodesInPair().swapPairs(one);
        print(newHead);


    }



}
