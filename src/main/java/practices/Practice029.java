package practices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<Fruits> fruits = Practice027.returnFruitsList();

        fruits = buyAllStockFromMostExpenciveFruit(fruits);
        for (Fruits f : fruits) {
            f.printNamePriceAndStock();
        }
    }

    public static List<Fruits> buyAllStockFromMostExpenciveFruit(List<Fruits> fruits) {
        List<Fruits> x = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit2.getPrice() - fruit1.getPrice())
                .collect(Collectors.toList());

        x.get(0).buyUpAlltheFruit();
        return x;
    }
}
