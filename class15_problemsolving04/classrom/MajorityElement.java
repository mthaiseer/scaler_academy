package class15_problemsolving04.classrom;

public class MajorityElement {

    public int majorityElement(final int[] A) {

        int count =0;
        int element = 0;
        int result = -1;

        for(int i=0; i<A.length; i++){

            if(count == 0){
                count++;
                element = A[i];
            }else if(element != A[i]){
                count--;
            }else{
                //if element appear again, increment count
                count++;
            }
        }

        if(count > 0){

            int freqCountOfElement =0;
            for(int i=0;i<A.length; i++){
                if(A[i] == element){
                    freqCountOfElement++;
                }
            }

            int N  = (int)Math.floor(A.length/2);
            result =   freqCountOfElement >= N ? element: -1;

        }


        return result;

    }

    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(new int[]{2,1,2}));
        System.out.println(obj.majorityElement(new int[]{2,3,2,4,2,2}));
        System.out.println(obj.majorityElement(new int[]{1,2}));
        System.out.println(obj.majorityElement(new int[]{1}));
    }

}
