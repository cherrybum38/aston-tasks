import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOneDuplicate {

    public static void main(String[] args){
        List<Integer> list = IntStream.range(1,100).boxed().collect(Collectors.toList());
        list.add(43,88);

        System.out.println(list.stream().mapToInt(i -> i).sum() - list.stream().distinct().mapToInt(i -> i).sum());
    }
}
