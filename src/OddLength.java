public class OddLength {
    public void sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int n = arr.length;
        // Traverse the array
        for (int i = 0; i < n; i++) {

            // Add to the sum for each
            // contribution of the arr[i]
            sum += (((i + 1) * (n - i) + 1) / 2) * arr[i];
        }
        System.out.println("The sum is of odd arrays is " + sum);


    }

    public static void main(String S[]){

        OddLength odd = new OddLength();
        odd.sumOddLengthSubarrays(new int[]{1,4,2,5,3});
    }
}


