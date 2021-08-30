import java.net.SocketOption;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SplitPrime {

    public  int numberOfWays(String s) {

        Map<Integer,Boolean> map = new HashMap<>();
        int [] prime = new int [Integer.parseInt(s) +1];
        Arrays.fill(prime,-1);
        int res  =  helper(s,0,s.length(),prime);
        return res;

    }

    private static int helper(String s, int start, int len,int [] prime) {
        // TODO Auto-generated method stub
        if(start >= len)
        {
            return 1;
        }

        int end = start;
        int count = 0;
        for(; end < len; end++)
        {
            String sub = s.substring(start,end+1);

            int num = Integer.parseInt(sub);

            boolean isPrime = false;
            if(prime[num] != -1)
            {
                isPrime =  (prime[num] == 1);
            }
            else
            {
                isPrime = prime(num);
                prime[num] = isPrime ? 1: 0;
            }

            if(isPrime) {
                count     +=		helper(s,end+1,len,prime);
            }
            else
                continue;

        }


        return count;
    }

    private static boolean prime(int num) {
        // TODO Auto-generated method stub

        if(num == 1)
            return false;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;

        return false;
    }

    public static void main(String[] args) {

        SplitPrime sp = new SplitPrime();
        //sp.numberOfWays("31173");
        Instant start = Instant.now();
        System.out.println(sp.numberOfWays("131132"));
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time : " + timeElapsed.toNanos());
    }
}
