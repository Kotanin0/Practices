package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 * <p>
 * 果物クラスに入れる値はお任せします
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        List<Fruits> fruits = returnFruitsList();
    }

    public static List<Fruits> returnFruitsList() {
        List<Fruits> fruits = new ArrayList<Fruits>();
        fruits.add(new Fruits("オレンジ", "orange", "orange", 100, 100));
        fruits.add(new Fruits("ブドウ", "grape", "purple", 1000, 10));
        fruits.add(new Fruits("バナナ", "banana", "yellow", 100, 5));
        fruits.add(new Fruits("いちご", "strawberry", "red", 2000, 1));
        fruits.add(new Fruits("桃", "peach", "pink", 4000, 10000));
        fruits.add(new Fruits("メロン", "melon", "green", 4500, 10));
        fruits.add(new Fruits("ラズベリー", "raspberry", "red", 455, 13));

        return fruits;
    }
}
