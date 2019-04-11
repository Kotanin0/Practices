package practices;

/**
 * 5の倍数と、5の付く数字のときに "buzz" と返却する関数 buzz を作成しなさい
 * <p>
 * 引数：整数
 * 返却："buzz" / "" (あてはまらない場合は空文字)
 */

public class Practice017 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        buzz(5);
    }

    // 5の倍数と、5の付く数字なら"buzz"
    public static String buzz(int n) {


        String i = Integer.toString(n);
        String j = "";
        boolean k;

        if (n == 0) {
            j = "";
        } else {
            k = n % 5 == 0 || i.contains("5") ? true : false;

            if (k) {
                j = "buzz";
            } else {
                j = "";
            }
        }
        return j;
    }


}
