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
        boolean test;
        test =isPhoneNumber("03-1123-4567");
        System.out.println(test);
        test =isPhoneNumber("044-123-4567");
        System.out.println(test);
        test =isPhoneNumber("0480-12-5678");
        System.out.println(test);
        test =isPhoneNumber("04805-1-5678");
        System.out.println(test);
    }

    public static boolean isPostNumber(String s) {
        // 郵便番号：000-0000 または 0000000
        //
        if (s.matches("^[0-9]{3}-[0-9]{4}$")) return true;
        if (s.matches("^[0-9]{7}$")) return true;
        return false;

    }

    public static boolean isPhoneNumber(String s) {
        // ・・・0で始まり、ハイフン2つで区切られ、末尾が必ず数字になる、12桁か13桁の数字
        // （国内電話に限る）
        // https://qiita.com/tomgoodsun/items/f3050689ac84827d5af9

        // 電話番号（11桁）：0A0X0000000 or 0A0-X000-0000
        // 0には0-9が入る　Aには2,5-9が入る　Xには1-9が入る
        // ハイフンがある場合の挿入位置：前方は3字目の後で固定　後方は変動する
        if (s.matches("^0[2|5-9]0[1-9][0-9]{7}$")) return true;
        if (s.matches("^0[2|5-9]0-[1-9][0-9]*-[0-9]*$") && s.matches("^.{13}$")) return true;

        // 電話番号（10桁）：0XX0000000
        // or 0X-X000-0000 or 0XX-000-0000 or 0XX0-00-0000・・・
        // 一般用の電話番号は、2桁目・3桁目には0以外が入る（たぶん）
        // ハイフンがある場合の挿入位置は不定、必ず2つ
        if (s.matches("^0[1-9]{2}[0-9]7$")) return true;
        if (s.matches("^0[1-9]-[1-9][0-9]*-[0-9]*$") && s.matches("^.{12}$")) return true;
        if (s.matches("^0[1-9]{2}([0-9]?|[0-9]*)-[0-9]*-[0-9]*$") && s.matches("^.{12}$")) return true;
//        if (s.matches("^0[1-9]{2}-[0-9]*-[0-9]*$") && s.matches("^.{12}$")) return true;
//        if (s.matches("^0[1-9]{2}[0-9]*-[0-9]*-[0-9]*$") && s.matches("^.{12}$")) return true;

        return false;
    }

    public static boolean isMailAddress(String s) {
        // @を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる

        if (s.matches("^[0-9a-zA-Z]+\\@[0-9a-zA-Z]+\\.com$")) return true;
        if (s.matches("^[0-9a-zA-Z]+\\@[0-9a-zA-Z]+\\.co\\.jp$")) return true;
        if (s.matches("^[0-9a-zA-Z]+\\@[0-9a-zA-Z]+\\.ne\\.jp$")) return true;

        return false;
    }

}
