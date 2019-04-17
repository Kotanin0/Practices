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

public class Practice003_ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int num = 0;
        System.out.println("徳村さんケース：" + displayText(num));
        System.out.println("メソッド呼び出しケース：" + isPositive(num)+ "の" + isEven(num));
    }
    // 正の偶数、正の奇数、負の偶数、負の奇数のいずれかを返却する
    public static String displayText(int n) {
        if(n == 0) return "ゼロ";
        String s = n > 0 ? "正の" : "負の";
        s += n % 2 == 0 ? "偶数": "奇数";
        return s;
    }

    public static String isPositive(int n){
        if(n == 0) return "ゼロ";
        return n > 0 ? "正" : "負";
    }

    public static String isEven(int n){
        if(n == 0) return "";
        return n % 2 == 0 ? "偶数" : "奇数";
    }
}
