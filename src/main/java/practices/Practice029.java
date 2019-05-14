package practices;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * さらに果物リストを続けて利用し、以下の関数を作成しなさい
 *
 * 一番単価が高い果物を在庫全て買い占める関数
 * 名前：お好きに
 * 引数：お好きに
 * 戻り値：合計金額
 *
 * その関数を利用したときに、コンソールには以下のように出力されるイメージ
 * > 世界一りんご（2000円） 100個 200000円 お買い上げありがとうございます
 *
 */

public class Practice029 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
       System.out.println(buyallmaxPrice());
    }

    public static String buyallmaxPrice() {

        //毎回maxPriceな商品を抽出するのは無駄なので一度の抽出に抑えたい＆028を上手く使いたいが…（ex.Practice028.maxPrice()～みたいな）

        String maxpriceName =
               Practice027.FruitsList().stream()
                .max(comparing(p -> p.getPrice()))
                .map(p -> p.getJapaneseName())
                .get();


        int maxpricePrice =
               Practice027.FruitsList().stream()
                .max(comparing(p -> p.getPrice()))
                .map(p -> p.getPrice())
                .get();

        int maxpriceStock =
               Practice027.FruitsList().stream()
                .max(comparing(p -> p.getPrice()))
                .map(p -> p.getStock())
                .get();

        return maxpriceName + "（" + maxpricePrice + "円" + "）" + " " + maxpriceStock + "個" + " " + (maxpriceStock * maxpricePrice) + "円" + " " + "お買い上げありがとうございます";

    }

}
