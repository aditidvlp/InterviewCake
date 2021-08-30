import java.util.HashMap;

public class ValidPalindromeRemoval {

    public boolean isPalindrome(String s){


        int left = 0;
        int right = s.length()-1;
        int odd = 0;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right) && odd > 2){
                odd++;
                return false;
            }
            else{
                left++;
                right--;
            }
        }
//        HashMap<Character, Integer> map = new HashMap<>();
//        int odd = 0;
//
//        for(int i =0;i<s.length();i++){
//            char c = s.charAt(i);
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for(int i : map.values()){
//            if( i % 2 != 0){
//                odd++;
//            }
//        }
//        if(odd > 2){
//            return false;
//        }
        return true;

    }

    public static void main(String[] args) {

        ValidPalindromeRemoval vp = new ValidPalindromeRemoval();
        boolean flag = vp.isPalindrome("foobof");
        System.out.println(flag);
    }

}
