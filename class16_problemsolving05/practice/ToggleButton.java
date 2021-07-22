package class16_problemsolving05.practice;

public class ToggleButton {



    int toggleApproch2(int A[]){

        int onesBlock = 0;
        int zerosBlock =0;

        for(int i=0; i<A.length; i++){
            if(A[i] ==  1){
                onesBlock++;
            }

            if(A[i] == 0){
                zerosBlock++;
            }
        }

        return A[0] ==1 ? (onesBlock+zerosBlock)-1: (onesBlock+zerosBlock);
    }

    int toggle(int A[]){

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
        ToggleButton obj = new ToggleButton();
        //System.out.println(obj.toggle(new int[]{1,1,0, 0,0,1}));
        //System.out.println(obj.toggle(new int[]{1,0,1,0}));
        //System.out.println(obj.toggle(new int[]{1,0}));
        System.out.println(obj.toggle(new int[]{0, 1, 0, 1}));
        System.out.println(obj.toggleApproch2(new int[]{0, 1, 0, 1}));
    }
}
