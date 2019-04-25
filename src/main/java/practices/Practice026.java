package practices;

import java.util.Arrays;
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
        prefectureType("大");

    }

    public static String prefectureType(String str) {

//        String prefecture[] = {"北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県", "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県", "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県", "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県", "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県", "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"};
//        ArrayList<String> prefectureList = new ArrayList<String>();

        List<String> prefecturerList = Arrays.asList("北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県", "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県", "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県", "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県", "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県", "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県");
        prefecturerList.stream() // streamの取得
                .filter(i -> i.contains(str)) // 中間操作
                .forEach(i -> System.out.println(i)); // 終端操作

        return "";
    }

}

