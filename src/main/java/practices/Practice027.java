package practices;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 * <p>
 * 果物クラスに入れる値はお任せします
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        System.out.println(fruitsList());

    }


    public static List<Fruits> fruitsList() {



        ArrayList<Fruits> fruitsList = new ArrayList<>();

        fruitsList.add(new Fruits("apple", "りんご", "赤", 100, 0));
        fruitsList.add(new Fruits("banana", "バナナ", "黄", 101, 11));
        fruitsList.add(new Fruits("orange", "オレンジ", "オレンジ", 102, 12));
        fruitsList.add(new Fruits("persimmon", "柿", "橙", 103, 13));
        fruitsList.add(new Fruits("guava", "グァヴァ", "ピンク", 105, 15));
        fruitsList.add(new Fruits("grapefruit", "グレープフルーツ", "黄", 106, 16));
        fruitsList.add(new Fruits("cherry", "さくらんぼ", "ピンク", 107, 17));
        fruitsList.add(new Fruits("plum", "スモモ", "ピンク", 108, 18));
        fruitsList.add(new Fruits("cherry", "さくらんぼ", "ピンク", 107, 17));
        fruitsList.add(new Fruits("dragon fruits", "ドラゴンフルーツ", "ピンク", 109, 19));


        return fruitsList;


    }
}


