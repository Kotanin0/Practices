package practices;


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
 * * 例：09012345678=true, 090-1234-5678=true, 03-1234-5678=true, ...
 * *
 * isMailAddress
 * 入力：文字列
 * 出力：true/false
 * 判定条件：@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
 * 例：hoge@fuga.com=true, anonymous123@hoge.co.jp=true, ...
 */

public class Practice020 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(isPostNumber("1234567"));
        System.out.println(isPostNumber("123-4567"));
        System.out.println(isPostNumber("12345678"));
        System.out.println(isPhoneNumber("09012345678"));
        System.out.println(isPhoneNumber("090-1234-56789"));
        System.out.println(isMailAddress("test@test.com"));
        System.out.println(isMailAddress("test@testne.jp"));
        System.out.println(isMailAddress("test@test.uk"));
        System.out.println(isMailAddress("@test.com"));

    }

    public static boolean isPostNumber(String s) {
        //return s.matches("^[0-9]{7}|[0-9]{3}-[0-9]{4}$");
        //英数字をだす→\\d
        return s.matches("^\\d{7}|\\d{3}-\\d{4}");
        //return false;
    }

    public static boolean isPhoneNumber(String s) {
        return s.matches("^\\d{11}|\\d{3}-\\d{4}-\\d{4}|\\d{2}-\\d{4}-\\d{4}$");
        //return false;
    }

    public static boolean isMailAddress(String s) {
        return s.matches("^[\\w.!#$%&'*+/=?^_`{|}~-]+@[\\w.!#$%&'*+/=?^_`{|}~-]+(\\.com$|\\.co.jp|\\.ne.jp$)");
        //return s.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
    //return false;

}
