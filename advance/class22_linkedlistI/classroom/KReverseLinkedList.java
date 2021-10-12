package advance.class22_linkedlistI.classroom;

import org.w3c.dom.NodeList;

public class KReverseLinkedList {


    public ListNode reverseList(ListNode A, int B) {

        ListNode prev = null;
        ListNode current  = A;
        ListNode next = null;
        int count =0;

        while(current != null && count< B){

            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
            count++;
        }

        if(next != null){
            A.next = reverseList(next, B);
        }


        return prev;
    }

    static void print(ListNode head) {

        ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();


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
        ListNode newHead = new KReverseLinkedList().reverseList(one, 3);
        print(newHead);




    }

}
