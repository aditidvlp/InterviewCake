import java.util.Arrays;

public class FrequencyArray {

    public static void hello(String s){

        int[] freqArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;

        }
    }
    public static void main(String S[]){

        hello("balloon");
    }
}
