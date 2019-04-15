package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 * <p>
 * 格納したListから、任意の文字列で都道府県を検索できる関数を作りなさい
 * <p>
 * 関数名、引数、戻り値の指定はしません
 */

public class Practice026 {
    public static void main(String[] args) {
        String[] prefectureList = new String[]{"北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県",
                "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県",
                "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県",
                "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県",
                "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県",
                "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県",
                "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"};
        //ArrayListに都道府県を格納。
        ArrayList<String> arrayPrefecture = new ArrayList<String>(Arrays.asList(prefectureList));

        // 格納したListから、任意の文字列で都道府県を検索できるようにする。
        String checkStr = "滋";
        System.out.println(prefecture(arrayPrefecture, checkStr));

    }

    public static List<String> prefecture(ArrayList<String> arrayPrefecture, String checkStr) {
        ArrayList<String> returnPrefecture = new ArrayList<String>();//最後に返す、ArrayListを定義する。
        arrayPrefecture.stream() //streamの取得
                .filter(i -> i.contains(checkStr))  /* 中間操作 */
                .forEach(returnPrefecture::add); /* 終端操作 */


        return returnPrefecture;
    }
}

