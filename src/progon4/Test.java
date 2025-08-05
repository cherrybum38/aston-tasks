package progon4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Purchase {

    String user;
    int amount;

    public Purchase(String user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }
}

class Product {

    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

class Employee {

    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}

class Movie {

    int id;
    String title;
    String genre;
    double rating;

    public Movie(int id, String title, String genre, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}

public class Test {

    public static void main(String[] args) {

        // Задача 1: Отфильтровать имена, начинающиеся на A, и отсортировать
        List<String> names = List.of("Alice", "Bob", "Charlie", "Ann", "David", "Amanda");

        //names.stream().filter(s -> !s.toLowerCase().substring(0, 1).equals("a")).sorted().forEach(System.out::println);

        // Задача 2: Четные числа, отсортированные по убыванию
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //numbers.stream().filter(n -> n % 2 ==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Задача 3: Группировка слов по длине
        List<String> words = List.of("apple", "banana", "pear", "peach", "fig", "grape", "kiwi");

        //words.stream().collect(Collectors.groupingBy(String::length)).forEach((k,e) -> System.out.println(k + ": " + e));

        // Задача 4: Самый старший человек
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 45),
            new Person("Charlie", 25),
            new Person("Diana", 18)
        );

        //people.stream().max(Comparator.comparingInt(Person::getAge)).ifPresent(p -> System.out.println(p.name));

        // Задача 5: Подсчет уникальных слов (игнорируя регистр)
        List<String> caseWords = List.of("Apple", "apple", "APPLE", "banana", "BANANA", "Banana");

        //System.out.println(caseWords.stream().map(String::toLowerCase).distinct().count());

        // Задача 6: Сумма покупок по пользователям
        List<Purchase> purchases = List.of(
            new Purchase("Alice", 100),
            new Purchase("Bob", 150),
            new Purchase("Alice", 200),
            new Purchase("Charlie", 50)
        );

//        purchases.stream()
//            .collect(Collectors.groupingBy(Purchase::getUser, Collectors.summingInt(Purchase::getAmount)))
//            .forEach((k,v) -> System.out.println(k + ": " + v));

        // Задача 7: Топ-3 самых длинных строки
        List<String> lines = List.of(
            "short",
            "a bit longer line",
            "the longest line of all lines",
            "tiny",
            "medium length"
        );

        //lines.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(3).forEach(System.out::println);

        // Задача 8: Сортировка сотрудников по отделу и возрасту
        List<Employee> employees = List.of(
            new Employee("Alice", "IT", 28),
            new Employee("Bob", "HR", 35),
            new Employee("Charlie", "IT", 25),
            new Employee("Diana", "Finance", 40)
        );

//        employees.stream()
//            .sorted(Comparator.comparing(Employee::getDepartment).thenComparingInt(Employee::getAge))
//            .forEach(e -> System.out.println(e.getName()));

//        employees.stream()
//            .collect(Collectors.groupingBy(Employee::getDepartment,
//                    Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream()
//                            .sorted(Comparator.comparingInt(Employee::getAge))
//                            .collect(Collectors.toList()))))
//            .forEach((k,v) -> {
//                System.out.print(k + ": ");
//                v.forEach(e -> System.out.print(e.getName()+ " "));
//                System.out.println();
//            });

        // Задача 9: Средняя цена по категориям
        List<Product> products = List.of(
            new Product("Milk", "Dairy", 3.5),
            new Product("Cheese", "Dairy", 5.0),
            new Product("Bread", "Bakery", 2.5),
            new Product("Cake", "Bakery", 4.0)
        );

//        products.stream().collect(Collectors.groupingBy(Product::getCategory,
//            Collectors.collectingAndThen(Collectors.toList(),
//                l -> l.stream()
//                    .mapToDouble(Product::getPrice)
//                    .average())))
//            .forEach((k, v) -> {
//                if(v.isPresent())
//                    System.out.println(k + " : " + v.getAsDouble());
//            });

        // Задача 10: Найти 3 самых молодых человека в каждом возрасте
        List<Person> people1 = List.of(
            new Person("Anna", 30),
            new Person("Zoe", 30),
            new Person("Mike", 30),
            new Person("Brian", 30),
            new Person("Carl", 25),
            new Person("Eve", 25),
            new Person("Dina", 25),
            new Person("Alex", 25),
            new Person("Tom", 20)
        );

//        people1.stream()
//            .collect(Collectors.groupingBy(Person::getAge,
//                Collectors.collectingAndThen(Collectors.toList(), l -> l.stream()
//                    .sorted(Comparator.comparing(Person::getName))
//                    .limit(3)
//                    .toList())))
//            .forEach((k, v) -> {
//                System.out.println(k + ":");
//                v.forEach(el -> System.out.println(" " + el.getName()));
//            });

