package practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


/**
 * Practice027で作成した果物リストを用いて、以下の関数をそれぞれ作成しなさい
 *
 * - 一番単価の高い果物を返す関数
 *
 * - 任意の色の果物を返す関数
 *
 * - 在庫数が多い順で果物を返す関数
 *
 * - 在庫がある果物のみを返す関数
 *
 */

public class Practice028 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(maxPrice());
        System.out.println(searchColor("yellow"));
        System.out.println(indecreasingorderStock());
        System.out.println(availableStock());
    }

        //一番単価の高い果物を返す関数

        public static String maxPrice(){

            return Practice027.FruitsList().stream()
                    .max(comparing(p -> p.getPrice()))
                    .map(p -> p.getJapaneseName())
                    .get();
        }

        //- 任意の色の果物を返す関数

        public static List<String> searchColor(String n) {

            return Practice027.FruitsList().stream()
                    .filter(p -> p.getColor().equals(n))
                    .map(p -> p.getJapaneseName())
                    .collect(Collectors.toList());

    }

        //在庫数が多い順で果物を返す関数

        public static List<String> indecreasingorderStock() {

            return Practice027.FruitsList().stream()
                    .sorted(comparing(Fruits::getStock).reversed())
                    .map(p -> p.getJapaneseName())
                    .collect(Collectors.toList());

    }

        //在庫がある果物のみを返す関数

        public static List<String> availableStock() {

            return Practice027.FruitsList().stream()
                    .filter(p -> p.getStock() != 0)
                    .map(p -> p.getJapaneseName())
                    .collect(Collectors.toList());

    }


    }

