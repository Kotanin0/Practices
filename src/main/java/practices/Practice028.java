package practices;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 * <p>
 * - 一番単価の高い果物を返す関数
 * <p>
 * - 任意の色の果物を返す関数
 * <p>
 * - 在庫数が多い順で果物を返す関数
 * <p>
 * - 在庫がある果物のみを返す関数
 */

public class Practice028 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(maxPriceFruits());
        System.out.println(fruitsColor("red"));
        System.out.println(manyStockFruits());
        System.out.println(inStockFruits());
    }

    //一番単価の高い果物を返す関数
    public static String maxPriceFruits() {
        List<Fruits> newFruitsList = Practice027.fruitsList();
        return newFruitsList.stream()
                .max(Comparator.comparing(s -> s.getPrice()))
                .map(s -> s.getName())
                .get();
    }

    //任意の色の果物を返す関数
    public static List<String> fruitsColor(String color) {
        List<Fruits> newFruitsList = Practice027.fruitsList();
        return newFruitsList.stream()
                .filter(s -> s.getColor().equals(color))
                .map(s -> s.getName())
                .collect(Collectors.toList());
    }

    //在庫数が多い順で果物を返す関数
    public static List<String> manyStockFruits() {
        List<Fruits> newFruitsList = Practice027.fruitsList();
        return newFruitsList.stream()
                .sorted(comparing(Fruits::getStock).reversed())
                .map(s -> s.getName())
                .collect(Collectors.toList());
    }

    //在庫がある果物のみを返す関数
    public static List<String> inStockFruits() {
        List<Fruits> newFruitsList = Practice027.fruitsList();
        return newFruitsList.stream()
                .filter(s -> s.getStock() != 0)
                .map(s -> s.getName())
                .collect(Collectors.toList());
    }
}