        // Группировка по десятилетиям
        List<Person> people3 = List.of(
            new Person("Anna", 23),
            new Person("Bob", 30),
            new Person("Charlie", 35),
            new Person("Diana", 28),
            new Person("Eve", 42),
            new Person("Frank", 19),
            new Person("Grace", 31),
            new Person("Henry", 25),
            new Person("Ivy", 39)
        );

//        people3.stream()
//            .collect(Collectors.groupingBy(
//                person -> {
//                    int decade = (person.getAge() / 10) * 10;
//                    return decade + "-" + (decade + 9);
//                },
//                Collectors.toList()
//            ))
//            .forEach((k, v) -> {
//                System.out.println(k + ":");
//                v.forEach( e -> System.out.println("  "  + e.getName()));
//            });

        // Задача 11: Собрать Map<Отдел, Средний возраст> только для отделов с 3+ сотрудников
        List<Employee> employees1 = List.of(
            new Employee("Alice", "IT", 30),
            new Employee("Bob", "IT", 32),
            new Employee("Charlie", "IT", 28),
            new Employee("Diana", "HR", 35),
            new Employee("Edward", "HR", 31),
            new Employee("Fay", "Sales", 40),
            new Employee("Gina", "Sales", 38),
            new Employee("Henry", "Sales", 39),
            new Employee("Ivan", "Sales", 42)
        );

//        employees1.stream()
//            .collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.collectingAndThen(Collectors.toList(), l -> l.size() >= 3 ?
//                    l.stream()
//                        .mapToInt(Employee::getAge)
//                        .average()
//                    : OptionalDouble.empty())))
//            .entrySet().stream()
//            .filter(e -> e.getValue().isPresent())
//            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().getAsDouble()));



        // Найти фильм с наивысшим рейтингом в каждом жанре.
        List<Movie> movies = List.of(
            new Movie(1, "Inception", "Sci-Fi", 8.8),
            new Movie(2, "Interstellar", "Sci-Fi", 8.6),
            new Movie(3, "Arrival", "Sci-Fi", 8.8),         // дубликат по рейтингу
            new Movie(4, "The Godfather", "Crime", 9.2),
            new Movie(5, "Pulp Fiction", "Crime", 8.9),
            new Movie(6, "The Dark Knight", "Action", 9.0),
            new Movie(7, "Mad Max", "Action", 8.1),
            new Movie(8, "John Wick", "Action", 9.0),       // дубликат по рейтингу
            new Movie(9, "Coco", "Animation", 8.4),
            new Movie(10, "Up", "Animation", 8.4)           // дубликат по рейтингу
        );

//        movies.stream()
//            .collect(Collectors.groupingBy(Movie::getGenre,
//                Collectors.collectingAndThen(
//                    Collectors.toList(),
//                    l -> l.stream()
//                        .max(Comparator.comparingDouble(Movie::getRating))
//                )))
//            .forEach((k , v) -> System.out.println(k + " : " + v.get().getTitle()));

//        movies.stream()
//            .collect(Collectors.groupingBy(
//                Movie::getGenre,
//                Collectors.collectingAndThen(
//                    Collectors.groupingBy(
//                        Movie::getRating,
//                        TreeMap::new,
//                        Collectors.mapping(Movie::getTitle, Collectors.toList())
//                    ),
//                    map -> map.lastEntry().getValue()
//                )
//            ))
//            .forEach((genre, titles) ->
//                System.out.println(genre + ": " + String.join(", ", titles)));


        // Топ-3 дорогих товаров по каждой категории
        List<Product> products1 = List.of(
            new Product("iPhone", "Electronics", 999),
            new Product("Samsung TV", "Electronics", 1200),
            new Product("Chair", "Furniture", 150),
            new Product("Desk", "Furniture", 300),
            new Product("Lamp", "Furniture", 50),
            new Product("Headphones", "Electronics", 199)
        );

        products1.stream()
            .collect(Collectors.groupingBy(Product::getCategory,
                Collectors.collectingAndThen(Collectors.toList(),
                    l -> l.stream()
                        .sorted(Comparator.comparing(Product::getPrice).reversed())
                        .limit(3)
                        .toList())))
            .forEach((k, v) -> {
                System.out.println(k + ":");
                v.forEach( el -> System.out.println("  " + el.getName() + " - " + el.getPrice()));
            });
    }

}
