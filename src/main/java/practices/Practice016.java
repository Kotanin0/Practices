package practices;

/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却する関数 fizz を作成しなさい
 * <p>
 * 引数：整数
 * 返却："fizz" / "" (あてはまらない場合は空文字)
 */

public class Practice016 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        fizz(-13);

    }

    // 3の倍数と、3の付く数字なら"fizz"
    public static String fizz(int n) {
        if (n==0) return "";
        String three = "3";

        String strN = String.valueOf(n);
//        strN.indexOf(3) != -1; // 3が含まれればTrue
//        n % 3 == 0; // 3で割り切れればTrue
        String result = "";
        if (strN.indexOf(three) != -1 || n % 3 == 0){
            result = "fizz";
        }
        return result;
    }

}
