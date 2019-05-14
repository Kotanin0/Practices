package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 *
 * 果物クラスに入れる値はお任せします
 *
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        // System.out.println(fruitsList());

    }

    public static List<Fruits> FruitsList(){

        ArrayList<Fruits> fruitsList = new ArrayList<>();

        fruitsList.add(new Fruits("はっさく", "hassaku", "yellow", 700, 100));
        fruitsList.add(new Fruits("マスカット", "muscat", "lightgreen", 500, 0));
        fruitsList.add(new Fruits("レモン", "lemon", "yellow", 100, 1000));
        fruitsList.add(new Fruits("キウイ", "kiwi", "green", 150, 1000));
        fruitsList.add(new Fruits("もも", "peach", "pink", 700, 200));
        fruitsList.add(new Fruits("さくらんぼ", "cherry", "red", 300, 2000));
        fruitsList.add(new Fruits("パイナップル", "pineapple", "yellow", 800, 300));
        fruitsList.add(new Fruits("マンゴー", "mango", "orange", 2000, 150));
        fruitsList.add(new Fruits("ブルーベリー", "blueberry", "purple", 300, 200));
        fruitsList.add(new Fruits("柿", "persimmon", "orange", 300, 500));

        return fruitsList;
    }

}
