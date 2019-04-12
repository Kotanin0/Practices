package practices;

import java.util.ArrayList;

/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 * <p>
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 * <p>
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 * <p>
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 */

public class Practice011 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {
        ArrayList<Integer> ki = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                ki.add(n[i]);

            }

        }

        //Integer の配列を　intの配列に　入れ込む
        int[] ki2 = new int[ki.size()];
        for (int j = 0; j < ki.size(); j++) {
            ki2[j] = ki.get(j);
        }

        return ki2;
    }

    // 偶数のみを返す
    public static int[] getEven(int[] n) {
        ArrayList<Integer> gu = new ArrayList<Integer>();

        for (int k = 0; k < n.length; k++) {
            if (n[k] % 2 == 0) {
                gu.add(n[k]);

            }
        }
        int[] gu2 = new int[gu.size()];
        for (int m = 0; m < gu.size(); m++) {
            gu2[m] = gu.get(m);
        }
        return gu2;
    }

}
