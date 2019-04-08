package practices;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

public class Practice002 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int x = 5; int y = 0;
        boolean jadge1 = isOdd(x);
        boolean jadge2 = isOdd(y);

        if(jadge1){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }
        if(jadge2){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }
    }

    // 偶数判定
    public static boolean isOdd(int n) {
        /**0が代入されたときのbooleanのメソッド内での0の返し方がわからない。*/
        if(n % 2 == 0 && n !=0) {
            boolean jadge = true;
            return jadge;
        }else if(n % 2 != 0) {
            boolean jadge = false;
            return jadge;
        }else{
            //return false;
            throw new IllegalArgumentException("0が代入されたときのbooleanのメソッド内での0の返し方がわからない。");
        }
    }
}

