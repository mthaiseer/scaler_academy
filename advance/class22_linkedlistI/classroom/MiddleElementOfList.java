package advance.class22_linkedlistI.classroom;


class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MiddleElementOfList {

    public int solve(ListNode A) {

        if( A  == null){
            return -1;
        }

        ListNode slow = A;
        ListNode fast = A;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;


        }

        return slow.val;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        new MiddleElementOfList().solve(one);





    }

}
