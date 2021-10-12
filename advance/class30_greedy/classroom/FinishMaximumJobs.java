package advance.class30_greedy.classroom;

import java.util.Arrays;

public class FinishMaximumJobs {

    public int solve(int[] A, int[] B) {
        Jobs[] jobs  = new Jobs[A.length];

        for(int i=0; i<A.length; i++){
            jobs[i] = new Jobs(A[i], B[i]);
        }

        Arrays.sort(jobs);

        Jobs currentJob = jobs[0];
        int ans  = 1;
        //consider all elements not considered so far
        for(int i=1; i<jobs.length; i++){

            //if possible
            if(jobs[i].start >= currentJob.end){

                //then add to result
                ans++;
                currentJob =jobs[i];

            }

        }
        //return final result
         return ans;
    }

    public static void main(String[] args) {
        int A[] = {4, 4, 8, 15, 6 };
        int B[] =  {9, 5, 15, 16, 7};

        System.out.println(new FinishMaximumJobs().solve(A, B));
    }

}

class Jobs implements Comparable<Jobs>{
    int start;
    int end;

    public Jobs(int start, int end){
        this.start = start;
        this.end  = end;
    }

    @Override
    public int compareTo(Jobs o) {
        return this.end - o.end;
    }

}
