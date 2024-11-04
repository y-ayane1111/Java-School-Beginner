import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        System.out.print("何段> ");
        int inputNum = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= inputNum; i++) {
            if (inputNum > 5) {
                System.out.println("1 ~ 5 までの整数を入力してください");
                break;
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}