package practices;

/**
 * int 型の変数 x、y にそれぞれ数値を入力し
 * <p>
 * - 和
 * - 差（x－y）
 * - 積
 * - 商
 * - 余り(x÷y)
 * <p>
 * を求める関数をそれぞれ作成しなさい
 */

public class Practice001 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(wa(5, 4));

    }

    // 和
    public static int wa(int x, int y) {
        return x + y;
    }

    // 差
    public static int sa(int x, int y) {
        return x - y;
    }

    // 積
    public static int seki(int x, int y) {
        return x * y;
    }

    // 商
    public static int sho(int x, int y) {

        //三項演算子での記述
        return y == 0 ? 0 : x / y ;

        /*最初書いた三項演算子失敗例
         (y == 0) ? 0 : x / y ;
        */
        /*普通に書いたもの（冗長）
         if (y == 0) {
             return 0;
         } else {
             return x / y;
         }
        */
    }

    // 余り
    public static int amari(int x, int y) {

        //三項演算子での記述
        return y == 0 ? 0 : x % y ;

         /*普通に書いたもの（冗長）
        if (y == 0) {
            return 0;
        } else {
            return x % y;
        }
         */
    }
}
