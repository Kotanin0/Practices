package practices;

import java.util.ArrayList;
import java.util.List;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 *
 * 格納したListから、任意の文字列で都道府県を検索できる関数を作りなさい
 *
 * 関数名、引数、戻り値の指定はしません
 *
 */

public class Practice026 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        // ここはご自由にお使いください

        ArrayList<String> jpList = new ArrayList<String>();

        jpList.add("北海道");
        jpList.add("青森県");
        jpList.add("岩手県");
        jpList.add("宮城県");
        jpList.add("秋田県");
        jpList.add("山形県");
        jpList.add("福島県");
        jpList.add("茨城県");
        jpList.add("栃木県");
        jpList.add("群馬県");
        jpList.add("埼玉県");
        jpList.add("千葉県");
        jpList.add("東京都");
        jpList.add("神奈川県");
        jpList.add("新潟県");
        jpList.add("富山県");
        jpList.add("石川県");
        jpList.add("福井県");
        jpList.add("山梨県");
        jpList.add("長野県");
        jpList.add("岐阜県");
        jpList.add("静岡県");
        jpList.add("愛知県");
        jpList.add("三重県");
        jpList.add("滋賀県");
        jpList.add("京都府");
        jpList.add("大阪府");
        jpList.add("兵庫県");
        jpList.add("奈良県");
        jpList.add("和歌山県");
        jpList.add("鳥取県");
        jpList.add("島根県");
        jpList.add("岡山県");
        jpList.add("広島県");
        jpList.add("山口県");
        jpList.add("徳島県");
        jpList.add("香川県");
        jpList.add("愛媛県");
        jpList.add("高知県");
        jpList.add("福岡県");
        jpList.add("佐賀県");
        jpList.add("長崎県");
        jpList.add("熊本県");
        jpList.add("大分県");
        jpList.add("宮崎県");
        jpList.add("鹿児島県");
        jpList.add("沖縄県");

        System.out.println(getPrifecture("山",jpList));

    }

    //都道府県が格納されたリストと検索ワードが引数、戻り値は結果のリスト
    //getPrefectureメソッドの定義
    public static List<String> getPrifecture(String searchWord, List<String> jpList) {

        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < jpList.size(); i++) {
            String country = jpList.get(i);
            if (country.contains(searchWord)) {
                result.add(country);
            }
        }
        return result;
    }


}
