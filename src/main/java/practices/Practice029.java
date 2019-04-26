package practices;

import java.util.ArrayList;
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
        List<Fruits> getMaxFruitsList = Practice027.fruitsList();
        //List<Fruits> getMaxFruitsList = new ArrayList<>();
        System.out.println(totalStockPriceMessege(getMaxFruitsList));
    }

    //一番単価が高い果物のリスト情報
    public static List<Fruits> maxPriceFruitsList(List<Fruits> getMaxFruitsList) {
        return getMaxFruitsList.stream()
                .filter(s -> s.getName().matches(Practice028.maxPriceFruits(getMaxFruitsList)))
                .collect(Collectors.toList());
    }

    public static String totalStockPriceMessege(List<Fruits> getMaxFruitsList) {
        //nullの処理
        if (getMaxFruitsList.size() == 0) return ("エラー（ null ）。");

        //一番単価が高い果物の単価
        int priceOfMaxPriceFruits = maxPriceFruitsList(getMaxFruitsList).get(0).getPrice();

        //一番単価が高い果物の在庫数
        int stockqtyOfMaxPriceFruits = maxPriceFruitsList(getMaxFruitsList).get(0).getStock();

        //一番単価が高い果物の在庫金額
        int totalStockPriceOfMaxPriceFruits = priceOfMaxPriceFruits * stockqtyOfMaxPriceFruits;

        System.out.println("世界一" + Practice028.maxPriceFruits(getMaxFruitsList) + "（" + priceOfMaxPriceFruits + "円）"
                + stockqtyOfMaxPriceFruits + "個" + totalStockPriceOfMaxPriceFruits + "円 お買い上げありがとうございます。");
        return "";
    }
}