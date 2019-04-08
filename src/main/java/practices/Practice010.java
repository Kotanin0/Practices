package practices;

/**
 * 入力された整数を2進数に変換する関数 getBinary を作成しなさい
 *
 * 引数：整数
 * 返却：2進数の文字列
 *
 * 　例）引数：18
 * 　　　返却：10010
 *
 */

public class Practice010 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(getBinary(0));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {
        if(n < 0){
            throw new IllegalArgumentException("引数の値が不正です");
        }
        if(n == 0){
            return "0";
        }

        String returnBinary = "";
        while (n > 0){
            returnBinary = (n % 2) + returnBinary;
            n = n / 2;
        }
        return returnBinary;
    }
}
