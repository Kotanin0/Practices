package practices;

import java.util.ArrayList;
import java.util.List;
/**
 * 果物クラスを利用して、果物を10種類程度保持する果物リストを作成してください
 * <p>
 * 果物クラスに入れる値はお任せします
 * （自分メモ）果物リストを作る問題。果物クラスはインスタンスクラスとして利用
 * 果物リスト＝リスト（≠配列）つまりリストを使ってみる。
 */

public class Practice027 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        FruitsList();
    }

    public static List<Fruits> FruitsList(){
        List<Fruits> fruitsList = new ArrayList<>();

        fruitsList.add(new Fruits("りんご", "apple", "赤", 100, 300));
        fruitsList.add(new Fruits("みかん", "orange", "オレンジ", 30, 1000));
        fruitsList.add(new Fruits("静岡産マスクメロン", "melon", "緑", 5000, 1000));
        fruitsList.add(new Fruits("キウイ", "kiwi", "緑", 150, 3000));
        fruitsList.add(new Fruits("桃", "peach", "ピンク", 180, 100));
        fruitsList.add(new Fruits("マスカット", "muscat", "薄緑", 300, 50));
        fruitsList.add(new Fruits("ブドウ", "grape", "紫", 200, 0));
        fruitsList.add(new Fruits("梨", "pear", "薄黄", 90, 100));
        fruitsList.add(new Fruits("さくらんぼ", "cherry", "赤", 150, 200));
        fruitsList.add(new Fruits("マンゴー", "mango", "黄", 20, 500));
        fruitsList.add(new Fruits("インドネシア産マンゴスチン", "mangosteen", "白紫", 5000, 100));
        fruitsList.add(new Fruits("ザクロ", "pomegranate", "赤", 50, 10));

/*
        System.out.println(fruitsList.size() + "アイテム登録しました。");
        System.out.println("【アイテム一覧】");
        for (int i = 0; i < fruitsList.size() ; i++) {
            System.out.println(fruitsList.get(i).getfruitsName() + "|" + fruitsList.get(i).getFruitsEnglishName() + "|" + fruitsList.get(i).getFruitsColor() + "|" + fruitsList.get(i).getFruitsUnitPrice() + "|" + fruitsList.get(i).getFruitsstock() + "|" );
        }
*/
        return fruitsList;
    }
}
