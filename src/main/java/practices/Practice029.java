package practices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static practices.Practice027.getList;
import static practices.Practice028.getHighPrice;

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
        getTotalAmaunt();
    }

    public static int getTotalAmaunt() {

        //一番高い単価が何円なのかを確認する
        List<Fruits> fruits029 = getList();
        ArrayList<Fruits> sortedPrice =
                fruits029.stream()
                        .sorted(Comparator.comparing(Fruits::getUnitPrice).reversed()) //単価の大きい順にソート
                        .collect(Collectors.toCollection(ArrayList::new));//その順番でリストに格納する

        double highestPrice = sortedPrice.get(0).getUnitPrice();//一番高い単価を決定

        //一番高い単価の果物だけのフルーツリストを作成する
        ArrayList<Fruits> highestPriceFruits =
                fruits029.stream()  //streamの取得
                        .filter(s -> s.getUnitPrice() == highestPrice)
                        .collect(Collectors.toCollection(ArrayList::new));

        //合計金額（戻り値）を計算する(一旦for文で書く）
        int totalAmount = 0;

        for (int i = 0; i < highestPriceFruits.size(); i++) {
            totalAmount += highestPriceFruits.get(i).getUnitPrice() * highestPriceFruits.get(i).getStock();
        }

        //コンソールに出力する
        for (int i = 0; i <highestPriceFruits.size(); i++) {
            System.out.println(highestPriceFruits.get(i).getjpName() + 
                    " (" + highestPriceFruits.get(i).getUnitPrice() + "円）"
                    + highestPriceFruits.get(i).getStock() + "個");
        }
            System.out.println(totalAmount + "円　お買い上げありがとうございます");

        return totalAmount;

    }
}