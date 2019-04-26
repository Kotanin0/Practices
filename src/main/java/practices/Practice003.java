package practices;

/**
 * 整数値を入力し、以下の4つの分類から該当するものを表示する関数 displayText を作成しなさい
 * <p>
 * 引数：整数
 * 返却：以下の4つの文字列のいずれか
 * 正の偶数
 * 正の奇数
 * 負の偶数
 * 負の奇数
 * <p>
 * ※ 負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 0 は 正の偶数 であるとする。
 */

public class Practice003 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(displayText(10));

    }

    // 正の偶数、正の奇数、負の偶数、負の奇数のいずれかを返却する
    public static String displayText(int n) {
        String answer = n >= 0 ? "正の" : "負の";
        answer += n % 2 == 0 ? "偶数" : "奇数";
        return answer;
        //return (n % 2 == 0 && n >= 0) ? "正の偶数" : (n % 2 == 0 && 0 > n) ? "負の偶数" : (n % 2 != 0 && n > 0) ? "正の奇数" : "負の奇数";
    }
}

