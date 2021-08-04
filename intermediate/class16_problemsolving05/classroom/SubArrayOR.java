package intermediate.class16_problemsolving05.classroom;

import java.util.Vector;

public class SubArrayOR {

    public int solve(int[] A) {

        int N  = A.length;
        long finalResult  = 0;
        //Find number of digits of maximum digits
        int maxDigits  = 32;
        //appy n*n+1/2 to find total subarray  on maximum digits
        long x = N;
        long totalSubarraySum  = (x *  (x+1))/2;


        //iterate maximum digits  times
        for(int i=0; i<maxDigits; i++){
            Vector<Integer> vector = new Vector<>();
            for(int j =0; j<N; j++) {
                //get 0 positions into vector
                int currentElement = A[j] >> i;
                if(currentElement%2 != 1){
                    vector.add(j);
                }
            }

            long count  =1;
            long cntSubarrNotSet  =0;
            //find count of zeros block
            for(int k=1; k<vector.size(); k++){

                if(vector.get(k) -  vector.get(k-1) == 1){
                    count++;
                }else{
                    cntSubarrNotSet += (count * (count+1))/2;
                    count=1;
                }

            }
            cntSubarrNotSet += (count * (count+1))/2;
            if(vector.size() == 0){
                cntSubarrNotSet =0;
            }
            long currentResult  =  (totalSubarraySum) - (cntSubarrNotSet);

            finalResult += (currentResult * (1 << i));

        }


        return (int)(finalResult%1000000007);
    }

    public static void main(String[] args) {
        SubArrayOR obj = new SubArrayOR();
//        System.out.println(obj.solve(new int[] {1,2,3}));
//        System.out.println(obj.solve(new int[] {1, 2, 3, 4, 5}));
//        System.out.println(obj.solve(new int[] {7, 8, 9, 10}));
        System.out.println(obj.solve(new int[] {347148, 221001, 394957, 729925, 276769, 40726, 552988, 29952, 184491, 146773, 418965, 307, 219145, 183037, 178111, 81123, 109199, 683929, 422034, 346291, 11434, 7327, 340473, 316152, 364005, 359269, 170935, 105784, 224044, 22563, 48561, 165781, 9329, 357681, 169473, 175031, 605611, 374501, 6607, 329965, 76068, 836137, 103041, 486817, 195549, 107317, 34399, 56907, 37477, 189690, 36796, 376663, 39721, 177563, 174179, 183646, 217729, 408031, 429122, 631665, 282941, 526797, 262186, 306571, 63613, 57501, 70685, 226381, 1338, 9360, 130360, 20300, 400906, 87823, 180349, 108813, 18181, 119185, 1, 102611, 63591, 12889, 311185, 383896, 8701, 76077, 75481, 386017, 153553, 304913, 383455, 105948, 142885, 1, 12610, 137005, 119185, 16948, 66171, 123683}));
    }

}
