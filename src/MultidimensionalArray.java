import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String S[]){

        int[] [] numbers = {{1,2,3}, {2,3,6}};
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
