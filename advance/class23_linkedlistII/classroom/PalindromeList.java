package advance.class23_linkedlistII.classroom;

import advance.class23_linkedlistII.ListNode;

public class PalindromeList {

    ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){

            next = current.next;
            current.next = prev;

            prev =current;
            current = next;

        }

        return prev;

    }

    public int lPalin(ListNode A) {

        ListNode head = A;
        ListNode slow = head;
        ListNode fast = head;


        while(fast!= null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;


        }

        ListNode p1 = head;
        ListNode p2 = reverse(slow);

        while(p1 != null && p2 != null){

            if(p1.val != p2.val){
                return 0;
            }

            p1 = p1.next;
            p2 = p2.next;

        }
        return 1;
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
        ListNode three = new ListNode(1);

       // ListNode four = new ListNode(1);
//        ListNode five = new ListNode(11);
//        ListNode six = new ListNode(15);


        one.next = two;
        two.next = three;
      //  three.next = four;

        print(one);

        int x  =  new PalindromeList().lPalin(one);
        System.out.println(x);

    }

}
