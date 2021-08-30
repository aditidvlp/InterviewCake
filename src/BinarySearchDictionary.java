//String[] words = new String[]{ "ptolemaic","retrograde","supplant", "undulate", "xenoepist",
//        "asymptote",  // <-- rotates here "babka",
//        "banoffee",
//        "engender",
//        "karpatka",
//        "othellolagkage",
//        };

public class BinarySearchDictionary {

    public  void findRotationPoint(String[] words){

        int floorIndex = 0;
        int ceilingIndex = words.length -1;
        String firstItem = words[0];


        int distance = ceilingIndex - floorIndex;
        int halfDistance = distance/2;

        while (floorIndex < ceilingIndex){

            //guess a point where dictionary can be started from middle point
            int guessIndex = floorIndex + (halfDistance);

            String guessValue = words[guessIndex];

            if(guessValue.compareTo(firstItem) >= 0){

                floorIndex = guessIndex;
            }
            else{
                ceilingIndex = guessIndex;
            }
            if (floorIndex + 1 == ceilingIndex) {
                break;
            }
        }

        System.out.println("The ceiling index is"+ ceilingIndex); ;
    }

    public static void main(String S[]){

        BinarySearchDictionary srch = new BinarySearchDictionary();
        srch.findRotationPoint(new String[]{
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",  // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage"});
    }
}
