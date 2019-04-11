package practices;

/**
 * 入力された整数を2進数に変換する関数 getBinary を作成しなさい
 * <p>
 * 引数：整数
 * 返却：2進数の文字列
 * <p>
 * 　例）引数：18
 * 　　　返却：10010
 */

public class Practice010 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(getBinary(18));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("正の整数で入力してください");
        }

        String result = "";
        //int i = n;

        if (n == 0) {
            result = "0";
        }

        while (n != 0) {
            if (n % 2 == 0) {
                result = 0 + result;
            } else {
                result = 1 + result;
            }
            n = n / 2;
        }
        return result.trim();
    }

}
