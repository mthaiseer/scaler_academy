package intermediate.class06_arrayProblems;

public class SpecialSubsequenceAG {

    public int solve(String A) {

        int gCount =0;
        int aCount =0;

        for(int i= A.length()-1; i>=0; i--){

            if(A.charAt(i) == 'G'){
                gCount+=1;
            }

            if(A.charAt(i) == 'A'){

                aCount+=gCount;

            }

        }


        return aCount;
    }

    public static void main(String[] args) {
        SpecialSubsequenceAG obj = new SpecialSubsequenceAG();
        System.out.println(obj.solve("ABCGAG"));
        System.out.println(obj.solve("GAB"));
    }

}
