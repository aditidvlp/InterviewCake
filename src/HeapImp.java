//import java.util.Arrays;
//import java.util.Comparator;
//
//class Solution {
//    public String[] reorderLogFiles(String[] logs) {
//
//        Comparator<String> myComp = new Comparator<String>() {
//
//            @Override
//            public int compare(String log1, String log2) {
//
//                //lets make two arrays for letter logs
//                String[] split1 = log1.split(" ", 2);
//                String[] split2 = log2.split(" ", 2);
//
//                //check whether the log is digit or not
//                boolean isDigit1 = Character.isDigit(split1.charAt(0));
//                boolean isDigit2 = Character.isDigit(split2.charAt(0));
//
//                //if both the logs are letters
//                if (!isDigit1 && !isDigit2) {
//                    //lets compare the content
//                    //we need to know whether it is positive integer, 0 or negative using compare to function
//                    int cmp = split1[1].compareTo(split2[1]);
//
//                    if (cmp != 0) {
//                        return cmp; //it can be either -1 or 1
//                    }
//                    return split1[0].compareTo(split2[0]);
//
//                }
//                //if first is letter log and second digit log
//                if (!isDigit1 && isDigit2) {
//                    return -1;
//                } else if (isDigit1 && !isDigit2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//
//
//
//
//
//        };
//        Arrays.sort(logs,myComp);
//        return logs;
//    }
//}
//
//
//
//
//
//
//
//// logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
//
//
//// let1 - art, can
//// let3 - art, zero
//// let2 - own kit dig
//// dig1 - 8 1 5 1
//
//
//// logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//
//// a8 - act, zoo
//// g1 - act car
//// ab1 - off key dog
//// a1 - 9 2 3 1
