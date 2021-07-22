package class15_problemsolving04.practice;

/**
 * Class : https://www.scaler.com/meetings/i/problem-solving-4-8/archive
 */
public class MooreMajorityElements01 {

    private int majorityElement(int [] A){

        int count =0;
        int element =0;
        int frequencyCount =0;


        for(int i=0; i<A.length; i++){

            if(count == 0){
                count++;
                element = A[i];
            }else if(element !=A[i]){
                count--;
            }else{
                count++;
            }

        }

       for(int i=0; i<A.length; i++){
           if(A[i] == element){
               frequencyCount++;
           }
        }
        return (frequencyCount >=A.length/2  )? element: -1;
    }

    public static void main(String[] args) {
        MooreMajorityElements01 obj = new MooreMajorityElements01();
        System.out.println(obj.majorityElement(new int[] {3,3,4,2,4,4,2,4,4}));
    }

}
