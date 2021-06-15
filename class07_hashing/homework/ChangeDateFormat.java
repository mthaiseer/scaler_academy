package class07_hashing.homework;

import java.util.HashMap;
import java.util.Map;

public class ChangeDateFormat {


    String monthLookup(String month){

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar",  "03");
        months.put("Apr",  "04");
        months.put("May",  "05");
        months.put("Jun",  "06");
        months.put("Jul",  "07");
        months.put("Aug",  "08");
        months.put("Sep",  "09");
        months.put("Oct",  "10");
        months.put("Nov",  "11");
        months.put("Dec", "12");

        return months.get(month);

    }

    String dayLookup(String day){
        Map<String, String> dayMap = new HashMap<>();
        dayMap.put("1st","01" );
        dayMap.put("2nd", "02");
        dayMap.put("3rd", "03");
        dayMap.put("4th", "04");
        dayMap.put("5th", "05");
        dayMap.put("6th", "06");
        dayMap.put("7th",  "07");
        dayMap.put("8th",  "08");
        dayMap.put("9th", "09");
        dayMap.put("10th",  "10");
        dayMap.put("11th",  "11");
        dayMap.put("12th", "12");
        dayMap.put("13th",  "13");
        dayMap.put("14th",  "14");
        dayMap.put("15th",  "15");
        dayMap.put("16th",  "16");
        dayMap.put("17th",  "17");
        dayMap.put("18th",  "18");
        dayMap.put("19th", "19");
        dayMap.put("20th",  "20");
        dayMap.put("21st",  "21");
        dayMap.put("21th",  "21");
        dayMap.put("22nd",  "22");
        dayMap.put("22th",  "22");
        dayMap.put("23rd",  "23");
        dayMap.put("23th",  "23");
        dayMap.put("24th",  "24");
        dayMap.put("25th",  "25");
        dayMap.put("26th",  "26");
        dayMap.put("27th",  "27");
        dayMap.put("28th",  "28");
        dayMap.put("29th", "29");
        dayMap.put("30th",  "30");
        dayMap.put("31st" , "31");
        dayMap.put("31th" , "31");
        return dayMap.get(day);
    }




    public String solve(String A) {

        //1st Mar 1984 → 1984-03-01
        String[] splitStr = A.split("\\s+");
        String day = splitStr[0];
        String month = splitStr[1];
        String year = splitStr[2];
        StringBuffer builder  = new StringBuffer();
        builder.append(year).append("-").append(monthLookup(month)).append("-").append(dayLookup(day));

        return builder.toString();
    }

    public static void main(String[] args) {

        ChangeDateFormat obj = new ChangeDateFormat();
        String r =  obj.solve("1st Mar 1984");

        System.out.println(r);
    }

}
