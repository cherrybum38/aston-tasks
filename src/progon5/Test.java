package progon5;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "b3", "c")
        .map(s -> {
        System.out.println("map: " + s);
        return s.toUpperCase();
    })
        .anyMatch(s -> {
        System.out.println("anyMatch: " + s);
        return s.startsWith("A");
    });
    }
//    Условие:
//    Удалить дубликаты
//    String strings[] = {"u", "z", "c", "a", "a", "b"};
//
//    Arrays.asList(strings).stream().distinct().toList();
//
//    Set<String> set = new HashSet<>(Arrays.asList(strings));
//
//
//    Условие:
//    Что будет напечатано в консоль?
//        Stream.of("d2", "a2", "b1", "b3", "c")
//        .map(s -> {
//        System.out.println("map: " + s);
//        return s.toUpperCase();
//    })
//        .anyMatch(s -> {
//        System.out.println("anyMatch: " + s);
//        return s.startsWith("A");
//    });
//
//
//
//    Условие:
//    Найдите второе по величине число в списке.
//        List<Integer> numbers = List.of(5, 3, 9, 1, 9, 7);
//
//    numbers.stream()
//    .distinct()
//    .sorted(Comparator.reverseOrder())
//        .skip(1)
//    .findFirst();
//
//
//    Условие:
//    Подсчитайте, сколько раз каждое слово встречается в списке.
//        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
//
//words.stream()
//    .collect(Collectors.groupingBy(s -> s, Collectors.counting())
//
//    int count = 0;
//    Map<String, Integer> map = new HashMap<>;
//for(String word: words){
//        map.put(word, map.getOrDefault(word, 0) + 1)
//    }
//
//    Условие:
//    Подсчитайте суммарную длину всех слов в списке.
//        List<String> words = List.of("Java", "Streams", "Are", "Powerful");
//
//words.stream()
//    .mapToInt(String::length)
//    .sum();
//
//
//    Многопоточка
//    Задача 1
//    Что выведет этот код?
//    public class Example {
//        private static int count;
//
//        public static void main(String[] args) throws InterruptedException {
//            Runnable task = () -> {
//                for (int i = 0; i < 1000; i++) {
//                        count++;
//                }
//            };
//
//            Thread t1 = new Thread(task);
//            Thread t2 = new Thread(task);
//            t1.start();
//            t2.start();
//            t1.join();
//            t2.join();
//
//            System.out.println("Count: " + count);
//        }
//
//
//        Задача 2
//        Что выведет код?
//
//        public class JoinExample {
//            public static void main(String[] args) throws InterruptedException {
//                Thread t = new Thread(() -> System.out.println("Thread done"));
//                t.start();
//                t.join();
//                System.out.println("Main done");
//            }
//        }
//
//
//        Thread done
//        Main done
//
//
//        Задача 3
//        Будет ли строгая чередуемость A, B, A, B ?
//
//        public class YieldExample {
//            public static void main(String[] args) {
//                Runnable task = () -> {
//                    for (int i = 0; i < 3; i++) {
//                        System.out.println(Thread.currentThread().getName() + " - " + i);
//                        Thread.yield();
//                    }
//                };
//
//                Thread t1 = new Thread(task, "A");
//                Thread t2 = new Thread(task, "B");
//
//                t1.start();
//                t2.start();
//            }
//
//
//
//            Задача 4
//            Найди и исправь Deadlock
//            У тебя есть следующий код. Он иногда зависает. Объясни, почему так происходит и как это исправить:
//
//            public class Deadlock {
//                private static final Object resourceA = new Object();
//                private static final Object resourceB = new Object();
//
//
//                public static void main(String[] args) {
//                    Thread t1 = new Thread(() -> {
//                        synchronized (resourceA) {
//                            System.out.println("T1 locked A");
//                            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
//
//                            synchronized (resourceB) {
//                                System.out.println("T1 locked B");
//                            }
//                        }
//                    });
//
//                    Thread t2 = new Thread(() -> {
//                        synchronized (resourceB) {
//                            System.out.println("T2 locked B");
//                            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
//
//                            synchronized (resourceA) {
//                                System.out.println("T2 locked A");
//                            }
//                        }
//                    });
//
//                    t1.start();
//                    t2.start();
//                }
//            }
//
//
//            Ревью
//            Задача 1
//            Сделай ревью кода
//            @Component //@Service
//            @RequiredArgsConstructor
//            public class CachedDocumentService {
//                private static final String FORMATTED_DOCUMENT_CACHE = "FORMATTED_DOCUMENT_CACHE"; //Вынести в const класс
//
//                private final DocumentRepository documentRepository;
//                private final DocumentValidationService documentValidationService;
//                private final DocumentFormatter documentFormatter;
//
//                @Cacheable(cacheNames = FORMATTED_DOCUMENT_CACHE, key = "#documentId")
//                public DocumentDTO formattedDocument(String documentId, String format) {
//                    documentValidationService.validateFormat(format);
//
//                    Document document = documentRepository.findById(documentId);//Обработка случая, когда Document не найден
//                    DocumentDTO documentDto = ConversionUtils.convert(document);//Лучше использовать Mapper
//                    var formatted = documentFormatter.format(documentDto, format);//var? не var?
//
//                    return formatted;
//                }
//
//                //повесить аннотацию
//                public DocumentDTO defaultFormattedDocument(String documentId) {
//                    return formattedDocument(documentId, "PDF");
//                }
//            }
//
}
