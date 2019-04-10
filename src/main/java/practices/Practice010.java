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
//        getBinary(-1);
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("0以上の値を入れてください");
        }

        // nを2で割ったあまり×桁数（ループ回数＝i）を加算してく
        // nが0になったら終了
        int bin = 0;
        int i=0;
        while (n>0){
            bin += (n % 2) * Math.pow(10 , i);
            Math.floor(n/=2);  // 切り捨て
            i++;
        }
        String strBinary = String.valueOf(bin);  // 数値→文字列変換
        return strBinary;
    }

}
