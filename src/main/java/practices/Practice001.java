package practices;

/**
 * int 型の変数 x、y に数値を入力したときに
 *
 * - 和
 * - 差（x－y）
 * - 積
 * - 商
 * - 余り(x÷y)
 *
 * を求める関数になるメソッドを、それぞれ完成させなさい
 */

public class Practice001 {
    public static void main(String[] args) {
        // ここはご自由にお使いください


    }

    // 和
    public static int wa(int x, int y) {
        return x+y;
    }

    // 差
    public static int sa(int x, int y) {
        return x-y;
    }

    // 積
    public static int seki(int x, int y) {
        return x*y;
    }

    // 商
    public static int sho(int x, int y) {
        // 三項演算子を使用
        return y == 0 ? 0 : (x / y);
/*
        if(y == 0){
            return 0;
        } else {
            return x / y;
        }
*/
    }

    // 余り
    public static int amari(int x, int y) {
        // 三項演算子を使用
        return y == 0 ? 0 : (x % y);
/*
        if(y == 0){
            return 0;
        } else {
            return x % y;
        }
*/
    }
}
