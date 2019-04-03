package practices;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

public class Practice002 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
    }

    // 偶数判定
    public static boolean isOdd(int n) {
        if(n < 0){
            throw  new IllegalArgumentException("負の数は受け付けません");
        }
        return (n % 2 == 0);
    }
}
