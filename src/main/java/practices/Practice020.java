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
//        System.out.println(isMailAddress("test@test.com"));
        System.out.println(isMailAddress("test"));
//        System.out.println(isMailAddress("test@test.co.jp"));
//        System.out.println(isMailAddress("test@test.ne.jp"));
//        System.out.println(isMailAddress("@test.com"));
    }

    public static boolean isPostNumber(String s) {
        String[] postNumber = {"^[0-9]{3}-[0-9]{4}$", "^[0-9]{7}$"};

        for (int i = 0; i < postNumber.length; i++) {
            if (s.matches(postNumber[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPhoneNumber(String t) {
        {
            String[] phoneNumber = {"^[0-9]{3}-[0-9]{4}-[0-9]{4}$", "^[0-9]{2}-[0-9]{4}-[0-9]{4}$", "^[0-9]{11}$"};
            for (int i = 0; i < phoneNumber.length; i++) {
                if (t.matches(phoneNumber[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMailAddress(String u) {
        String aText = "^[\\w!#%&'/=~`\\*\\+\\?\\{\\}\\^\\$\\-\\|]";
        String dotAtom = aText + "+" + "(\\." + aText + "+)*";
        String[] mailAddressEnd = {".com", ".co.jp", ".ne.jp"};

        if (!(u.matches(".*@.*"))){
            return false;
        }

        int index = u.indexOf("@");
        String str = u.substring(0, index);

        Pattern p = Pattern.compile(dotAtom);
        Matcher m = p.matcher(str);


        for (int i = 0; i < mailAddressEnd.length; i++) {
            if ((u.endsWith(mailAddressEnd[i])) &&  (m.find())) {
                return true;
            }
        }
        return false;
    }
}


//        String[] mailAddress = {dotAtom + "@" +".com", dotAtom + "@" +".co.jp", dotAtom + "@" +".ne.jp"};
//        for (int i = 0; i < mailAddress.length; i++) {
//        if(u.matches(mailAddress[i])){
//        return true;
//        }
//        }

//
//        String postNumber = "";
//        boolean rightPostNumber =false;
//        if( postNumber =="^[0-9]{3}-[0-9]{4}$"){
//            rightPostNumber = true;
//        } else if ( postNumber == "^[0-9]{7}$"){
//            rightPostNumber = true;
//    }

//    int i = 0;
//    boolean a = true;
//    boolean b = true;
//        System.out.println("a->"+a);
//                System.out.println("b->"+b);
//                System.out.println("u ->"+u);
//                System.out.println("str->"+str);
//                System.out.println("endwith->"+u.endsWith(mailAddressEnd[i]));
//                System.out.println("contains->"+(u.contains("@")));
//                System.out.println("contains->"+(str.contains(dotAtom)));
