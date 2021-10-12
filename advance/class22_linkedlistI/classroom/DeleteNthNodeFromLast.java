package advance.class22_linkedlistI.classroom;

public class DeleteNthNodeFromLast {


    public ListNode removeNthFromEnd(ListNode A, int B) {

        int size = 0;
        ListNode head = A;
        while (head != null) {
            head = head.next;
            size++;
        }
        head = A;
        if (B >= size) {

            if (head != null) {
                head = head.next;
                return head;
            }

        } else {

            int k = (size - B) - 1;
            for (int i = 1; i <= k; i++) {

                head = head.next;

            }

            head.next = head.next.next;


        }


        return A;
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
        ListNode temp = new DeleteNthNodeFromLast().removeNthFromEnd(one, 12);
        print(temp);


    }


}
