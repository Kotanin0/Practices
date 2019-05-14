package practices;

import java.util.ArrayList;

/**
 * 配列の中身を奇数と偶数に分類する関数 getOdd, getEven を作成しなさい
 *
 * getOdd
 * 引数：整数の配列
 * 返却：奇数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[1, 3, 5, 7, 9]
 *
 * getEven
 * 引数：整数の配列
 * 返却：偶数のみの配列
 *
 * 　例）引数：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 　　　返却：[0, 2, 4, 6, 8]
 *
 */

public class Practice011 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 奇数のみを返す
    public static int[] getOdd(int[] n) {

        //奇数入れる空リストを作成する
        //引数の数が謎だから、配列ではなく可変長のリストで対応
        ArrayList<Integer> ks = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            //奇数だったら奇数リストに入れていく
            if (n[i] % 2 != 0) {
                ks.add(n[i]);
            }
        }
        //リストと同じ要素の数を持った配列を作って代入していく
        //配列に再度するのは、配列に返す場合リスト形式では返せないから。、
        int[] kisu = new int[ks.size()];
        for (int g = 0; g < ks.size(); g++) {
            kisu[g] = ks.get(g);

        } return kisu;
    }



    // 偶数のみを返す
    public static int[] getEven(int[] n) {

        ArrayList<Integer> gs = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                gs.add(n[i]);
            }
        }
        int[] gusu = new int[gs.size()];
        for (int g = 0; g < gs.size(); g++) {
            gusu[g] = gs.get(g);

        } return gusu;
    }

}
