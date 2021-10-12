package advance.class23_linkedlistII.classroom;

import advance.class23_linkedlistII.ListNode;
import org.w3c.dom.NodeList;

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode start = null;
        ListNode end = null;

        ListNode aNode = A;
        ListNode bNode = B;

        while(aNode != null && bNode!= null){



            if(aNode.val < bNode.val){

                ListNode tempNode = new ListNode(aNode.val);

                if(start ==  null){

                    start = tempNode;
                    end = start;

                }else{

                    end.next = tempNode;
                    end = end.next;


                }
                aNode = aNode.next;


            }else{

                ListNode tempNode = new ListNode(bNode.val);

                if(start ==  null){

                    start = tempNode;
                    end = start;

                }else{

                    end.next = tempNode;
                    end = end.next;


                }
                bNode = bNode.next;

            }



        }

        while (aNode != null){

            ListNode tempNode = new ListNode(aNode.val);

            if(start ==  null){

                start = tempNode;
                end = start;

            }else{

                end.next = tempNode;
                end = end.next;


            }
            aNode = aNode.next;


        }

        while( bNode!= null){

            ListNode tempNode = new ListNode(bNode.val);

            if(start ==  null){

                start = tempNode;
                end = start;

            }else{

                end.next = tempNode;
                end = end.next;


            }
            bNode = bNode.next;

        }



        return start;


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


        ListNode one = new ListNode(5);
        ListNode two = new ListNode(8);
        ListNode three = new ListNode(20);

        ListNode four = new ListNode(4);
        ListNode five = new ListNode(11);
        ListNode six = new ListNode(15);


        one.next = two;
        two.next = three;

        four.next = five;
        five.next = six;

        print(one);
        print(four);

        ListNode newHead = new MergeSortedList().mergeTwoLists(one, four);
        print(newHead);



    }


}
