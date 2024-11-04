import java.util.Random;

public class Practice09_03 {
  public static void main(String[] args) {
    for (int X = 1; X < 10; X++) {

      Random rand = new Random();
      int num = rand.nextInt(6) + 1;

      if (num % 2 == 1) {
        System.out.println(X + "回目、" + num + "が出ました");
      }
    }
  }
}
