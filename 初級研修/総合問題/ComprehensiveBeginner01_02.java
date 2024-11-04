import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num;
        num = new int[10];
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (sum >= 100) {
                break;
            }
            int num1 = rand.nextInt(100) + 1;
            num[i] = num1;
            System.out.println("入力された値は" + num[i]);
            sum = sum + num[i];
        }
        System.out.println("合計値は" + sum);

    }
}