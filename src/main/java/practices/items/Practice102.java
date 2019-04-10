package practices.items;

/**
 * 商品グループを管理するクラスItemGroupを作成しなさい
 * <p>
 * ItemGroupは以下情報が格納でき、取り出しができること
 * <p>
 * - 商品グループ名
 * - 商品リスト（Item）
 * <p>
 * 作成したItemGroupを利用して、商品グループを2つ登録し、それらを全て出力しなさい
 */

public class Practice102 {
    public static void main(String[] args) {
        //参照型Item[]をさらにインスタンスとして考える。
        Item[] itemArray1 = {
                new Item("日清カップヌードル醤油", "世界初のカップ麺", "日清食品", 178, 280),
                new Item("日清カップヌードルカレー", "マイルドでとろみのあるカレースープ", "日清食品", 178, 208),
                new Item("日清カップヌードルシーフード", "シーフードのうまみとコクがある白濁スープ", "日清食品", 178, 80),
                new Item("日清カップヌードルトムヤムクン", "本場のおいしいをお届け!", "日清食品", 178, 380),
                new Item("日清カップヌードルチリトマト", "チリの辛さ&トマトスープのマイルドさ", "日清食品", 178, 70)
        };

        ItemGroup itemGroup1 = new ItemGroup(itemArray1, "日清食品主力カップヌードルシリーズ");

        Item[] itemArrar2 = {
                new Item("どん兵衛きつねうどん", "ふっくらおあげのきつねうどん", "日清食品", 168, 280),
                new Item("どん兵衛天ぷらそば", "あとのせサクサクの天ぷらそば", "日清食品", 168, 208),
                new Item("どん兵衛鴨だしそば", "鴨の脂の旨みがきいた鴨だしそば", "日清食品", 168, 80),
                new Item("どん兵衛かき揚げうどん", "食べごたえのある鬼かき揚げうどん", "日清食品", 168, 380),
                new Item("どん兵衛肉うどん", "じゅわり肉汁の旨み", "日清食品", 168, 70)
        };

        ItemGroup itemGroup2 = new ItemGroup(itemArrar2, "日清食品どん兵衛主力シリーズ");

        System.out.println(itemGroup1.PrintInfomation());
        System.out.println(itemGroup2.PrintInfomation());

        }

    }

