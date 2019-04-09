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

    }

    // 九九の答え
    public static String showKuku(int n) {
        if (n == 1) {
            return ("1 2 3 4 5 6 7 8 9");
        } else if (n == 2) {
            return ("2 4 6 8 10 12 14 16 18");
        } else if (n == 3) {
            return ("3 6 9 12 15 18 21 24 27");
        } else if (n == 4) {
            return ("4 8 12 16 20 24 28 32 36");
        } else if (n == 5) {
            return ("5 10 15 20 25 30 35 40 45");
        } else if (n == 6) {
            return ("6 12 18 24 30 36 42 48 54");
        } else if (n == 7) {
            return ("7 14 21 28 35 42 49 56 63");
        } else if (n == 8) {
            return ("8 16 24 32 40 48 56 64 72");
        } else if (n == 9) {
            return ("9 18 27 36 45 54 63 72 81");
        } else {
            return (" ");
        }
    }
}
