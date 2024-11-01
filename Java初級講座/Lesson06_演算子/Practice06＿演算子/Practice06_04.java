class Practice06_04 {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 5;
        String c ="aは２ではないかつ、３未満の結果は";
        String d ="bは１であるまたは、５以上の結果は";
        String e ="です。";

        System.out.println(c + (a != 2 && a < 3) + e);

        System.out.println(d + (b == 1 || b >= 5) + e);
       
    }
    
}
