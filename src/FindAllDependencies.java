import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class FindAllDependencies {

    public static List<Character> getDependencies(Character c, Map<Character, List<Character>> map){

        List<Character> ans = new ArrayList<>();
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();
        queue.add(c);
        while(!queue.isEmpty()){
            Character pack = queue.poll();
            System.out.println(pack);
            ans.add(pack);//A
            List<Character> list = map.get(pack);//B
            if(list == null) continue;
            for(Character dependencies : list){
                if(!visited.contains((dependencies))){
                    queue.add(dependencies);
                    visited.add(dependencies);
                }
            }
        }
        Collections.reverse(ans);
        return ans;



    }

    public static void main(String[] args) {

        Map<Character, List<Character>> map = new HashMap<>();
        map.put('A', new ArrayList<>(List.of('B','C')));
        map.put('B', new ArrayList<>(List.of('D','E','F')));
        map.put('C', new ArrayList<>(List.of('F')));
        map.put('F', new ArrayList<>(List.of('G')));
        map.put('H', new ArrayList<>(List.of('I','J')));
        map.put('J', new ArrayList<>(List.of('G')));

        System.out.println(getDependencies('A', map));

    }
}

/*
    1 - > 5 > 3
    1- 5
    5 -3

    1,5,3


 */



















