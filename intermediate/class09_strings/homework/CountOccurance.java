package intermediate.class09_strings.homework;

public class CountOccurance {

    public int solve(String A) {

        if(A == null) return 0;

        int count = 0;
        for(int i=0; i<A.length(); i++){

            if(A.charAt(i) ==  'b' && (i+1) < A.length()){

                if(A.charAt(i) ==  'b' && A.charAt(i+1) ==  'o'&& A.charAt(i+2) ==  'b'){
                    count++;
                    i+=1;
                }
            }
        }



        return count;
    }

    public static void main(String[] args) {
        CountOccurance obj = new CountOccurance();
        System.out.println(obj.solve("bobob"));
        System.out.println(obj.solve("abobc"));
        System.out.println(obj.solve("bbbb"));
        System.out.println(obj.solve("rbobobbobljzjdbobbobpncbobobobadbobvlrrbobmypibobbqiycbobdcpbobybobgjqgbobuccboboybobmbob"));
    }

}
