public class Practice06_05 {
    public static void main(String[] args) {
        String x = "a=";
        String y = "b=";
        int a = 7 + 6;
        int b = 15 - 4;


        System.out.println(x + a);
        System.out.println(y + b);

        a++;
        b--;
        System.out.println(x + a);
        System.out.println(y + b);

        System.out.println(x + (a %= 3));
        System.out.println(y + (b *= 5));
        }
    
}
