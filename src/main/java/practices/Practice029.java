package practices;

import java.util.Comparator;
import java.util.Optional;

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

        System.out.println(buyUpFruits());

    }


    public static Integer buyUpFruits() {

        //最高金額を商品をみつけて、在庫数を取り出す。

        int fruitsMaximumAmoutStock =
                Practice027.fruitsList().stream()
                        .max(Comparator.comparingInt(p -> p.getPrice()))
                        .map(p -> p.getStock())
                        .get()
                        .intValue();

        //最高金額を商品をみつけて、在庫数を取り出す。

        int fruitsMaximumAmout =
                Practice027.fruitsList().stream()
                        .max(Comparator.comparingInt(p -> p.getPrice()))
                        .map(p -> p.getPrice())
                        .get()
                        .intValue();

        //商品名

        String fruitsMaximumAmoutName =
                Practice027.fruitsList().stream()
                        .max(Comparator.comparingInt(p -> p.getPrice()))
                        .map(p -> p.getJapanName())
                        .get();


        //出力を出す。。

        System.out.println("お店で一番高い商品の" +
                fruitsMaximumAmoutName + "(" +
                fruitsMaximumAmout + "円）を" +
                fruitsMaximumAmoutStock + "点ご購入、" + "合計金額" +
                fruitsMaximumAmoutStock * fruitsMaximumAmout + "円です。");

        //合計金額を戻す。

        return fruitsMaximumAmoutStock * fruitsMaximumAmout;


    }


}




