package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 *
 * 格納したListから、都・道・府・県をそれぞれ返す関数を作成しなさい
 *
 * 関数名：お好きなもので
 * 引数：都道府県が格納されたリスト、返却したいもの（都・道・府・県のいずれか）
 * 戻り値：リスト
 *
 * 例）府を返却したいときに戻る値は 大阪府・京都府の2つが格納されたリストとなる
 *
 * ただし、for文は利用せず、Stream を利用してください。
 *
 */

public class Practice025 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        List<String> result =makeAreaList().stream()
                .filter(s -> s.contains("県"))
                .collect(Collectors.toList());

        System.out.println(result);

//        // Practice024を使えなかった・・・
//        // for文使うとこうなる
//        ArrayList<ArrayList<String>> allList =Practice024.todoufukenList();
//        String searchKukaku = "県";
//        for(ArrayList<String> kukakuList:allList) {
//            for (String list : kukakuList) {
//                if (list.contains(searchKukaku)) {
//                    System.out.println(list);
//                }
//            }
//        }
    }

    public static ArrayList<String> makeAreaList() {
        ArrayList<String> areaList = new ArrayList<String>();
        areaList.add("東京都");
        areaList.add("北海道");
        areaList.add("京都府");
        areaList.add("大阪府");
        areaList.add("青森県");
        areaList.add("岩手県");
        areaList.add("宮城県");
        areaList.add("秋田県");
        areaList.add("山形県");
        areaList.add("福島県");
        areaList.add("茨城県");
        areaList.add("栃木県");
        areaList.add("群馬県");
        areaList.add("埼玉県");
        areaList.add("千葉県");
        areaList.add("神奈川県");
        areaList.add("新潟県");
        areaList.add("富山県");
        areaList.add("石川県");
        areaList.add("福井県");
        areaList.add("山梨県");
        areaList.add("長野県");
        areaList.add("岐阜県");
        areaList.add("静岡県");
        areaList.add("愛知県");
        areaList.add("三重県");
        areaList.add("滋賀県");
        areaList.add("京都府");
        areaList.add("大阪府");
        areaList.add("兵庫県");
        areaList.add("奈良県");
        areaList.add("和歌山県");
        areaList.add("鳥取県");
        areaList.add("島根県");
        areaList.add("岡山県");
        areaList.add("広島県");
        areaList.add("山口県");
        areaList.add("徳島県");
        areaList.add("香川県");
        areaList.add("愛媛県");
        areaList.add("高知県");
        areaList.add("福岡県");
        areaList.add("佐賀県");
        areaList.add("長崎県");
        areaList.add("熊本県");
        areaList.add("大分県");
        areaList.add("宮崎県");
        areaList.add("鹿児島県");
        areaList.add("沖縄県");

        return areaList;
    }
}
