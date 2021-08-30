import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();


        String[] arr = s.split(" ");

        if(arr.length != pattern.length())
            return false;

        for(int i = 0; i < pattern.length() -1;i++){

            char c = pattern.charAt(i);
            map.put(c, arr[i]);

        if((map.containsKey(c) && (!map.get(c).equals(arr[i])))){
            return false;
        }

        else if((!map.containsKey(c)) && map.containsValue(arr[i])){
            return false;
        }
           else{

            map.put(c, arr[i]);
        }
        }
        return true;

    }

    public static void main(String S[]){
        WordPattern Patt = new WordPattern();
        Patt.wordPattern("abba", "dog cat cat dog");
    }
}