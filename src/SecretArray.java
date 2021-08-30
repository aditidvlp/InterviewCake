import java.util.ArrayList;
import java.util.List;

public class SecretArray {

    public int analogousArray(int[] conseDiff, int uppperBound, int lowerBound){

        int n = conseDiff.length;

        //store our answers
        int ans = 0;
        //base conditions
        if(uppperBound < lowerBound){
            return 0;
        }
        if(n == 0) return 0;

        for(int start = lowerBound; start<=uppperBound;start++){

            int[] candidate = new int[n+1];
            boolean valid = false;
            candidate[0] = start;

            for(int i = 1;i<=n;i++){

                int temp = candidate[i-1] - conseDiff[i-1];
                if(temp < lowerBound || temp > uppperBound){
                    valid = false;
                    break;
                }
                else {
                    candidate[i] = temp;
                }
                ans += valid ? 1 : 0;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        SecretArray sc = new SecretArray();
        int m = sc.analogousArray(new int[]{-2,-1,-2,5} ,3,10);
        System.out.println(m);
    }
}
