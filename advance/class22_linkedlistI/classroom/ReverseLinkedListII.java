package advance.class22_linkedlistI.classroom;

public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode A, int B, int C) {

        ListNode head = A;

        ListNode start = null;
        ListNode from = null;
        ListNode to = null;
        ListNode end = null;

        ListNode current  = A;
        int count  =0;

        while(current != null){

            count++;
            if(count<B){

                start  = current;

            }

            if(count ==  B){
                from = current;
            }

            if(count == C){
                to  = current;
                end = current.next;
                break;
            }

            current = current.next;

        }

        to.next = null;
        reversePart(from);

        if(start == null ){
            head  = to;
        }else{
            start.next = to;
        }

        from.next = end;
        return head;
    }

    private ListNode reversePart(ListNode from) {

        ListNode prev = null;
        ListNode current = from;
        ListNode next =  null;


        while(current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

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


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        print(one);
        ListNode temp = new ReverseLinkedListII().reverseBetween(one, 1, 4);
        print(temp);


    }
}
