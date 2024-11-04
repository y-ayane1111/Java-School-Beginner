import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        int[] array;
        array = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("数字を入力してください");
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();

        sc.close();

        int array_01 = array[0] * 2;
        int array_02 = array[0] % 3;
        int array_03 = array[1] * 2;
        int array_04 = array[1] % 3;
        int array_05 = array[2] * 2;
        int array_06 = array[2] % 3;

        System.out.println("1番目の要素は" + array[0] + "で、２倍にすると" + array_01 + " になり、３で割ったあまりは" +
                array_02 + "です");
        System.out.println("2番目の要素は" + array[1] + "で、２倍にすると" + array_03 + " になり、３で割ったあまりは" +
                array_04 + "です");
        System.out.println("3番目の要素は" + array[2] + "で、２倍にすると" + array_05 + " になり、３で割ったあまりは" +
                array_06 + "です");
    }
}
