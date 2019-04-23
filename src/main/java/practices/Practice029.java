package practices;

import java.util.List;
import java.util.stream.Collectors;

/**
 * さらに果物リストを続けて利用し、以下の関数を作成しなさい
 * <p>
 * 一番単価が高い果物を在庫全て買い占める関数
 * 名前：お好きに
 * 引数：お好きに
 * 戻り値：合計金額
 * <p>
 * その関数を利用したときに、コンソールには以下のように出力されるイメージ
 * > 世界一りんご（2000円） 100個 200000円 お買い上げありがとうございます
 */

public class Practice029 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        List<Fruits> fruits = Practice027.setFruits();
        List<Fruits> byUplist = returnByUplist(fruits);
        for (Fruits f : byUplist) {
            f.printInfomation();
        }
    }

    public static List<Fruits> returnByUplist(List<Fruits> fruits) {
        List<Fruits> byUplist = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit2.getFruitsPrice() - fruit1.getFruitsPrice()) /* 中間操作 */
                .collect(Collectors.toList()); /* 終端操作 */
        byUplist.get(0).byUpFruitsInfomation();
        return byUplist;

    }


}
