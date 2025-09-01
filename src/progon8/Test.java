package progon8;

public class Test {
//    @Service
//    public class MoneyTransferService {
//
//        @Autowired
//        private TransferRepository transferRepository;
//
//        @Autowired
//        private ComissionRepository commisionRepository;
//
//        @Autowired
//        private UserRepository userRepository;
//
//        @Autowired
//        private NotificationService notificationService;
//
//        @Autowired
//        private ExchangeRateRestClient exchangeRateRestClient;
//
//        @Transactional
//        public void processTransfer(double amount, Currency currency, Long recepientId) {
//
//            double amountInRecepientCurrency = amount * exchangeRateRestClient.fetchExchangeRate() - getRateForCurrency(currency - getCode());
//
//            Long userId = SecurityContextHolder.getContext().getAuthentication().getPrincipal().getId();
//
//            User user = userRepository.findUserById(userId);
//
//            Transfer transfer = new Transfer(amountInRecepientCurrency, user, recipientId);
//
//            transferRepository.save(transfer);
//
//            if (amountInRecepientCurrency < 1000) {
//                Commission commission = new Commission(amountInRecepientCurrency * 0.015, user);
//                commissionRepository.save(commission);
//            }
//
//            if (amountInRecepientCurrency > 1000) {
//                Commission commission = new Commission(amountInRecepientCurrency * 0.01, user);
//                commissionRepository.save(commission);
//
//            }
//
//            if (amountInRecepientCurrency > 5000) {
//                Commission commission = new Commission(amountInRecepientCurrency * 0.005, user);
//                commissionRepository.save(commission);
//            }
//
//            try {
//                notificationService.sendNlotification(transfer);
//            } catch (Exception e) {
//
//            }
//        }
//    }

//    Расшифровать и вывести в одну строку разделенную запятыми. Алгоритм шифрования Base 64
//    List<List<String>> lists = List.of(List.of("SGUxMTExbC0tMGxvMjEyMy4uLi8v", "dzBvcjFsZA=="),
//        List.of("aW4=", "dGgxMTExMjMyaXM="),
//        List.of("YmVhdXQxMjNpZjMxMnVs", "ZGF5"));
//
//   Base64.getDecoder().decode(String s)
//
//**
//
//    Дан массив из 0 и 1.
//    Нужно найти длину самой длинной последовательности из 1, если удалим какой-то 0 *
//    public class Interview {
//        private static int maxLengthOfSequence0f0nesExceptZero(int[] arr) {
//            int maxLength = 0;
//            int zeroCount = 0;
//            int left = 0;
//            int right = 0;
//
//            while (right < arr.length) {
//                if (arr[right] == 0) {
//                    zeroCount++;
//                }
//
//                while (zeroCount > 1){
//                    if (arr[left] == 0) {
//                        zeroCount--;
//                    }
//                    left++;
//                }
//
//                right++;
//                maxLength = Math.max(maxLength, right - left - zeroCount);
//            }
//
//            return Math.max(maxLength, right - left - zeroCount - 1);
//        }
//
//        public static void main(String[] args) {
//            var arr_0 = new int[]{};   // -> 0
//            var arr0_0 = new int[]{0}; // -> 0
//            var arr1_1 = new int[]{1}; // -> 1
//            var arr10_1 = new int[]{1, 0}; // -> 1
//            var arr011_2 = new int[]{0, 1, 1}; // -> 2
//            var arr101_2 = new int[]{1, 0, 1}; // -> 2
//            var arr10101_2 = new int[]{1, 0, 1, 0, 1}; // -> 2
//            var arr1110011011001_4 = new int[]{1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1}; // -> 4
//
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr_0));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr0_0));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr1_1));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr10_1));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr011_2));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr101_2));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr10101_2));
//            System.out.println(maxLengthOfSequence0f0nesExceptZero(arr1110011011001_4));
//        }

//
//import java.io.*;
//import java.util.List;
//    Зарефактори
//    public class Parser {
//        public String filePath = "numbers.txt";
//        /*
//         * Метод записывает числа в файл
//         * @param numbers - лист с числами для записи
//         * @return путь к файлу
//         */
//        public synchronized String parse(List<Long> numbers) throws IOException {
//            DataOutputStream dis = new DataOutputStream(new FileOutputStream(filePath));
//            numbers.forEach((n) -> {
//                try {
//                    dis.writeLong(n);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            return filePath;
//        }
//    }
//
//import java.util.HashSet;
//    @Service
//    public class EquipmentServiceTask {
//        class EquipmentService {
//            @Setter(onMethod = @Autowired)
//            private FurnitureRepository furnitureRepository;
//            @Setter(onMethod = @Autowired)
//            private PcRepository pcRepository;
//            private final Set<Equipment> requestData = new HashSet<>();
//            public void validateRequest(UUID id) throws NotFoundException {
//                Equipment furniture = furnitureRepository.findById(id);
//                if (furniture != null) {
//                    requestData.add(furniture);
//                    return;
//                }
//                Equipment pc = pcRepository.findById(id);
//                if (pc == null) {
//                    throw new NotFoundException();
//                }
//                requestData.add(pc);
//            }
//            public Set<Equipment> getRequestData() {
//                var result = new HashSet<Equipment>(requestData);
//                requestData.clear();
//                return result;
//            }
//        }
//        @RestController
//        class EquipmentController {
//            @Autowired
//            private EquipmentService equipmentService;
//            @GetMapping("/equipment/{ids}")
//            public Set<Equipment> getEquipment(@PathVariable("ids") List<UUID> ids) {
//                ids.foreach(equipmentService::validateRequest);
//                return equipmentService.getRequestData();
//            }
//        }
//    }

}
