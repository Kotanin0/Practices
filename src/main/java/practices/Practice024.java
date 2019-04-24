package practices;

import java.util.ArrayList;
import java.util.List;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 * <p>
 * 格納したListから、都・道・府・県をそれぞれ返す関数を作成しなさい
 * <p>
 * 関数名：お好きなもので
 * 引数：都道府県が格納されたリスト、返却したいもの（都・道・府・県のいずれか）
 * 戻り値：リスト
 * <p>
 * 例）府を返却したいときに戻る値は 大阪府・京都府の2つが格納されたリストとなる
 */

public class Practice024 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        prefectureType("都"); //
    }

    public static String prefectureType(String str) {

        String prefecture[] = {"北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県", "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県", "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県", "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県", "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県", "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"};

        String to = "都";
        List<String> toList = new ArrayList<String>();
        String dou = "道";
        List<String> douList = new ArrayList<String>();
        String fu = "府";
        List<String> fuList = new ArrayList<String>();
        String ken = "県";
        List<String> kenList = new ArrayList<String>();

        for (int i = 0; i < prefecture.length; i++)
            if (prefecture[i].endsWith(to)) {
                toList.add(prefecture[i]);
            } else if (prefecture[i].endsWith(dou)) {
                douList.add(prefecture[i]);
            } else if (prefecture[i].endsWith(fu)) {
                fuList.add(prefecture[i]);
            } else if (prefecture[i].endsWith(ken)) {
                kenList.add(prefecture[i]);
            }

        if (str == to) {
            for (int j = 0; j < toList.size(); j++) {
                System.out.println(toList.get(j));
            }
        } else if (str == dou) {
            for (int j = 0; j < douList.size(); j++) {
                System.out.println(douList.get(j));
            }
        } else if (str == fu) {
            for (int j = 0; j < fuList.size(); j++) {
                System.out.println(fuList.get(j));
            }
        } else if (str == ken) {
            for (int j = 0; j < kenList.size(); j++) {
                System.out.println(kenList.get(j));
            }
        }
        return "都道府県ないやつを入力してるよ";
    }
}


// "府"って入れたらfuListをリターンしたい


//    int i = 0;
//
//        for (i = 0; i < prefecture.length; i++)
//        if (prefecture[i].contains(str)) {
//        prefectureList.add(prefecture[i]);
//        }
//        for (int j = 0; j < prefectureList.size(); ++j) {
//        if (j != prefectureList.size()-1) {
//        System.out.print(prefectureList.get(j) + "・");
//        } else{
//        System.out.print(prefectureList.get(j));
//        }
//        }