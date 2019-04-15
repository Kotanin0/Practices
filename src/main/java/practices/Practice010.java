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
        System.out.println(getBinary(0));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {

        if (0 > n) throw new IllegalArgumentException("負の数は受け付けません");

        String nisin = "";

        if (n == 0) {
            nisin = "0";
        } else {

            while (n > 0) {
                if (n % 2 == 0) {
                    //0を頭に
                    nisin = "0" + nisin;
                    n = n / 2;
                } else {
                    //1を頭に
                    nisin = "1" + nisin;
                    n = n / 2;
                }
            }
        }

        return nisin;
    }

}
