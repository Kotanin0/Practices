package practices;

import java.util.Random;

/**
 * 西暦を入力するとうるう年か判定する関数 isLeapYear を作成しなさい
 * <p>
 * 引数：整数
 * 返却：true/false
 */

public class Practice014 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//
//            int y = random.nextInt(120) + 1900;
//            System.out.println(y);
//            System.out.println(isLeapYear(y));
//        }

        System.out.println(isLeapYear(2003));

    }

    // うるう年ならtrue
    public static boolean isLeapYear(int n) {


        if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            return true;
        }
        return false;
    }

}
