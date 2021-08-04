package advance.class01_Arrays.classroom;

public class RainWaterTrapped {

    public int trap(final int[] A) {

        int total = 0;
        int[] leftMax =  new int[A.length];
        int[] rightMax =  new int[A.length];

        leftMax[0] =A[0];
        for(int i=1; i<A.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], A[i]);
        }

        rightMax[A.length-1] =A[A.length-1];
        for(int i = A.length-2; i >=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], A[i]);
        }

        for(int i=0; i<A.length; i++){

            int currentMin = Math.min(leftMax[i], rightMax[i]);
            total+= currentMin - A[i];

        }
        return total;

    }

    public static void main(String[] args) {
        System.out.println(new RainWaterTrapped().trap(new int[] {0, 1, 0, 2}));
        System.out.println(new RainWaterTrapped().trap(new int[] {0, 1}));
        System.out.println(new RainWaterTrapped().trap(new int[] {1,2,0,3,0,6}));
    }


}
