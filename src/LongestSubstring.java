public class LongestSubstring {

    public String longestValidString(String str){

        StringBuilder sb = new StringBuilder();
        int countA = 0;
        int countB  = 0;
        boolean flagA = false;
        boolean flagB = false;

        for(int i =0;i<str.length();i++){

//            if(countA > 2){
//                break;
//            }

            if(str.charAt(i) == 'a' && countA <=2){

                countA += 1;
                if(countA > 2){
                    break;
                }
                    sb.append(str.charAt(i));
                    flagB = true;
                    flagA = false;

            }
            if(str.charAt(i) == 'b' && countB <=2){


                    countB += 1;
                if(countB > 2){
                    break;
                }
                    sb.append(str.charAt(i));
                    flagA = true;
                    flagB = false;

            }

            if(flagA){
                countA = 0;

            }
            if(flagB){
                countB =0;

            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        LongestSubstring lb = new LongestSubstring();
       String sb =  lb.longestValidString("aabbaabbaabbaaa");
        System.out.println(sb);
    }
}
//
//    // WRITE YOUR BRILLIANT CODE HERE
//    int s_size = str.length();
//    int start_ml = 0;
//    int max_length = 0;
//    int start = 0;
//    int count = 1;
//        for (int i = 1; i < s_size; ++i) {
//        if (str.charAt(i) == str.charAt(i - 1)) {
//        count++;
//        } else {
//        count = 1;
//        }
//        if (count <= 2) {
//        if (i - start + 1 > max_length) {
//        max_length = i - start + 1;
//        start_ml = start;
//        }
//        } else {
//        start = i - 1;
//        count = 2;
//        }
//        }
//        return str.substring(start_ml, max_length);