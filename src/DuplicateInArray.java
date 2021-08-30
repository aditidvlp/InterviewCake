public class DuplicateInArray {

    public void findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length -1 ; i++) {

            if (nums[i] == nums[i] + 1) {
                continue;
            } else if (nums[i] == nums[i + 1])
                System.out.println(nums[i]);
        }
    }
    public static void main (String S[]){

        DuplicateInArray dup = new DuplicateInArray();
        dup.findDuplicate(new int[]{1,2,2,3,4,5});
    }
}
