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
        //Fruits型の変数fruitsを設定。
        List<Fruits> fruits = setFruits();

    }

    public static List<Fruits> setFruits() {
        List<Fruits> list = new ArrayList<Fruits>();
        list.add(new Fruits("りんご", "Apple", "赤", 100, 80));
        list.add(new Fruits("いちご", "Strawberry", "赤", 200, 58));
        list.add(new Fruits("さくらんぼ", "Cherries", "赤", 150, 120));
        list.add(new Fruits("みかん", "Mandarin orange", "黄", 180, 200));
        list.add(new Fruits("かき", "persimmon", "黄", 220, 8));
        list.add(new Fruits("ばなな", "Banana", "黄", 80, 300));
        list.add(new Fruits("グレープフルーツ", "grapefruit", "黄", 120, 50));
        list.add(new Fruits("スターフルーツ", "Star fruit", "黄", 400, 10));
        list.add(new Fruits("パイナップル", "pineapple", "黄", 800, 2));
        list.add(new Fruits("チェリモヤ", "cherimoya", "緑", 460, 0));

        return list;
    }
}
