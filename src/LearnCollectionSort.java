import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnCollectionSort {

    public static void main(String S[])
    {
        List<String> names = Arrays.asList("Aditi", "Monu", "David", "Brain");

        //sorted the names according to dictionary order
        Collections.sort(names);

        System.out.println("The sorted collection is " + names);

        //sorted the names in reverse order
        Collections.sort(names, Collections.reverseOrder());

        System.out.println("The reverse order of names is as follows"+ names);


    }
}

//    It sorts the specified List items into their natural order.
//        All elements in the list must implement the Comparable interface.
//        All elements in the list must be mutually comparable and should not throw ClassCastException.
//        This sort is guaranteed to be stable. It means that equal elements will not be reordered as a result of the sort.
//        The specified list must be modifiable, but need not be resizable.
//        Method does not return any value.
