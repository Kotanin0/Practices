package practices;

/**
 * 5の倍数と、5の付く数字のときに "buzz" と返却する関数 buzz を作成しなさい
 *
 * 引数：整数
 * 返却："buzz" / "" (あてはまらない場合は空文字)
 *
 */

public class Practice017 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 5の倍数と、5の付く数字なら"buzz"
    public static String buzz(int n) {
        String strN = String.valueOf(n);
        if(n == 0){
            return "";
        } else if(n % 5 == 0){
            return "buzz";
        }else if(strN.matches(".*5.*")){
            return "buzz";
        }
        return "";
    }
}
