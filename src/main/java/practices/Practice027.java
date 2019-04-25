package practices;

import java.util.*;


/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 * <p>
 * 果物クラスに入れる値はお任せします
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        List<Fruits> fruit = makeFruitsList();

        fruit.stream()
                .map(p -> p.getNameJpn())
                .forEach(System.out::println);
    }

    public static List<Fruits> makeFruitsList() {
        List<Fruits> fruit = new ArrayList<>();

        fruit.add(new Fruits("巨峰", "Kyoho grape", "purple", 2380, 100));
        fruit.add(new Fruits("ルビーグレープフルーツ", "Ruby grapefruit", "pink", 598, 0));
        fruit.add(new Fruits("スカイベリー", "Skyberry", "red", 1980, 100));
        fruit.add(new Fruits("清水白桃", "Shimizu white peach", "pink", 6900, 10));
        fruit.add(new Fruits("世界一りんご", "Sekaiichi apple", "red", 5300, 20));
        fruit.add(new Fruits("太陽のタマゴマンゴー", "Tamago of the Sun mango", "yellow", 8000, 10));
        fruit.add(new Fruits("夕張メロン", "Yubari Melon", "orange", 5000, 0));
        fruit.add(new Fruits("ランブータン", "Rambutan", "white", 1500, 300));
        fruit.add(new Fruits("マンゴスチン", "Mangosteen", "white", 980, 100));
        fruit.add(new Fruits("ゴールドバレルパイン", "Gold barrel pineapple", "yellow", 8000, 15));

        return fruit;
    }
}


