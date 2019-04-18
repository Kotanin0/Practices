package practices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 * <p>
 * 格納したListから、任意の文字列で都道府県を検索できる関数を作りなさい
 * <p>
 * 関数名、引数、戻り値の指定はしません
 */

public class Practice026 {
    public static void main(String[] args) {

        System.out.println("検索したい県名文字列を打ち込んでください");
        Scanner sc = new Scanner(System.in);
        String k = sc.next();

        System.out.println(kenMeiSearch(k));
        // ここはご自由にお使いください
    }

    public static List kenMeiSearch(String k) {

        List<String> list = Arrays.asList("北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県",
                "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県",
                "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県",
                "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県",
                "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県",
                "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県",
                "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県");

        return list.stream()
                .filter(kenMei -> kenMei.contains(k))
                .collect(Collectors.toList());
//              .forEach(kenMei -> System.out.print(kenMei));


    }
}




