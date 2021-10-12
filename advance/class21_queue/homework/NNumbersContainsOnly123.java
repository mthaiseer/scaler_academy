package advance.class21_queue.homework;

import java.util.*;

public class NNumbersContainsOnly123 {

    public int[] solve(int A) {

        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> resultList =new ArrayList<>();

        if(A == 1){
            resultList.add(1);
            return resultList.stream().mapToInt(Integer::intValue).toArray();

        }

        if(A == 2){
            resultList.add(1);
            resultList.add(2);
            return resultList.stream().mapToInt(Integer::intValue).toArray();
        }

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        int N =  (A-3);

       while(N>0){

            int x = queue.removeFirst();
            resultList.add(x);

            N--;
           queue.addLast((x * 10)+1);
            if(N == 0 )break;

           N--;
           queue.addLast((x * 10)+2);
           if(N == 0 )break;

           N--;
           queue.addLast((x * 10)+3);
           if(N == 0 )break;


        }


        while(!queue.isEmpty()){

            resultList.add(queue.removeFirst());

        }


        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        Arrays.stream(new NNumbersContainsOnly123().solve(7)).forEach(it->{
            System.out.print(it+ " ");
        });

        System.out.println();
        Arrays.stream(new NNumbersContainsOnly123().solve(3)).forEach(it->{
            System.out.print(it+ " ");
        });
        System.out.println();
        Arrays.stream(new NNumbersContainsOnly123().solve(1)).forEach(it->{
            System.out.print(it+ " ");
        });
        System.out.println();
        Arrays.stream(new NNumbersContainsOnly123().solve(2)).forEach(it->{
            System.out.print(it+ " ");
        });
    }

}
