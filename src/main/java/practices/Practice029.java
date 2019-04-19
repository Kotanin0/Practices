package practices;

import java.util.ArrayList;
import java.util.List;

/**
 * さらに果物リストを続けて利用し、以下の関数を作成しなさい
 * 一番単価が高い果物を在庫全て買い占める関数
 * 名前：お好きに
 * 引数：お好きに
 * 戻り値：合計金額
 *
 * その関数を利用したときに、コンソールには以下のように出力されるイメージ
 * > 世界一りんご（2000円） 100個 200000円 お買い上げありがとうございます
 */

public class Practice029 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
//処理の流れ①まずはpractice28からmaxプライスの商品を抽出
//その変数を今回の問題の関数に渡す
//メソッド内で合計金額を出す
//表示する
        List<Fruits> fruitsArrayList = Practice027.FruitsList();
        List<Fruits> expensiveFruitsList = Practice028.maxPriceFruitsCheck(fruitsArrayList);
//購入金額の算出
        int totalPurchaseCost = toBuyExpensivePriceFruitCost(expensiveFruitsList);
//まず購入対象の商品を表示する
        expensiveFruitsList.forEach(i -> i.printThanksForBuyingExpensiveFruitsMessage());
        System.out.println("合計："+ totalPurchaseCost + "円のお買い上げありがとうございます！！");

    }

    public static int toBuyExpensivePriceFruitCost(List<Fruits> n){
        int itemSum = 0;
        for (int i = 0; i < n.size() ; i++) {
            itemSum += n.get(i).getFruitsUnitPrice() * n.get(i).getFruitsstock();
        }
        return itemSum;
/*
        int totalCost = n.stream()
                .map(p -> p.getFruitsUnitPrice())
                .max((p1, p2) -> Integer.compare(p1,p2))
                .orElse(0);


        int unitPrice = maxPriceFruits.get(0).getFruitsUnitPrice();
        int totalPurchaseCount = maxPriceFruits.get(0).getFruitsstock();
        int totalPurchaseCost = unitPrice * totalPurchaseCount;
        return totalPurchaseCost;
*/
    }


}
