package practices;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 * <p>
 * - 一番単価の高い果物を返す関数
 * →
 * - 任意の色の果物を返す関数
 * →containsを使う。
 * - 在庫数が多い順で果物を返す関数
 * →sortメソッドを使う
 * - 在庫がある果物のみを返す関数
 * →0以外を返す。
 */

//streamを使って解いてみたんやで！！
public class Practice028 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        List<Fruits> fruits = Practice027.setFruits();

        System.out.println(("<一番単価の高い果物>"));
        Fruits maxPriceFruit = maxFruitsPricelist(fruits);
        maxPriceFruit.printInfomation();

        System.out.println(("<任意の色の果物>"));
        String checkColor = "赤";
        List<Fruits> AnyColor = returnAnyColorlist(fruits, checkColor);
        //リストでもらっているので拡張for文で配列にする。
        for (Fruits f : AnyColor) {
            f.printInfomation();
        }

        System.out.println(("<在庫数が多い順>"));
        List<Fruits> decreasingOrderFruitsStocks = returnDecreasingOrderFruitsStockslist(fruits);
        //リストでもらっているので拡張for文で配列にする。
        for (Fruits f : decreasingOrderFruitsStocks) {
            f.printInfomation();
        }

        System.out.println(("<在庫がある果物のみ>"));
        List<Fruits> FruitsInStocks = returnFruitsInStockslist(fruits);
        //リストでもらっているので拡張for文で配列にする。
        for (Fruits f : FruitsInStocks) {
            f.printInfomation();
        }

    }

    //一番単価の高い果物を返す関数
    public static Fruits maxFruitsPricelist(List<Fruits> fruits) {
        List<Fruits> fruitsPricelist = fruits.stream()/* stream()の取得 */
                .sorted((fruit1, fruit2) -> fruit2.getFruitsPrice() - fruit1.getFruitsPrice()) /* 中間操作 */
                .collect(Collectors.toList()); /* 終端操作 */
        return fruitsPricelist.get(0);
    }

    //任意の色の果物を返す関数 //リスト型で返す
    public static List<Fruits> returnAnyColorlist(List<Fruits> fruits, String checkColor) {
        return fruits.stream() //streamの取得
                .filter(i -> i.getFruitsColor().matches(checkColor))  /* 中間操作 */
                .collect(Collectors.toList()); /* 終端操作 */
    }

    //在庫数が多い順で果物を返す関数　//リスト型で返す
    public static List<Fruits> returnDecreasingOrderFruitsStockslist(List<Fruits> fruits) {
        return fruits.stream()
                .sorted((fruit1, fruit2) -> fruit2.getFruitsStocks() - fruit1.getFruitsStocks()) /* 中間操作 */
                .collect(Collectors.toList()); /* 終端操作 */
    }

    //在庫がある果物のみを返す関数 //リスト型で返す
    public static List<Fruits> returnFruitsInStockslist(List<Fruits> fruits) {
        return fruits.stream() //streamの取得
                .filter(j -> j.getFruitsStocks() > 0)/* 中間操作 */
                .sorted((fruits1, fruits2) -> fruits2.getFruitsStocks() - fruits1.getFruitsStocks())/* 中間操作 */
                .collect(Collectors.toList());/* 終端操作 */
    }
}



