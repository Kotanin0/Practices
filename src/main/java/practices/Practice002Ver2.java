package practices;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

public class Practice002Ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int x = 1;
        boolean jadge1 = isOdd(x);
        if(jadge1){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }

    }

    // 偶数判定
    public static boolean isOdd(int n) {
        if(n == 0) throw new IllegalArgumentException("0は入力させない");
        return n % 2 == 0 ;
    }
}

