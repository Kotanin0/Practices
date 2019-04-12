package practices;

import java.util.regex.Pattern;

/**
 * 入力された文字列が郵便番号、電話番号、メールアドレス、それ以外のいずれかを判定する関数
 * isPostNumber
 * isPhoneNumber
 * isMailAddress
 * をそれぞれ作成しなさい
 *
 * isPostNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：7桁の連続した数値の文字列, 3桁-4桁の数値とハイフンで構成された文字列
 * 例：1234567=true, 123-4567=true, ...
 *
 * isPhoneNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：11桁の連続した数値の文字列, 数値とハイフン2つで構成された文字列
 * 例：09012345678=true, 090-1234-5678=true, 03-1234-5678=true, ...
 *
 * isMailAddress
 * 入力：文字列
 * 出力：true/false
 * 判定条件：@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
 * 例：hoge@fuga.com=true, anonymous123@hoge.co.jp=true, ...
 *
 */

public class Practice020 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(isMailAddress("test@test.com"));
        System.out.println(isMailAddress("test@test.co.jp"));
        System.out.println(isMailAddress("test@test.ne.jp"));
        System.out.println(isMailAddress("@test.com"));
        System.out.println(isMailAddress("test@test.co.uk"));
        System.out.println(isMailAddress("090-1234-5678"));

    }

       public static boolean isPostNumber(String s) {
        //k = s.matches("([0-9]{7}|[0-9]{3}-[0-9]{4})&&[^a-z][^A-Z]");
        return s.matches("[0-9]{3}-?[0-9]{4}");
    }


    public static boolean isPhoneNumber(String s) {

        return s.matches("[0-9]{3}-?[0-9]{4}-?[0-9]{4}");
    }

    public static boolean isMailAddress(String s) {

        return  s.matches(".+@.+((\\.com)|(\\.co.jp)|(\\.ne.jp))$");


        //苦しんだあとだわ。
        //[a-z]{1,100}@[a-z]{1,100}((.com)|(co.jp)|(ne.jp))$
        //^[a-z]&&com+$|(co.jp)+$|(ne.jp)+$&&[@]
        //[@]{1}[a-z]{1,100}(.com)${1}|(co.jp)${1}|(ne.jp)${1}
        //[a-z0-9]{1,100}@[a-z0-9]{1,100}((\\.com)|(\\.co.jp)|(\\.ne.jp))$
    }

}
