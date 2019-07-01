package practices;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        System.out.println(maxFruit());
        System.out.println(getFruitColor("ピンク"));
        System.out.println(getStockLargeAmount());
        System.out.println(getStockExist());

        // ここはご自由にお使いください
    }

//     一番単価の高い果物を返す関数

    public static String maxFruit() {

        return Practice027.fruitsList().stream()
                .max(Comparator.comparingInt(p -> p.getPrice()))
                .map(p -> p.getJapanName())
                .get();
    }

    //- 任意の色の果物を返す関数

    public static List<String> getFruitColor(String n) {

        return Practice027.fruitsList().stream()
                .filter(p -> p.getColor().contains(n))
                .map(p -> p.getJapanName())
                .collect(Collectors.toList());

    }

    // * - 在庫数が多い順で果物を返す関数

    public static List<String> getStockLargeAmount() {
        return Practice027.fruitsList().stream()
                .sorted(Comparator.comparingInt(Fruits::getStock).reversed())
                .map(p -> p.getJapanName())
                .collect(Collectors.toList());

    }


    // - 在庫がある果物のみを返す関数

    public static List<String> getStockExist() {
        return Practice027.fruitsList().stream()
                .filter(p -> p.getStock() != 0)
                .map(p -> p.getJapanName())
                .collect(Collectors.toList());
    }


}

