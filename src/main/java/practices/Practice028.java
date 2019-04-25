package practices;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 * <p>
 * - 一番単価の高い果物を返す関数
 * * <p>
 * - 任意の色の果物を返す関数
 * <p>
 * - 在庫数が多い順で果物を返す関数
 * <p>
 * - 在庫がある果物のみを返す関数
 */

public class Practice028 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        List<Fruits> getFruitsList = Practice027.fruitsList();

        //一番単価の高い果物
        System.out.println("=====一番単価が高い果物=====");
        //Fruits maxPriceFruitsList = maxPriceFruits(getFruitsList);
        //maxPriceFruitsList.printData();
        System.out.println(maxPriceFruits(getFruitsList));
        
        //任意の色の果物
        System.out.println("=====赤色の果物=====");
        List<Fruits> fruitsColorList = fruitsColor(getFruitsList, "red");
        for (Fruits i : fruitsColorList) {
            i.printData();
        }

        //在庫数が多い順で果物
        System.out.println("=====在庫が多い順=====");
        List<Fruits> manyStockFruitsList = manyStockFruits(getFruitsList);
        for (Fruits i : manyStockFruitsList) {
            i.printData();
        }

        //在庫がある果物
        System.out.println("=====在庫がある商品=====");
        List<Fruits> inStockFruitsList = inStockFruits(getFruitsList);
        for (Fruits i : inStockFruitsList) {
            i.printData();
        }
    }

    //一番単価の高い果物を返す関数
    public static String maxPriceFruits(List<Fruits> getFruitsList) {
        return getFruitsList.stream()
                .max(Comparator.comparing(s -> s.getPrice()))
                .map(s -> s.getName())
                .get();
    }

    //任意の色の果物を返す関数
    public static List<Fruits> fruitsColor(List<Fruits> getFruitsList, String color) {
        return getFruitsList.stream()
                .filter(s -> s.getColor().matches(color))
                .collect(Collectors.toList());
    }

    //在庫数が多い順で果物を返す関数
    public static List<Fruits> manyStockFruits(List<Fruits> getFruitsList) {
        return getFruitsList.stream()
                .sorted(comparing(Fruits::getStock).reversed())
                .collect(Collectors.toList());
    }

    //在庫がある果物のみを返す関数
    public static List<Fruits> inStockFruits(List<Fruits> getFruitsList) {
        return getFruitsList.stream()
                .filter(s -> s.getStock() != 0)
                .collect(Collectors.toList());
    }
}


//一番単価の高い果物を返す関数【リスト抽出した際】
//    public static Fruits maxPriceFruits(List<Fruits> getFruitsList) {
//        List<Fruits> f =  getFruitsList.stream()
//                    .sorted(comparing(Fruits::getPrice).reversed())
//                    .collect(Collectors.toList());
//        return f.get(0);
//    }