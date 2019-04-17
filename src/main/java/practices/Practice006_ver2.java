package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 *
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 *
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

public class Practice006_ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int num = 9;
        String result = showKuku(num);
        System.out.println(result);
    }
    // 九九の答え
    public static String showKuku(int n) {
        String kukuResult ="";
        if (n < 1 || n > 9) throw new IllegalArgumentException("1～9の値を入れてください");
        for (int i = 1; i <= 9; i++) {
            kukuResult += i * n + " ";
            }
        return kukuResult.trim();
    }
}
