package progon2;

import java.util.List;
import java.util.stream.Collectors;

public class MapWithLists {

    public static void main(String[] args) {
        List<Worker> list = List.of(
            new Worker("Имя1", 20, 123, "java"),
            new Worker("Имя2", 20, 432, "java"),
            new Worker("Имя3", 20, 1321, "BA"));

        //мапа ключ - string, значение список Worker
        list.stream()
            .collect(Collectors.groupingBy(Worker::getPosition))
            .forEach((k, v) -> {
                System.out.println(k + ":");
                v.forEach(el -> System.out.println("  -" + el.getName()));
            });

    }
}
