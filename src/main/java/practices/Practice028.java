package practices;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Fruits> fruits = Practice027.returnFruitsList();

        System.out.println(("----番高い商品----"));
        Fruits maxPriceFruit = maxFruitsPrice(fruits);
        maxPriceFruit.printData();

        System.out.println(("---任意の色の商品(red)----"));
        List<Fruits> filterColorFruits = filterColorFromFruitsList(fruits, "red");
        for (Fruits f : filterColorFruits) {
            f.printData();
        }

        System.out.println(("----在庫数順----"));
        List<Fruits> fruitsListOrderByStock = sortFruitsListOrderByStock(fruits);
        for (Fruits f : fruitsListOrderByStock) {
            f.printNameAndStock();
        }

        System.out.println(("----在庫がある商品----"));
        fruits.get(0).setStocks(0);
        fruits.get(1).setStocks(0);
        fruits.get(2).setStocks(0);
        List<Fruits> FruitsIsInStock = filterFruitsListIsInStock(fruits);
        for (Fruits f : FruitsIsInStock) {
            f.printNameAndStock();
        }
    }

    //一番単価の高い果物を返す関数
    public static Fruits maxFruitsPrice(List<Fruits> fruits) {
        List<Fruits> x = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit2.getPrice() - fruit1.getPrice())
                .collect(Collectors.toList());
        return x.get(0);
    }

    //任意の色の果物を返す関数
    public static List<Fruits> filterColorFromFruitsList(List<Fruits> fruits, String filterColor) {
        return fruits.stream()
                .filter(i -> i.getColor().matches(filterColor))
                .collect(Collectors.toList());
    }

    //在庫数が多い順で果物を返す関数
    public static List<Fruits> sortFruitsListOrderByStock(List<Fruits> fruits) {
        return fruits.stream()
                .sorted((fruit1, fruit2) -> fruit2.getStocks() - fruit1.getStocks())
                .collect(Collectors.toList());
    }

    //在庫がある果物のみを返す関数
    public static List<Fruits> filterFruitsListIsInStock(List<Fruits> fruits) {
        return fruits.stream()
                .filter(i -> i.getStocks() > 0)
                .sorted((fruits1, fruits2) -> fruits2.getStocks() - fruits1.getStocks())
                .collect(Collectors.toList());
    }
}
