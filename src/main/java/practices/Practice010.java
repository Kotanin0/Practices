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
        //関数使用
        if (0 > n) throw new IllegalArgumentException("負の数は受け付けない");
        if (0 == n) return "0";
        return Integer.toBinaryString(n);

        //関数使用しない
//        int amari;
//        String answer = "";
//
//        while (n != 0) {
//            amari = n % 2;
//            answer = amari + answer;
//            n = n / 2;
//            //0じゃなかったら動く（0なら止まる）
//        }
//        return answer;
    }
}
