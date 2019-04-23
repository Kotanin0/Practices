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
        totalStockPriceMessege();
    }

    //一番単価が高い果物リスト
    public static List<Fruits> totalStockPriceList() {
        List<Fruits> newFruitsList = Practice027.fruitsList();
        return newFruitsList.stream()
                .filter(s -> s.getName().equals(Practice028.maxPriceFruits()))
                .collect(Collectors.toList());
    }

    public static String totalStockPriceMessege() {
        int totalStockPrice = totalStockPriceList().get(0).getPrice() * totalStockPriceList().get(0).getStock();
        System.out.println("世界一" + Practice028.maxPriceFruits() + "（" + totalStockPriceList().get(0).getPrice() + "円）"
                + totalStockPriceList().get(0).getStock() + "個" + totalStockPrice + "円 お買い上げありがとうございます");
        return "";
    }
}
