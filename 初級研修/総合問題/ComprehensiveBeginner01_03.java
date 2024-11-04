import java.util.Random;

public class ComprehensiveBeginner01_03 {

    public static void main(String[] args) {
        Random rand = new Random();

        int man = rand.nextInt(3) + 1;
        int woman = rand.nextInt(3) + 1;
        int child = rand.nextInt(3) + 1;

        System.out.println(man);
        System.out.println(woman);
        System.out.println(child);
        // 整数の性質

        // 1人勝ちの条件 9
        // m1,w1,c2 m1,w2,c1 m1,w3,c3 m2,w1,c1 m2,w2,c3 m2,w3,c2 m3,w2,c2 m3,w1,c3
        // m3,w3,c1
        if (man == 1) {
            if ((woman == 1) && (child == 2)) {
                System.out.println("childが勝ちました");
            } else if ((woman == 2) && (child == 1)) {
                System.out.println("womanが勝ちました");
            } else if ((woman == 3) && (child == 3)) {
                System.out.println("manが勝ちました");
            }
        }

        if (man == 2) {
            if ((woman == 1) && (child == 1)) {
                System.out.println("manが勝ちました");
            } else if ((woman == 2) && (child == 3)) {
                System.out.println("childが勝ちました");
            } else if ((woman == 3) && (child == 2)) {
                System.out.println("womanが勝ちました");
            }
        }
        if (man == 3) {
            if ((woman == 2) && (child == 2)) {
                System.out.println("manが勝ちました");
            } else if ((woman == 1) && (child == 3)) {
                System.out.println("womanが勝ちました");
            } else if ((woman == 3) && (child == 1)) {
                System.out.println("childが勝ちました");
            }
        }

        // ２人勝ちの条件 9
        // m1,w2,c2 m1,w3,c1 m1,w1,c3 m2,w2,c1 m2,w3,c3 m2,w1,c2 m3,w2,c3 m3,w1,c1
        // m3,w3,c2
        if (man == 1) {
            if ((woman == 2) && (child == 2)) {
                System.out.println("womanとchildが勝ちました");
            } else if ((woman == 1) && (child == 3)) {
                System.out.println("manとwomanが勝ちました");
            } else if ((woman == 3) && (child == 1)) {
                System.out.println("manとchildが勝ちました");
            }
        }
        if (man == 2) {
            if ((woman == 3) && (child == 3)) {
                System.out.println("womanとchildが勝ちました");
            } else if ((woman == 2) && (child == 1)) {
                System.out.println("manとwomanが勝ちました");
            } else if ((woman == 1) && (child == 2)) {
                System.out.println("manとchildが勝ちました");
            }
        }
        if (man == 3) {
            if ((woman == 1) && (child == 1)) {
                System.out.println("womanとchildが勝ちました");
            } else if ((woman == 3) && (child == 2)) {
                System.out.println("manとwomanが勝ちました");
            } else if ((woman == 2) && (child == 3)) {
                System.out.println("manとchildが勝ちました");
            }
        }

        // あいこの条件 9
        // ①１・２・３が出た時、②全て同じ時
        // m1,w1,c1 m2,w2,c2 m3,w3,c3 m1,w2,c3 m1,w3,c2 m2,w1,c3 m2,w1,c3 m3,w1,c2
        // m3,w2,c1

        if (man == 1) {
            if ((woman == 1) && (child == 1)) {
                System.out.println("あいこです");
            } else if ((woman == 2) && (child == 3)) {
                System.out.println("あいこです");
            } else if ((woman == 3) && (child == 2)) {
                System.out.println("あいこです");
            }
            if (man == 2) {
                if ((woman == 2) && (child == 2)) {
                    System.out.println("あいこです");
                } else if ((woman == 1) && (child == 3)) {
                    System.out.println("あいこです");
                } else if ((woman == 3) && (child == 1)) {
                    System.out.println("あいこです");
                }
                if (man == 3) {
                    if ((woman == 3) && (child == 3)) {
                        System.out.println("あいこです");
                    } else if ((woman == 2) && (child == 1)) {
                        System.out.println("あいこです");
                    } else if ((woman == 1) && (child == 2)) {
                        System.out.println("あいこです");
                    }
                }

            }
        }
    }

}
