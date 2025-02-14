import java.lang.reflect.*;
import java.util.*;

class Dummy{
    @Override
    public int hashCode() {
        return 0;
    }
}

public class HashMapTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        HashMap<Dummy, String> hashMap = new HashMap<>();

        Field bucketTable = hashMap.getClass().getDeclaredField("table");
        bucketTable.setAccessible(true);
        Object[] table;

        outerLoop:
        for (int i = 0; i <= 20; i++) {
            hashMap.put(new Dummy(), "");
            System.out.println("Object " + i + " added to HashMap");

            table = (Object[]) bucketTable.get(hashMap);

            System.out.println("Number of buckets: " + table.length);

            String nodeType;
            for (int j = 0; j < table.length; j++)
                if (table[j] != null) {
                    nodeType = table[j].getClass().getName();
                    System.out.println("Bucket " + j + " node type: " + nodeType);
                    if(nodeType.contains("TreeNode"))
                        break outerLoop;
                }

            System.out.println();
        }
    }
}