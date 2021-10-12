package advance.class22_linkedlistI.practice;

import advance.class22_linkedlistI.ListNode;
import org.w3c.dom.NodeList;

public class ReverseLinkedList {

    static void print(ListNode head) {

        ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();


    }


    ListNode reverse(ListNode  A){

        ListNode prev = null;
        ListNode next = null;
        ListNode current = A;

        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current= next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        print(one);
        ListNode temp = new ReverseLinkedList().reverse(one);
        print(temp);

    }

}
