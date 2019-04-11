package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 *
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 *
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

public class Practice006 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        int j =1;
        showKuku(j);
        j++;
    }

    // 九九の答え
    public static String showKuku(int n) {

        String x = "";
        String y = "";
        int e = 0;
        int i = 1;
        int k = 0;

        for (i = 2; i < 10; i++) {
               e = i * n;
               x = x +" "+ Integer.toString(e);

               }

        k = 1 * n;
        y = Integer.toString(k);

        return y + x;

               }

    }





