import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class TrappingRainWater {
    public static int trappingRainWater(List<Integer> elevations) {
        // WRITE YOUR BRILLIANT CODE HERE

        int n = elevations.size();
        int[] leftWall = new int[n];
        int[] rightWall = new int[n];


        //calculating the leftMaxWall
        int leftMaxWall = 0;
        for(int i = 0; i < n; i++){

            leftWall[i] = leftMaxWall;
            leftMaxWall = Math.max(elevations.get(i), leftMaxWall);


        }

        //calculating the rightWall

        int rightMaxWall = 0;

        for(int i = n -1; i>=0; i--)
        {
            rightWall[i] = rightMaxWall;
            rightMaxWall = Math.max(elevations.get(i), rightMaxWall);
        }

        //lets get the total water
        int totalWater =0;
        for(int i =0; i < n; i++){
            int elevation = elevations.get(i);
            int minWall = Math.min(leftWall[i],rightWall[i]);
            if(minWall > elevation){

                totalWater += minWall - elevation;
            }
        }

        return totalWater;

    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elevations = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = trappingRainWater(elevations);
        System.out.println(res);
    }
}
