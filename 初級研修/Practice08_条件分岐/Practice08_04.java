import java.util.Random;

public class Practice08_04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int color = 1 + rand.nextInt(5);

        System.out.println(color);

        if( color == 1){
            System.out.println("今日のラッキーカラーはピンクです");
        }else if(color == 2 || color == 3 || color == 4){
            System.out.println("今日のラッキーカラーはレッドです");
        }else if(color == 5){
            System.out.println("今日のラッキーカラーはゴールドです");
        }

    }
}
