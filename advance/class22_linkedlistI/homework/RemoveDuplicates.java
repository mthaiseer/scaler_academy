package advance.class22_linkedlistI.homework;

import java.util.LinkedList;
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode A) {
        
        ListNode h = A;
        
        while(h != null){
            
            if(h != null && h.next!= null && h.val == h.next.val){
                h.next = h.next.next;
            }else{
                h= h.next;
            }
            
            
        }
        
        return A;
        
    }

    static void print(ListNode head){

        ListNode h= head;
        while(h != null){
            System.out.print(h.val+ " ");
            h= h.next;
        }
        System.out.println();


    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(5);
        ListNode seven = new ListNode(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        print(one);
        ListNode t = new RemoveDuplicates().deleteDuplicates(one);
        print(t);



    }
    
}
