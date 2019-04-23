package practices;

import java.util.List;

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
        List<Fruits> fruit = Practice027.makeFruitsList();

        Practice028.mostExpensiveFruit(fruit).stream()
                .forEach(a -> System.out.println(a.getNameJpn() + "（" + a.getPrice() + "円）" + a.getStock() + "個" + a.getPrice() * a.getStock() + "円"));
        System.out.println("お買い上げありがとうございます");

    }


}
