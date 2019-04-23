package practices;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

//リファリタリング済み。ガード節を用いて改良してみた。

public class Practice002 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 偶数判定
    public static boolean isOdd(int n) {
        return n % 2 == 0;
    }

}

   /*public static boolean isOdd(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("0未満のため出力できません");
        }
        return (n % 2 == 0);
    }*/
