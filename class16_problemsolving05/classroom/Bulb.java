package class16_problemsolving05.classroom;

import class16_problemsolving05.practice.ToggleButton;

public class Bulb {

    public int bulbs(int[] A) {

        int count = 0;

        for(int i=0; i<A.length; i++){

            if(A[i] == 0 && (count%2)==0){
                count++;
            }

            if(A[i] == 1 && (count%2)!=0){
                count+=1;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        Bulb obj = new Bulb();
        //System.out.println(obj.bulbs(new int[]{1,1,0, 0,0,1}));
        //System.out.println(obj.bulbs(new int[]{1,0,1,0}));
        //System.out.println(obj.bulbs(new int[]{1,0}));
        System.out.println(obj.bulbs(new int[]{0, 1, 0, 1}));

    }

}
