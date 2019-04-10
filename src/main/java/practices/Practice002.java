package practices;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

public class Practice002 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int x = 5;
        boolean jadge1 = isOdd(x);

        if(jadge1){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }

    }

    // 偶数判定
    public static boolean isOdd(int n) {
        /**0が代入されたときのbooleanのメソッド内での0の返し方がわからない。*/
        if(n % 2 == 0 && n !=0) {
         //不要   boolean jadge = true;
            return true; //変数の返却から変更
        }else if(n % 2 != 0) {
        //不要    boolean jadge = false;
            return false; //上同様
        }else{
            //return false;
            throw new IllegalArgumentException("0が代入されたときのbooleanのメソッド内での0の返し方がわからない。");
        }
    }
}

