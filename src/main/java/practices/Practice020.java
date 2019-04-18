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


        isMailAddress("stoyama@askul.com");
    }


    public static boolean isPostNumber(String s) {
        {
            String[] postNumber = {"^[0-9]{3}-[0-9]{4}$", "^[0-9]{11}$"};
            String str = "s";
            for (int i = 0; i < postNumber.length; i++) {
                if (!(str.equals(postNumber[i]))) ;
            }

            return false;
        }

        public static boolean isPhoneNumber (String s){
            {
                String[] phoneNumber = {"^[0-9]{3}-[0-9]{4}$", "^[0-9]{7}$"};
                String str = "s";
                for (int i = 0; i < phoneNumber.length; i++) {
                    if (!(str.equals(phoneNumber[i]))) ;
                }
            }
            return false;
        }

        public static boolean isMailAddress (String s){
            {
                String[] mailAdressEnd = {".com", ".co.jp", ".ne.jp"};
                String str = "s";
                for (int i = 0; i < mailAdressEnd.length; i++) {
                    if (!(str.endsWith(mailAdressEnd[i])) || !(str.contains("@"))) ;
                }
            }
            return false;
        }

    }}