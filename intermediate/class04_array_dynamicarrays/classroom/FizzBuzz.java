package intermediate.class04_array_dynamicarrays.classroom;

public class FizzBuzz {

    public static String[] fizzBuzz(int A) {
        String [] result  = new String[A];

        for(int i=1; i<=A; i++){

            if(i % 3 == 0 && i%5== 0){
                result[i-1] = "FizzBuzz";
            }else if(i % 3 == 0){
                result[i-1] = "Fizz";
            }else if(i%5== 0){
                result[i-1] = "Buzz";
            }else{
                result[i-1] = ""+i;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String[] result = fizzBuzz(30);
        for(String x: result){
            System.out.print(x + " ");
        }
    }

}
