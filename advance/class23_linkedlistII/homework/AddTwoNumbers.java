package advance.class23_linkedlistII.homework;

import advance.class23_linkedlistII.ListNode;

public class AddTwoNumbers {



    static void print(ListNode head) {

        ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();


    }

    public ListNode addTwoNumbers(ListNode A, ListNode B) {


        ListNode head1 = A;
        ListNode head2 = B;
        int carry =0;

        ListNode resList  = null;
        ListNode resHead  = null;

        while(head1 != null && head2 != null){

            int x= head1.val;
            int y = head2.val;

            int res = x+y+ carry;
            carry = res / 10;
            int nodeVal =  res %10;

            if(resList == null){
                resList = new ListNode(nodeVal);
                resHead = resList;
            }else{

                while(resList != null && resList.next != null){
                    resList = resList.next;
                }

                ListNode newNode = new ListNode(nodeVal);
                resList.next = newNode;


            }

            head1= head1.next;
            head2 = head2.next;

        }


        while(head1 != null){

            int x = head1.val;
            int res = x+ carry;
            carry = res / 10;
            int nodeVal =  res %10;

            if(resList == null){
                resList = new ListNode(nodeVal);
                resHead = resList;
            }else{

                while(resList != null && resList.next != null){
                    resList = resList.next;
                }

                ListNode newNode = new ListNode(nodeVal);
                resList.next = newNode;

            }

            head1 = head1.next;

        }

        while(head2 != null){

            int x = head2.val;
            int res = x+ carry;
            carry = res / 10;
            int nodeVal =  res %10;

            if(resList == null){
                resList = new ListNode(nodeVal);
                resHead = resList;
            }else{

                while(resList != null && resList.next != null){
                    resList = resList.next;
                }

                ListNode newNode = new ListNode(nodeVal);
                resList.next = newNode;

            }

            head2 = head2.next;

        }

        if(carry > 0){

            while(resList != null && resList.next != null){
                resList = resList.next;
            }

            resList.next = new ListNode(carry);
            resList =  resList.next;



        }


        return resHead;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(9);
        ListNode two = new ListNode(9);
        ListNode three = new ListNode(1);

        ListNode four = new ListNode(1);
//        ListNode five = new ListNode(6);
//        ListNode six = new ListNode(4);


        one.next = two;
        two.next = three;

//        four.next = five;
//        five.next = six;

        print(one);
        print(four);


        ListNode res = new AddTwoNumbers().addTwoNumbers(one, four);

        System.out.println("RES");
        print(res);

    }

}
