public class Practice09_01 {
    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        for (int i = 0; i <= 9; i++) {
            if (i == 3 || i > 4 && i < 9) {
                continue;

            }
            System.out.println(arr[i]);

        }
    }

}
