package practices;

import java.util.ArrayList;
import java.util.List;


/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 * <p>
 * 果物クラスに入れる値はお任せします
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        List<Fruits> NewFruitsList = fruitsList();
    }

    public static List<Fruits> fruitsList() {

        List<Fruits> fruitsList = new ArrayList<>();

        fruitsList.add(new Fruits("りんご", "apple", "red", 100, 10));
        fruitsList.add(new Fruits("みかん", "orange", "orange", 50, 20));
        fruitsList.add(new Fruits("さくらんぼ", "cherry", "pink", 200, 5));
        fruitsList.add(new Fruits("バナナ", "banana", "yellow", 20, 40));
        fruitsList.add(new Fruits("メロン", "melon", "green", 500, 1));
        fruitsList.add(new Fruits("いちご", "strawberry", "red", 300, 2));
        fruitsList.add(new Fruits("スイカ", "watermelon", "green", 400, 6));
        fruitsList.add(new Fruits("なし", "pear", "Yellowish", 120, 15));
        fruitsList.add(new Fruits("もも", "peach", "pink", 700, 30));
        fruitsList.add(new Fruits("レモン", "strawberry", "yellow", 700, 0));
        return fruitsList;
    }
}