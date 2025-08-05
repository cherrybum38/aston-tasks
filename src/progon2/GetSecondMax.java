package progon2;

public class GetSecondMax {
    public static void main(String[] args) {
        System.out.println(getSecondMaxElement(new int[] {33, 41, 11, 44, 4, 2, 6, 7, 8 ,9, 10}));
    }

    public static int getSecondMaxElement(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }
}
