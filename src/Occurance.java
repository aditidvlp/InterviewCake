import java.net.SocketOption;

public class Occurance {

    public static void count(int[] nums, int value){

        int i = 0;
        int count = 0;
        int n = nums.length;

        while( i < n){
            if(nums[i] == value){
                count +=1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
//        Occurance oc = new Occurance();
        count(new int[]{1,1,2,3,4,1}, 1);
//        System.out.println(count(new int[]{1,1,2,3,4,1}, 1));
    }
}
