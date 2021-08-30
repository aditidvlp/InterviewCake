import java.util.ArrayList;
import java.util.List;

class Solution {
    public void summaryRanges(int[] nums) {

        List<String> stringArray = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1)
                i++;
                if (start != nums[i])
                    stringArray.add("" + start + "->" + nums[i]);
                else
                    stringArray.add("" + start);



        }
        System.out.println(stringArray);

    }

    public static void main(String args[]){
        Solution hee = new Solution();
        hee.summaryRanges(new int[]{0,1,2,4,5,7});

    }
}

