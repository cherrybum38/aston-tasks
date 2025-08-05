import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMultipleDuplicates {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,100).boxed().collect(Collectors.toList());
        list.add(43,88);
        list.add(3,88);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : list)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(Integer i : map.keySet())
            if(map.get(i)>1)
                System.out.println(i + " - " + (map.get(i) - 1) + " duplicates");
    }

}
