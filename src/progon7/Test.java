package progon7;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {
    public static class Worker {
        private String name;
        private int age;
        private int salary;
        private String position;

        public Worker(String name, int age, int salary, String position) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Integer getSalary() {
            return salary;
        }

        public String getPosition() {
            return position;
        }
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", 22, 100, "Manager");
        Worker worker2 = new Worker("Max", 33, 200, "DevOps");
        Worker worker3 = new Worker("Anna", 44, 150, "Top manager");
        Worker worker4 = new Worker("Ted", 19, 122, "QA");
        Worker worker5 = new Worker("Vladislav", 25, 500, "PM");

        List<Worker> workers = List.of(worker1, worker2, worker3, worker4, worker5);

        workers.stream().filter(w -> w.getSalary() > 150).forEach(w -> System.out.println(w.getName()));

        Map<String, String> collect =
            workers.stream().collect(Collectors.toMap(Worker::getName, Worker::getPosition));


        System.out.println(firstUnique("abacabad"));
        System.out.println(firstUnique("aabbcc"));
    }



    public static Character firstUnique(String input) {
        return input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                c -> c,
                LinkedHashMap::new,
                Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);
    }


//    private static final List<String> STRING_LIST = List.of("1", "2", "1");
//
//    private static Optional<String> getResult(String index) {
//        if (index.equals("1")) {
//            return STRING_LIST.stream().findFirst();
//        } else if (index.equals("2")) {
//            return Optional.empty();
//        } else if (index.equals("3")) {
//            return Optional.of("чпуньк");
//        }
//        throw new IllegalArgumentException("Неизвестный индекс");
//    }
//
//    public static void main(String[] args) throws Exception {
//        String res = getResult("3")
//            .orElseGet(() -> getResult("1")
//                .orElseGet(() -> getResult("2")
//                    .orElseThrow(() -> new RuntimeException("АААААААААА"))));
//        System.out.println(res);
//    }


//    public static void main(String[] args) {
//        Set<TestDto> strings = Set.of(new TestDto(), new TestDto("1"));
//        TestDto s = strings.stream()
//            .filter(f -> "1".equals(f.getData()))
//            .findFirst()
//            .orElse(new TestDto("3"));
//        System.out.println(s.getData());
//    }
//
//    public static class TestDto {
//        private String data;
//
//        public TestDto() {}
//
//        public TestDto(String data) {
//            this.data = data;
//        }
//
//        public String getData() {
//            return this.data;
//        }
//    }

}
