package intermediate.class15_problemsolving04.homework;

import java.util.*;


class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}

public class HotelBookingPossible {

    public boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {

        List<Pair> allBookings = new ArrayList<>();

        for(int a: arrive){
            allBookings.add(new Pair(a, 0));
        }

        for(int d: depart){
            allBookings.add(new Pair(d, 1));
        }

        allBookings.sort((o1, o2) -> {
            return o1.x - o2.x;
        });

        int maxBooking = Integer.MIN_VALUE;
        int count  =0;
        for(Pair pair: allBookings){

            if(pair.y == 0){
                count = count+1;

            }else{
                count+= -1;
            }

            maxBooking =  Math.max(maxBooking, count);

        }

       if(maxBooking > K){
           return false;
       }
        return true;
    }



    public static void main(String[] args) {
        HotelBookingPossible obj = new HotelBookingPossible();


//        List<Integer> arraivals = Arrays.asList( 1, 2, 3, 4);
//        List<Integer> depart = Arrays.asList(10, 2, 6, 14);
//        boolean isPossible  =obj.hotel(arraivals, depart, 2);

//        List<Integer> arraivals = Arrays.asList( 1, 2, 3);
//        List<Integer> depart = Arrays.asList( 2, 3, 4);
//        boolean isPossible  =obj.hotel(arraivals, depart, 1);

        List<Integer> arraivals = Arrays.asList(13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25, 48, 49, 12, 7, 8);
        List<Integer> depart =    Arrays.asList(28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76, 60, 90, 67, 22, 51, 53); //true
        boolean isPossible  = obj.hotel(arraivals, depart, 23);


//        List<Integer> arraivals = Arrays.asList(17, 0, 45, 11, 16, 43, 15, 42, 2, 41, 0, 27, 37, 25, 17, 42, 24, 23, 11, 4, 29, 39, 6, 10, 42, 16, 17, 39, 1 );
//        List<Integer> depart = Arrays.asList(25, 24, 52, 51, 26, 46, 25, 45, 9, 51, 49, 48, 51, 66, 65, 57, 69, 43, 50, 9, 32, 55, 10, 58, 62, 46, 19, 87, 12 );
//        boolean isPossible = obj.hotel_optimized(arraivals, depart, 16);


        System.out.println("Is booking possible " + isPossible);

    }
}
