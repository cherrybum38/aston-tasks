public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("element 1");
        myArrayList.add("element 2");
        myArrayList.add("element 3");
        System.out.println("Added elements");
        System.out.println(myArrayList);
        System.out.println();

        System.out.println("Inserted an element");
        myArrayList.add("element 4", 1);
        System.out.println(myArrayList);
        System.out.println();

        System.out.println("Removed element: " + myArrayList.remove(3));
        System.out.println(myArrayList);
        System.out.println();

        System.out.println("First element: " + myArrayList.getFirst());
        System.out.println("Element # 2: " + myArrayList.get(1));
        System.out.println("Last element: " + myArrayList.getLast());
    }
}
