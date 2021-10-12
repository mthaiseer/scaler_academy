package advance.class22_linkedlistI.classroom;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReorderList {

    ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current!= null){

            next = current.next;
            current.next = prev;
            prev = current;
            current= next;

        }


       return prev;

    }

    public ListNode reorderList(ListNode A) {

        if(A.next == null){
            return A;
        }

       ListNode head = A;

       ListNode slow = head;
       ListNode fast = head;
       ListNode prev = head;

       while(fast != null && fast.next!=null){

           prev = slow;
           slow = slow.next;
           fast = fast.next.next;


       }

        prev.next= null;
        ListNode p1 = A;
        ListNode p2= reverse(slow);




        ListNode dummy = new ListNode(0);
        ListNode start = dummy;


        while(p2!= null && p1!=null){

            ListNode node1 = new ListNode(p1.val);
            ListNode node2 = new ListNode(p2.val);

            while(start!= null && start.next!= null){
                start = start.next;
            }

            start.next = node1;
            start.next.next = node2;

            p1 = p1.next;
            p2 = p2.next;


        }

        while (p1!= null){

            while(start!= null && start.next!= null){
                start = start.next;
            }
            start.next = new ListNode(p1.val);
            p1 = p1.next;
        }

        while (p2!= null){

            while(start!= null && start.next!= null){
                start = start.next;
            }
            start.next = new ListNode(p2.val);
            p2 = p2.next;
        }
       return dummy.next;
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


        one.next = two;
        two.next = three;
        three.next = four;
       four.next = five;

        print(one);
        ListNode temp = new ReorderList().reorderList(one);
        print(temp);


    }

}
