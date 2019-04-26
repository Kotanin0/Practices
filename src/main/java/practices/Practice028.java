package practices;

import java.util.*;
import java.util.stream.Collectors;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 * <p>
 * - 一番単価の高い果物を返す関数
 * - 任意の色の果物を返す関数
 * - 在庫数が多い順で果物を返す関数
 * - 在庫がある果物のみを返す関数
 */

public class Practice028 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
//果物リストを準備
        List<Fruits> fruitsArrayList = Practice027.FruitsList();
//一番単価の高い果物を返す関数
/*Streamを使用しない場合のため、コメントアウト(念のため残しています)
        System.out.println("【一番単価の高い果物を返す関数ver1】");
        List<Fruits> maxPriceFruits = maxPriceFruitsNonStream(fruitsArrayList);
        maxPriceFruits.forEach(i -> i.printCheckFruits(maxPriceFruits));
*/

        System.out.println("【一番単価の高い果物を返す関数】");
        List<Fruits> maxPriceFruits = expensivePriceFruitsCheck(fruitsArrayList);
        maxPriceFruits.forEach(i -> i.printCheckFruits()); //備忘録）ラムダ式だとインデックス番号をカウント++で与えられない

//任意の色の果物を返す関数
        String anyColor = "赤";
        List<Fruits> anyColorFruitsList = hasAnyColorFruits(fruitsArrayList, anyColor);
        System.out.println("【任意の色の果物を返す関数：「" + anyColor + "」で抽出】");
        anyColorFruitsList.forEach(i -> i.printCheckFruits());

//在庫数が多い順で果物を返す関数
        List<Fruits> sortedByStockFruitsList = sortFruitsStock(fruitsArrayList);
        System.out.println("【在庫数が多い順で果物を返す関数】");
        sortedByStockFruitsList.forEach(i -> i.printCheckFruits());

//在庫がある果物のみを返す関数
        List<Fruits> remove0StockFruitsList = hasFruitsStock(fruitsArrayList);
        System.out.println("【在庫がある果物のみを返す関数】");
        remove0StockFruitsList.forEach(i -> i.printCheckFruits());
    }

    public static List<Fruits> expensivePriceFruitsCheck(List<Fruits> n) {
        //一度最大値を算出※きっとMAXと抽出を合わせられるはず。

         int maxPrice = n.stream()
                  .map(p -> p.getFruitsUnitPrice())
                  .max((p1, p2) -> Integer.compare(p1, p2))
                  .orElse(0);
          //最大値を算出したものと各値を比較したものを返す
          return n.stream()
                  .filter(x -> x.getFruitsUnitPrice() == maxPrice)
                  .collect(Collectors.toList());



    }

    //任意の色の果物を返す関数
    public static List<Fruits> hasAnyColorFruits(List<Fruits> n, String anyColor) {
        return n.stream()
                .filter(i -> i.getFruitsColor().equals(anyColor))
                .collect(Collectors.toList());
    }

    //在庫数が多い順で果物を返す関数
    public static List<Fruits> sortFruitsStock(List<Fruits> n) {
        return n.stream()
                .sorted((s1, s2) -> s2.getFruitsstock() - s1.getFruitsstock())
                .collect(Collectors.toList());
    }

    //在庫がある果物のみを返す関数
    public static List<Fruits> hasFruitsStock(List<Fruits> n) {
        return n.stream()
                .filter(i -> i.getFruitsstock() != 0)
                .collect(Collectors.toList());
    }

    //Streamを使わずに最大単価の果物を出力する方法
    public static List<Fruits> expensivePriceFruitsNonStream(List<Fruits> n) {
        int maxPrice = 0;
        int unitPrice;
        //リストの要素数だけプライスをチェックする。高ければ最高値に入れ、その要素番号を変数に代入する。
        List<Fruits> returnExpensivePriceFruits = new ArrayList<>();
        for (int i = 0; i < n.size(); i++) {
            unitPrice = n.get(i).getFruitsUnitPrice();
            if (maxPrice < unitPrice) {
                maxPrice = unitPrice;
            }
        }
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).getFruitsUnitPrice() == maxPrice) {
                returnExpensivePriceFruits.add(n.get(i));
            }
        }
        return returnExpensivePriceFruits;
    }
}
