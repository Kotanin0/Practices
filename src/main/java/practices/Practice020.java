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
        System.out.println(isPostNumber("3334567"));
    }

    public static boolean isPostNumber(String s) {

        //もっとシンプルに書いてみる
        //String pattern = "[0-9]{3}-[0-9]{4}";
        //String pattern2 = "[0-9]{7}";
        //Pattern p = Pattern.compile(pattern);
        //Pattern q = Pattern.compile(pattern2);
        //Matcher a = p.matcher(s);
        //Matcher b = q.matcher(s);

        return s.matches("[0-9]{3}-[0-9]{4}") || s.matches("[0-9]{7}");
    }

    public static boolean isPhoneNumber(String s) {

        //もっとシンプルに書いてみる
       // String pattern = "[0-9]{11}";
       // String pattern2 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
       // String pattern3 = "[0-9]{2}-[0-9]{4}-[0-9]{4}";
        // Pattern p = Pattern.compile(pattern);
        //Pattern q = Pattern.compile(pattern2);
        //Pattern r = Pattern.compile(pattern3);
        //Matcher a = p.matcher(s);
        //Matcher b = q.matcher(s);
        //Matcher c = r.matcher(s);

        return s.matches("[0-9]{11}") || s.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}") || s.matches("[0-9]{2}-[0-9]{4}-[0-9]{4}");
    }

    public static boolean isMailAddress(String s) {

        return s.matches(".+.@.+.") && (s.endsWith(".com") || s.endsWith(".co.jp")|| s.endsWith(".ne.jp"));
    }

}
