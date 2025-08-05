package progon3;

public class Test {

}

/*


@Controller
@RequestMapping
public class MyController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(path = "***", method = "/**()")
    public User getClient(@RequestParam String fio) {
        String externalServiceUrl = "https://external-service/api/client/" + fio;
        User user = restTemplate.getForObject(externalServiceUrl, User.class);

        var userOpt = clientRepository.findAll()
            .stream()
            .filter(it -> it.getFio().equals(fio))
            .findFirst();
        if (userOpt.get() == null) {
            clientRepository.save(user);
            return user;
        } else {
            return userOpt.get();
        }
    }
}




------





@Service
public class DemoService {

    @Autowired
    private EntityManager em;

    @Transactional
    public void processEntity(Long id) {
        MyEntity entity1 = em.find(MyEntity.class, id);
        System.out.println("Первое чтение: " + entity1.getValue()); // Предположим, здесь будет 100

        try {
            Thread.sleep(5 * 60 * 1000); // 5 минут сна
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        MyEntity entity2 = em.find(MyEntity.class, id);
        System.out.println("Второе чтение: " + entity2.getValue()); // Что будет тут?
    }
}

 */
