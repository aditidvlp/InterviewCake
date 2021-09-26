import java.util.Arrays;

class Maximum{

    // Function to check a subsequence can
// be formed with min difference mid
    static boolean can_place(int A[],
                             int B)
    {
        int count = 1;
        int n =A.length;
        int last_position = A[0];
        int left = 0;
        int right = A.length-1;


        // If a subsequence of size B
        // with min diff = mid is possible
        // return true else false
        for(int i = 1; i < n; i++)
        {

            int mid = left + (right - left)/2;
            if (A[i] - last_position >= mid)
            {
                last_position = A[i];
                count++;
                if (count == B)
                {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to find the maximum of
// all minimum difference of pairs
// possible among the subsequence
    static int find_min_difference(int A[],
                                    int B)
    {

        // Sort the Array
        int n = A.length;
        Arrays.sort(A);

        // Stores the boundaries
        // of the search space
        int s = 0;
        int e = A[n - 1] - A[0];

        // Store the answer
        int ans = 0;

        // Binary Search
        while (s <= e)
        {
            int mid = (s + e) / 2;

            // If subsequence can be formed
            // with min diff mid and size B
            if (can_place(A, B))
            {
                ans = mid;

                // Right half
                s = mid + 1;
            }
            else
            {

                // Left half
                e = mid - 1;
            }
        }
        return ans+1;
    }

    // Driver Code
    public static void main(String[] args)
    {
//        int A[] = {4,1,2,3,4,3};
        int A[] = {2,3,5,9};
        int B = 3;

        int min_difference = find_min_difference(A, B);

        System.out.print(min_difference);
    }
}