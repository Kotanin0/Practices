package practices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 入力された文字列が郵便番号、電話番号、メールアドレス、それ以外のいずれかを判定する関数
 * isPostNumber
 * isPhoneNumber
 * isMailAddress
 * をそれぞれ作成しなさい
 * <p>
 * isPostNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：7桁の連続した数値の文字列, 3桁-4桁の数値とハイフンで構成された文字列
 * 例：1234567=true, 123-4567=true, ...
 * <p>
 * isPhoneNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：11桁の連続した数値の文字列, 数値とハイフン2つで構成された文字列
 * 例：09012345678=true, 090-1234-5678=true, 03-1234-5678=true, ...
 * <p>
 * isMailAddress
 * 入力：文字列
 * 出力：true/false
 * 判定条件：@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
 * 例：hoge@fuga.com=true, anonymous123@hoge.co.jp=true, ...
 */

public class Practice020 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    public static boolean isPostNumber(String s) {
        Pattern p = Pattern.compile("^[0-9]{3}(-|)[0-9]{4}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static boolean isPhoneNumber(String s) {
        Pattern p1 = Pattern.compile("^[0-9]{2,4}-[0-9]{2,4}-[0-9]{3,4}$");
        Pattern p2 = Pattern.compile("[0-9]{11}");
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        return m1.matches() || m2.matches();
    }

    public static boolean isMailAddress(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+@[a-z0-9]+(\\.com$|\\.co\\.jp$|\\.ne\\.jp$)");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}

