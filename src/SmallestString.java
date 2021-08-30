public class SmallestString {

    public void smallString(String s){

        int n = s.length();
        int i =0;

        while(i < n -1){

            if(s.charAt(i) > s.charAt(i+1)){
                break;
            }
            i++;
        }
       // return s.substring(0,i) + s.substring(i+1, s.length());
        System.out.println(s.substring(0,i));
        System.out.println(s.substring(i+1, s.length()));
    }

    public static void main(String[] args) {

        SmallestString ss = new SmallestString();
        ss.smallString("abcda");
        //System.out.println(s);
    }
}


//String = [abczd]
//          012345
//abcd
//
//i = 0
//a> b - no
//
//i = 1
//b > c - no
//
//i =2
//c > z - no
//
//i = 3
//z > d - yes
//
//
//s.substring(0,3) +
