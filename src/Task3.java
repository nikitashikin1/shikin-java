public class Task3 {

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 10, 12, 15};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
