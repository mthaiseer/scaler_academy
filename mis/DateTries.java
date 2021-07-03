package mis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTries {

    private static String fromTimeZone  =  " 00:00:00";
    private static String toTimeZone  =  " 23:59:59";
    private static String dateFormat  =  "dd-MMM-yyyy HH:mm:ss";



    public static void main(String[] args) throws ParseException {



        String fromDate =  "01-JUN-2021"+ fromTimeZone;
        String toDate =  "01-JUN-2021"+ toTimeZone;

        if(!isValidDate(fromDate) || !isValidDate(toDate)){
            throw new IllegalArgumentException("Invalid date");
        }



        //dd-MMM-yyyy
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date parse = sdf.parse(fromDate);
        System.out.println(parse);

        Date toDateParsed = sdf.parse(toDate );
        System.out.println(toDateParsed);


    }

    private static boolean isValidDate(String dateString){

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try{
            sdf.parse(dateString);
        }catch(Exception ex){
            return false;
        }


        return true;
    }
}
