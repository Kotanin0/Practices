package practices;

import java.util.ArrayList;

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

        // 都・道・府・県 のいずれかを指定する
        String searchKukaku = "県";

        // エラー判定をtodoufukenListの1つ目（index番号：0）に入れてるので+1する
        System.out.println(todoufukenList().get(keyKukaku(searchKukaku)+1));
    }

    public static int keyKukaku(String n) {
        ArrayList<String> kukaku = new ArrayList<String>();
        kukaku.add("都");
        kukaku.add("道");
        kukaku.add("府");
        kukaku.add("県");

        // todoufukenListのindex番号を返す、見つからなかったら-1が返る
        return kukaku.indexOf(n);
    }


    public static ArrayList todoufukenList() {
        ArrayList<String> errorList = new ArrayList<String>();
        errorList.add("見つかりませんでした");

        ArrayList<String> toList = new ArrayList<String>();
        toList.add("東京都");

        ArrayList<String> douList = new ArrayList<String>();
        douList.add("北海道");


        ArrayList<String> fuList = new ArrayList<String>();
        fuList.add("京都府");
        fuList.add("大阪府");

        ArrayList<String> kenList = new ArrayList<String>();
        kenList.add("青森県");
        kenList.add("岩手県");
        kenList.add("宮城県");
        kenList.add("秋田県");
        kenList.add("山形県");
        kenList.add("福島県");
        kenList.add("茨城県");
        kenList.add("栃木県");
        kenList.add("群馬県");
        kenList.add("埼玉県");
        kenList.add("千葉県");
        kenList.add("神奈川県");
        kenList.add("新潟県");
        kenList.add("富山県");
        kenList.add("石川県");
        kenList.add("福井県");
        kenList.add("山梨県");
        kenList.add("長野県");
        kenList.add("岐阜県");
        kenList.add("静岡県");
        kenList.add("愛知県");
        kenList.add("三重県");
        kenList.add("滋賀県");
        kenList.add("京都府");
        kenList.add("大阪府");
        kenList.add("兵庫県");
        kenList.add("奈良県");
        kenList.add("和歌山県");
        kenList.add("鳥取県");
        kenList.add("島根県");
        kenList.add("岡山県");
        kenList.add("広島県");
        kenList.add("山口県");
        kenList.add("徳島県");
        kenList.add("香川県");
        kenList.add("愛媛県");
        kenList.add("高知県");
        kenList.add("福岡県");
        kenList.add("佐賀県");
        kenList.add("長崎県");
        kenList.add("熊本県");
        kenList.add("大分県");
        kenList.add("宮崎県");
        kenList.add("鹿児島県");
        kenList.add("沖縄県");

        ArrayList<ArrayList<String>> todoufukenList = new ArrayList<ArrayList<String>>();
        todoufukenList.add(errorList);
        todoufukenList.add(toList);
        todoufukenList.add(douList);
        todoufukenList.add(fuList);
        todoufukenList.add(kenList);

        return todoufukenList;
    }


}
