class Practice05_01 {
    public static void main(String[]args) {
        String[] arr_01 = {"リンゴ","バナナ","メロン","マスカット"};

        System.out.println(arr_01[0]);
        System.out.println(arr_01[1]);
        System.out.println(arr_01[2]);
        System.out.println(arr_01[3]);
  
        int[] arr_02;
        arr_02 = new int[4];
        
        arr_02[0] = 10;
        arr_02[1] = 20;
        arr_02[2] = 100;
        arr_02[3] = 3;

        System.out.println(arr_02[0]);
        System.out.println(arr_02[1]);
        System.out.println(arr_02[2]);
        System.out.println(arr_02[3]);

        String[][] arr_03 = {{"ポチ","ジョン"},
        {"タマ","もちまる"},{"ペンペン","ペンギン丸"}};

        System.out.println(arr_03[0][0]);
        System.out.println(arr_03[0][1]);
        System.out.println(arr_03[1][0]);
        System.out.println(arr_03[1][1]);
        System.out.println(arr_03[2][0]);
        System.out.println(arr_03[2][1]);
    }
    
}