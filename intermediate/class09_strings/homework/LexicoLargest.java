package intermediate.class09_strings.homework;

public class LexicoLargest {

    public String getLargest(String A) {

        String[] aSpit = A.split("_");
        
        String S = aSpit[0];
        String T = aSpit[1];

        char sArr [] = S.toCharArray();
        char [] tArr = T.toCharArray();
        sortT(tArr);

        for(int i=0; i<tArr.length; i++){

            for(int j=0; j<sArr.length; j++){
                if(sArr[j] < tArr[i]){
                    sArr[j] = tArr[i];
                    tArr[i] = '\0';
                }
            }



        }
        return new String(sArr);
    }
    void sortT(char[] T){

        for(int i=0; i<T.length; i++){
            for(int j=i+1; j<T.length; j++){
                if(T[j] > T[i]){
                    swap(T, i,j);
                }
            }
        }


    }

    void swap(char[] T, int start, int end){

        char temp = T[start];
        T[start] = T[end];
        T[end] = temp;

    }


    public static void main(String[] args) {
        LexicoLargest obj = new LexicoLargest();
        System.out.println(obj.getLargest("abb_c"));
        System.out.println(obj.getLargest("xyzab_cd"));

    }
}
