package GFG_MATH.exponentiation;

public class FastExponentiation {

    int power(int a, int e){

        if(e == 0){
            return  1;
       }

        int sub = power(a, e/2);
        if( (e&1) == 1){ //if ODD
            return a * sub * sub;
        }
        //if even
        return sub * sub;
    }

    public static void main(String[] args) {
        System.out.println(new FastExponentiation().power(5,3));
    }

}
