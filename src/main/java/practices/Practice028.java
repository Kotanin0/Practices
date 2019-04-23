package practices;

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

        List<Fruits> fruit = Practice027.makeFruitsList();

        fruit.stream()
                .map(p -> p.getNameJpn())
                .forEach(System.out::println);

        String searchColor = "pink";

        System.out.println("▼一番高い果物は：");
        mostExpensiveFruit(fruit).stream()
                .forEach(a -> System.out.println(a.getNameJpn() + " " + a.getPrice() + "円"));

        System.out.println("▼" + searchColor + "色の果物は：");
        searchColorFruit(fruit, searchColor).stream()
                .forEach(a -> System.out.println(a.getNameJpn() + " " + a.getColor() + "色"));

        System.out.println("▼在庫の多い順：");
        sortInDescendingStock(fruit).stream()
                .forEach(a -> System.out.println(a.getNameJpn() + " " + a.getStock() + "個"));

        System.out.println("▼在庫がある果物は：");
        hasStockFruit(fruit).stream()
                .forEach(a -> System.out.println(a.getNameJpn() + " " + a.getStock() + "個"));

    }

    public static List<Fruits> mostExpensiveFruit(List<Fruits> fruit) {
        Integer maxPrice = fruit.stream()
                .map(Fruits::getPrice)
                .max(Comparator.naturalOrder())
                .get();

        List<Fruits> resultFruit = fruit.stream()
                .filter(s -> s.getPrice() == maxPrice)
                .collect(Collectors.toList());

//        List<Fruits> resultFruit = fruit.stream()
//                .sorted((fruit1, fruit2) -> fruit2.getPrice() - fruit1.getPrice())
//                .collect(Collectors.toList());

//        List<Fruits> resultFruit = fruit.stream()
//                     .max((p1, p2) -> Fruits.compare(p1.getPrice(), p2.getPrice()))
//                .get();
        return resultFruit;
    }

    public static List<Fruits> searchColorFruit(List<Fruits> fruit, String searchColor) {
        List<Fruits> resultFruit = fruit.stream()
                .filter(s -> s.getColor() == searchColor)
                .collect(Collectors.toList());

        return resultFruit;
    }

    public static List<Fruits> sortInDescendingStock(List<Fruits> fruit) {
        List<Fruits> resultFruit = fruit.stream()
                .sorted(Comparator.comparingInt(Fruits::getStock).reversed())
                .collect(Collectors.toList());

        return resultFruit;
    }

    public static List<Fruits> hasStockFruit(List<Fruits> fruit) {
        List<Fruits> resultFruit = fruit.stream()
                .filter(s -> s.getStock() > 0)
                .collect(Collectors.toList());

        return resultFruit;
    }
}
