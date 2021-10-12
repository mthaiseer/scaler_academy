package advance.class23_linkedlistII.classroom;

import advance.class23_linkedlistII.ListNode;

public class RemoveLoop {

    public ListNode solve(ListNode A) {


        ListNode head  = A;
        ListNode slow = A;
        ListNode fast = A;
        boolean isLoop = false;

        while((fast != null && fast.next != null)  ){

            if( slow != head  && slow == fast){
                isLoop = true;
                break;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        //no loop detected
        if(fast == null || fast.next== null){
            return head;
        }



        if(slow == fast){

            slow = head;


            while(slow!= fast){

                slow = slow. next;
                if(fast.next == slow){
                    fast.next = null;
                    break;
                }
                fast = fast.next;


            }


        }
        return head;
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

        ListNode one = new ListNode(6);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(5);

        ListNode four = new ListNode(3);
        ListNode five = new ListNode(8);
        //ListNode six = new ListNode(15);


        one.next = two;
        two.next = three;
        three.next = four;

        four.next = five;
        //five.next = three;

        print(one);

        ListNode tempHead = new RemoveLoop().solve(one);

        print(tempHead);


    }
}
