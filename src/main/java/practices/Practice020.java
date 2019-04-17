package practices;

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
        String regex1 = "やまだーーーたろう";
        System.out.println(regex1.matches("や.......う"));//true
        System.out.println(regex1.matches("^やま.*"));//true
        System.out.println(regex1.matches("やまだー*たろう"));//true
        String regex2 = "やまもたろう";
        System.out.println(regex2.matches("やまもと*たろう"));//true
        System.out.println(regex2.matches("やまもと+たろう"));//false
        System.out.println(regex2.matches("やまもと?たろう"));//true
        System.out.println(regex1.matches("やまだー+たろう"));//true
        System.out.println(regex1.matches("やまもたろう|やまだーーーたろう"));//true
        System.out.println(regex2.matches("やまもたろう|やまだーーーたろう"));//true
        String regex3 = "今日は晴です";
        String regex4 = "今日は雪です";
        System.out.println(regex3.matches("今日は[晴雨]です"));//true
        System.out.println(regex4.matches("今日は[晴雨]です"));//false
    }

    public static boolean isPostNumber(String s) {
        return s.matches("^[0-9]{3}-?[0-9]{4}$");
    }

    //読みづらいきがする
    public static boolean isPhoneNumber(String s) {
        return s.matches("[0-9]{11}|[0-9]{3}-[0-9]{4}-[0-9]{4}|[0-9]{2}-[0-9]{4}-[0-9]{4}");
    }

    public static boolean isMailAddress(String s) {
        return s.matches("^..*@.*(\\.com|\\.co\\.jp|\\.ne\\.jp)$");
    }
}
