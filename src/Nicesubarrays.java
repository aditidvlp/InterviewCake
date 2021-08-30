//public class Nicesubarrays {
//}
//
//
//class Solution:
//        def numberOfSubarrays(self, nums: List[int], k: int) -> int:
//        right = -1
//        left = 0
//        result = 0
//        odd_count = 0
//        n = len(nums)
//
//        while right < n-1:
//        right+=1
//
//        if nums[right]%2 != 0:
//        odd_count+=1
//
//        if odd_count ==k:
//
//        right_ct = 1
//        left_ct = 1
//
//        while right < n-1 and nums[right+1]%2 ==0:
//        right_ct+=1
//        right+=1
//
//        while left < right and nums[left]%2==0:
//        left_ct+=1
//        left+=1
//
//        result+= right_ct * left_ct
//
//        left+=1
//        odd_count-=1
//        return result