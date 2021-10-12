package advance.class23_linkedlistII.classroom;

import advance.class23_linkedlistII.RandomListNode;

public class CopyList_INPROGRESS {

    public RandomListNode copyRandomList(RandomListNode head) {


        RandomListNode oldHead = head;
        RandomListNode newHead = null;
        RandomListNode newTail = null;

        //create new node
        while (oldHead != null){

            if(newHead == null){
                newHead = new RandomListNode(oldHead.label);
                newTail = newHead;
            }else{

                while(newTail!= null && newTail.next!= null){
                    newTail = newTail.next;
                }

                RandomListNode nextNode = new RandomListNode(oldHead.label);
                newTail.next = nextNode;
            }
            oldHead = oldHead.next;
        }

        RandomListNode p1 = head;
        RandomListNode p2 = newHead;
        RandomListNode newListHead = p1;


        while(p1 != null ){

            RandomListNode p1Next = p1.next;
            p1.next = null;
            RandomListNode p2Copy = p2;
            p2Copy.next = null;
            p2Copy.random = null;

            p1.next = p2Copy;
            p2Copy.next = p1Next;




            p1 = p1.next.next;
            p2 = p2.next;


            print(newListHead);



        }



        //set random pointers

//        RandomListNode newListHeadCopy = newListHead;
//
//        while(newListHeadCopy!= null && newListHeadCopy.next !=null){
//
//            if(newListHeadCopy.next.random != null){
//
//                System.out.println(newListHeadCopy.next.label + "  "+ newListHeadCopy.next.random.label );
//                newListHeadCopy.next.random = newListHeadCopy.random.next;
//            }
//
//            newListHeadCopy = newListHeadCopy.next.next;
//
//
//
//        }
//
//        printRandom(newListHead);







        return null;
    }

    static void print(RandomListNode head) {

        RandomListNode h = head;
        while (h != null) {
            System.out.print(h.label + "-> ");
            //System.out.print(h.label + "-> "+h.random == null? ""  : h.random.label+ "  ");
            h = h.next;
        }
        System.out.println();


    }

    static void printRandom(RandomListNode head) {

        RandomListNode h = head;
        while (h != null) {

            System.out.print(h.label + "-> "+(h.random == null? " "  : h.random.label)+ "  ");
            h = h.next;
        }
        System.out.println();


    }

    public static void main(String[] args) {

        RandomListNode one = new RandomListNode(1);
        RandomListNode two = new RandomListNode(2);
        RandomListNode three = new RandomListNode(3);


        one.random = three;
        two.random = one;
        three.random = one;

        one.next = two;
        two.next = three;

        print(one);

        new CopyList_INPROGRESS().copyRandomList(one);



    }

}
