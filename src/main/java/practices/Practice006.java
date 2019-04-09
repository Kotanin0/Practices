package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 * <p>
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 * <p>
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

public class Practice006 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 九九の答え
    public static String showKuku(int n) {
        int[] k = new int[9];
        if (0 >= n || 10 < n) {
            throw new IllegalArgumentException("割り切れない");
        } else {
            for (int i = 0; i < 9; i++) {
                k[i] = n * (i + 1);
            }
            return k[0] + " " + k[1] + " " + k[2] + " " + k[3] + " " + k[4] + " " + k[5] + " " + k[6] + " " + k[7] + " " + k[8];
        }
    }

}
