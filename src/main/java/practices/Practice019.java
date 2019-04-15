package practices;

import java.util.*;

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
        System.out.println("商品金額");
        System.out.println(coincheck(898));
    }

    public static String coincheck(int n) {
        if (n <= 0) {
            return "";
        }

        //Map<Integer,Integer> counter = new HashMap<Integer,Integer>(); //貨幣、枚数 連想配列でとける？？
        int count = 0;
        int[] coinName = {500, 100, 50, 10, 5, 1};

        //改行コード
        String br = System.getProperty("line.separator");
        //空箱設定
        String strReturn = "";

        for (int i = 0; i < coinName.length; i++) {
            if (n > coinName[i]) {
                count = n / coinName[i];
                n = n % coinName[i];
                strReturn += coinName[i] + "円＝" + count + "枚" + br;
            }
        }
        return strReturn.trim();
    }

}






