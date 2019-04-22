package practices.items;
import java.util.*;
import java.util.Arrays;

/**
 * 商品グループを管理するクラスItemGroupを作成しなさい
 *
 * ItemGroupは以下情報が格納でき、取り出しができること
 *
 * - 商品グループ名
 * - 商品リスト（Item）
 *
 * 作成したItemGroupを利用して、商品グループを2つ登録し、それらを全て出力しなさい
 *
 */

public class Practice102 {

    public static void main(String[] args){

        Item[] itemList1 = {
                new Item("お茶", "会議のお茶！", "伊藤園", 60, 10000),
                new Item("トイレットペーパー", "3倍巻き！！", "大王製紙", 100, 1000),
                new Item("コピー用紙", "安い！", "アスクル", 198, 100000),
                new Item("ファイル", "安いし便利", "プラス", 10, 3000),
                new Item("インクトナー", "リサイクル！", "リコー", 1000, 100),
        };
        ItemGroup group1 = new ItemGroup("定番", itemList1);

        Item[] itemList2 = {
                new Item("デジタルカメラ", "手ぶれ補正", "オリンパス", 10000, 10),
                new Item("冷蔵庫", "１００L！", "パナソニック", 100000, 5),
                new Item("紅茶", "おいしい", "リプトン", 500, 100),
                new Item("万年筆", "高級", "プラス", 5000, 10),
                new Item("アーロンチェア", "座り心地", "イトーキ", 150000, 10),
        };

        ItemGroup group2 = new ItemGroup("ロングテール", itemList2);

        System.out.println(Arrays.asList(group1));
        System.out.println(Arrays.asList(group2));

    }

}
