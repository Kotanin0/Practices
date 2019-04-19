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
        Fruits item1 = new Fruits("リンゴ", "apple", "赤", 120, 400);
        Fruits item2 = new Fruits("イチゴ", "strawberry", "赤", 480, 120);
        Fruits item3 = new Fruits("すいか", "watermelon", "緑/黒", 2800, 60);
        Fruits item4 = new Fruits("グアバ", "guava", "緑", 600, 40);
        Fruits item5 = new Fruits("スターフルーツ", "star fruits", "黄緑", 850, 100);
        Fruits item6 = new Fruits("ドラゴンフルーツ", "dragon fruits", "ピンク", 700, 50);
        Fruits item7 = new Fruits("ポポー", "pawpaw", "黄緑", 300, 2);
        Fruits item8 = new Fruits("マンゴスチン", "mangosteen", "紫", 1100, 30);
        Fruits item9 = new Fruits("ミラクルフルーツ", "miraclefruit", "赤", 2000, 30);
        Fruits item10 = new Fruits("バナナ", "banana", "黄", 30, 1200);

        //フルーツ型のフルーツリストを定義
        ArrayList<Fruits> fruitsList = new ArrayList<>();

        //フルーツ型のフルーツリストにアイテムをそれぞれ代入
        fruitsList.add(item1);
        fruitsList.add(item2);
        fruitsList.add(item3);
        fruitsList.add(item4);
        fruitsList.add(item5);
        fruitsList.add(item6);
        fruitsList.add(item7);
        fruitsList.add(item8);
        fruitsList.add(item9);
        fruitsList.add(item10);

        //確認用
        for (int i = 0; i < fruitsList.size(); i++) {
            System.out.println(fruitsList.get(i).getjpName());
        }
        //確認用
        System.out.println(fruitsList);
    }


}


