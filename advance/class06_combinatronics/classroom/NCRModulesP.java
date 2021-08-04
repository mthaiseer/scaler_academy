package advance.class06_combinatronics.classroom;

public class NCRModulesP {

    public int solve(int A, int B, int C) {


        int result[][]  = new int[A+1][B+1];

        for(int i=0; i<=A; i++){

            for(int j=0; j<=Math.min(i, B); j++){

                if(j == 0 || j ==i){

                    result[i][j] = 1;
                }else{
                    result[i][j] =  ((result[i-1][j-1]%C) +  (result[i-1][j]%C))%C;
                }
            }
        }


        return result[A][B];
    }

    public static void main(String[] args) {
        System.out.println(new NCRModulesP().solve(4,2, 5));
        System.out.println(new NCRModulesP().solve(5,2, 13));
        System.out.println(new NCRModulesP().solve(6,2, 13));
        System.out.println(new NCRModulesP().solve(0,0, 0));
    }









}
