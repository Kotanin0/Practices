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
            throw new IllegalArgumentException("負の数は受け付けないはず");
        }
        if (n == 0) {
            return "0";
        }

        String nishinsu = "";

        while (n > 0) {
            nishinsu = (n % 2) + nishinsu;
            n = n / 2;
        }

        //こんな方法もある？
        //int i = n;
        //String nishinsu = Integer.toBinaryString(i);

        return nishinsu;
    }

}
