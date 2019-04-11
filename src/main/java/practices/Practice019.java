package practices;

import java.util.ArrayList;

/**
 * 入力された整数を 日本円（小銭のみ）で支払ったときの硬貨の枚数を出力する関数
 * coincheck
 * を作成しなさい
 * <p>
 * 例）
 * 入力：898
 * 出力：
 * 500円＝1枚
 * 100円＝3枚
 * 50円＝1枚
 * 10円＝4枚
 * 5円＝1枚
 * 1円＝3枚
 */

public class Practice019 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        coincheck(5555);

    }

    public static String coincheck(int n) {


        int[] m = {500, 100, 50, 10, 5, 1};
        int[] p = new int[6];
        String t = "";
        String k = "";
        String br = System.getProperty("line.separator");

        if (n <= 0) {

            k = "";

        } else {

            for (int i = 0; i < m.length; i++) {
                p[i] = n / m[i];
                n = n % m[i];
            }

            for (int i = 0; i < m.length; i++) {
                t = m[i] + "円" + "＝" + p[i] + "枚";
                k = k + t + br;

            }

        }

        return k.trim();


    }
}