package practices;

/**
 * 整数値を入力し、以下の4つの分類から該当するものを表示する関数 displayText を作成しなさい
 *
 * 引数：整数
 * 返却：以下の4つの文字列のいずれか
 * 正の偶数
 * 正の奇数
 * 負の偶数
 * 負の奇数
 *
 * ※ 負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 0 は 正の偶数 であるとする。
 */

public class Practice003 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 正の偶数、正の奇数、負の偶数、負の奇数のいずれかを返却する
    public static void String displayText(int n) {
        if (n % 2 == 0 && n / 2 < 0) {
            System.out.println("負の偶数");
        } else if (n % 2 == 1 && n / 2 < 0) {
            System.out.println("負の奇数");
        } else if (n % 2 == 0 && n / 2 > 0) {
            System.out.println("正の偶数");
        } else if (n % 2 == 1 && n / 2 > 0) {
            System.out.println("正の奇数");
        }
    }
}
