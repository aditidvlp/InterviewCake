import com.sun.source.util.SourcePositions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFreq {

    public static void main(String S[]){

        List<String> list = new ArrayList<>();

        list.add("code");
        list.add("aditi");
        list.add("code");
        list.add("code");
        list.add("google");
        list.add("google");
        list.add("google");
        list.add("google");
        list.add("google");

        System.out.println("The frequency of google in the list " + Collections.frequency(list, "google"));
    }
}
