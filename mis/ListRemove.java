package mis;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {

    public static void main(String[] args) {

        List<MyObject> myObjects = new ArrayList<>();

        myObjects.add(new MyObject("line1", "Remove"));
        myObjects.add(new MyObject("line2", "Remove"));
        myObjects.add(new MyObject("line3", "completed"));
        myObjects.add(new MyObject("line4", null));

        System.out.println(myObjects);
        myObjects.removeIf(p-> p.getStatus()!= null && p.getStatus().equalsIgnoreCase("remove"));
        System.out.println(myObjects);
    }
}
