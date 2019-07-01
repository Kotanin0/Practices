package practices;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        Random random = new Random();
        String[] todofukenName = {"都", "道", "府", "県"};

        for (int i = 0; i <= 30; i++) {
            int y = random.nextInt(5);
            System.out.println(kenMei(todofukenName[y]));
        }
    }

    public static List<String> kenMei(String n) {

        String todofuken[] = {"北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県",
                "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県",
                "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県",
                "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県",
                "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県",
                "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県",
                "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"
        };


        List<String> list = new ArrayList<String>();

        if (n.equals("県") || n.equals("都") || n.equals("道") || n.equals("府")) {
            for (String ken : todofuken) {
                if (ken.endsWith(n)) {
                    list.add(ken);
                }
            }
        }
        return list;
    }

}

