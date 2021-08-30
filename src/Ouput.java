//class Solution {
//    public int countBinarySubstrings(String s) {
//
//        int n = s.length();
//
//        int left = 0;
//        int count = 0;
//        int right = left + 1;
//        int countZero = 0;
//        int countOnes = 0;
//        boolean is_zero = false;
//        boolean is_One = false;
//
//        while (right < n) {
//
//            if (s.charAt(left) == '0') {
//                is_zero = true;
//                countZero++; //0
//            } else if (s.charAt(left) == '1') {
//                is_One = true;
//                countOnes++;//1
//            }
//            if (s.charAt(right) == '1') {
//                countOnes++;
//                if (countZero == countOnes && is_zero == true) {
//                    count += 1;
//                    left++;
//                    right = left + 1;
//                    is_zero = false;
//                    is_One = false;
//                    countZero = 0;
//                    countOnes = 0;
//                    break;
//                } else if (s.charAt(right) == '0') {
//                    countZero++;
//                    if (countZero == countOnes && is_One == true) {
//                        count += 1;
//                        left++;
//                        right = left + 1;
//                        is_zero = false;
//                        is_One = false;
//                        countZero = 0;
//                        countOnes = 0;
//                        break;
//                    }
//                }
//                right++;
//
//            }
//
//
//        }
//        return count;
//    }
//}
//
//
//
//// 00110011
//// l  r --> 0011
//
//// 001
//
////     number of 0's = 2
//
////     1 < 2 not satisfied
////     right++
////     1+1 = 2 , i get a subtring here
//
////     1 0's right 1 --> geta substring here
//
//
////     001101
//
////     0011
//
////     right = left+1
////     01
//
//
////     11010000
//
//
