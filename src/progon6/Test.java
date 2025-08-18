package progon6;

public class Test {

//    Задача
//
//    List<String> strings = List.of("string", "apple", "banana", "cat", "dog", "Java",
//        "hello", "world", "compiler", "car", "home", "");
//
////сгруппировать данные в мапу, где ключ - длинна строки, велью - список строк такой длинны.
//
//strings.stream().collect(Collectors.groupingBy(String::length))
//
//
////сгруппировать данные в мапу, где ключ - длинна строки, велью - кол-во строк с такой длинной.
//
//        strings.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()))
//
//
//
//    Задача
//    Employee table:
//        +-----+-------+------------+-----------+
//        | id  | name  | department | managerId |
//        +-----+-------+------------+-----------+
//        | 101 | John  | A          | null      |
//        | 102 | Dan   | A          | 101       |
//        | 103 | James | A          | 101       |
//        | 104 | Amy   | A          | 101       |
//        | 105 | Anne  | A          | 101       |
//        | 106 | Ron   | B          | 101       |
//        +-----+-------+------------+-----------+
//
//
//    Написать запрос , который выведет имена менеджеров, у которых в подчинении как минимум 5 человек (В данном случае вывод будет John).
//
//    select m.name from Employee m
//    join Employee e on e.managerId = m.id
//    group by m.id, m.name
//    having count(e.id) >= 5
//
//
//    Задача 1
//    //javadocs
//    @Controller
//    @RequestMapping()//прописать маппинг
//    public class MyController {
//        //инъекцию лучше через конструктор
//        @Autowired
//        private RestTemplate restTemplate;
//        @Autowired
//        private ClientRepository clientRepository;
//
//        @RequestMapping(path = "***", method = /**())//прописать конкретный маппинг
// public User getClient(@RequestParam String fio) {//искать по id конкретного юзера или возвращать вписок дто с юзерами
// String externalServiceUrl = "https://external-service/api/client/" + fio;//Переписать вызов к стороннему сервису
// User user = restTemplate.getForObject(externalServiceUrl, User.class);//Получать дто
//
// var userOpt = clientRepository.findAll()//логику лучше вынести в с метод репозитории
// .stream()
// .filter(it -> it.getFio().equals(fio))
// .findFirst();
//
// if (userOpt.get() == null) {//Добавить нормальную обработку Optional userOpt.orElseGet(() -> throw new NotFoundException)
// clientRepository.save(user);//это в get запросе делать нельзя
// return user;
// } else {
// return userOpt.get();
// }
// }
// }
//
//
// Задача 2
//
// Все ли в порядке в следующем коде? Что бы вы поменяли?
// @Service //javadocs
// public class FooService {
//
// @Lazy
// @Autowired
// private FooService self;
//
// @Autowired
// private OtherService otherService;
//
// public FooService() {
// this.otherService.someMethod();
// }
//
// @Transactional()
// public void method() {
// self.doSomething();
// }
//
// @Transactional(propagation = Transactional.REQUIRES_NEW)
// public void doSomething() { ... }
// }
//
//
//
//
// Задача 3
//
// Что произойдет с транзакцией в данном примере?
// @Service
// @RequiredArgsConstructor
// public class SomeService {
//
// private final PersonRepository personRepository;
//
// @Transactional
// public void doBusiness() throws Exception {
// Person person = personRepository.getOne(id);
// person.setName("123");
// throw new IOException();
// person.setAge(21);
// }
// }
//
//
//
//
// Задача 4
//
// Если у данной таблицы есть только эти два запроса, то каким индексом можно ускорить оба? CREATE TABLE employee ( id serial, name varchar, phone varchar );
//
// SELECT * FROM employee WHERE name = ? and phone=?;
//
//
//
//
//
//
// Задача 5
//
// Корректен ли следующий код?
// class GenericExceptions {
//
// static class GenericException<T> extends RuntimeException {
//
// private T info;
//
// public GenericException(String message, T info) {
// super(message);
// this.info = info;
// }
// }
//
// public static void main(String[] args) {
// try {
// doLogic();
// } catch (Exception unexpectedEx) {
// handleUnexpectedException(unexpectedEx);
// } catch (GenericException<DbConnectionInfo> | GenericException<NotFoundInfo> | GenericException<HttpInfo> genericEx) {
// handleGenericException(genericEx);}
// }
// }
//
//
//
//
//
// Задача 7
//
// 1. Написать URL api, которое выдаёт перечень всех кредитов пользователя
// /api/v1/some-service/user/getCredits/{userId}
}
