
package practices;
import java.util.*;
//import java.util.stream.*;

import static com.sun.jmx.snmp.ThreadContext.contains;

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

        /*Stream型簡単なサンプルプログラム1
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
        */
        /*Stream型簡単なサンプルプログラム2
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream() // streamの取得
                .filter(i -> i % 2 == 0) // 中間操作
                .forEach(i -> System.out.println(i)); // 終端操作
*/

        // ここはご自由にお使いください
        //都道府県を格納
        ArrayList<String> prefecturesList = new ArrayList<>(Arrays.asList("北海道","青森県","岩手県","宮城県","秋田県","山形県","福島県","茨城県","栃木県","群馬県","埼玉県","千葉県","東京都","神奈川県","新潟県","富山県","石川県","福井県","山梨県","長野県","岐阜県","静岡県","愛知県","三重県","滋賀県","京都府","大阪府","兵庫県","奈良県","和歌山県","鳥取県","島根県","岡山県","広島県","山口県","徳島県","香川県","愛媛県","高知県","福岡県","佐賀県","長崎県","熊本県","大分県","宮崎県","鹿児島県","沖縄県"));
        //都道府県チェックメソッド呼び出し
        String order = "県";
        //checkPre(prefecturesList, order);
        System.out.println("戻り値確認："+checkPre(prefecturesList, order));
    }

    public static List<String> checkPre(List<String> preList, String order) {

        ArrayList<String> check = new ArrayList<>();
        preList.stream()
                .filter(i -> i.endsWith(order))
                .forEach(i -> check.add(i));
        System.out.println(check); //一応確認のため表示
        return check;

    }//checkメソッドend

}

