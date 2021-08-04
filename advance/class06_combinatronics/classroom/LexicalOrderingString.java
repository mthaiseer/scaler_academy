package advance.class06_combinatronics.classroom;

public class LexicalOrderingString {

    public int findRank(String A) {

        int M  =1000003;
        long ans = 1;
        int stringLength = A.length();

        for (int i=0; i<A.length()-1; i++){
            int smaller =0;
            for(int j =i+1; j<A.length(); j++){

                if(A.charAt(i) > A.charAt(j)){
                    smaller++;

                }

            }

            ans+= ((fact(stringLength-1-i) %M) * (smaller%M))%M;


        }

        return (int)(ans%M);

    }

    int fact(int n){
        int M  = 1000003;
        if(n  == 0 || n ==1){
            return n;
        }
        return ( (n %M ) * fact(n-1)%M)%M;

    }


    public static void main(String[] args) {

        System.out.println(new LexicalOrderingString().findRank("ABC"));
        System.out.println(new LexicalOrderingString().findRank("STRING"));
        System.out.println(new LexicalOrderingString().findRank("DTNGJPURFHYEW"));
    }

}
