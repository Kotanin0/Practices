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
        //
        Item[] itemMember1 = {
                new Item("Anakin Skywalker", "Dark Lord of the Sith", "Tatooine", 203, 120),
                new Item("Luke Skywalker", "The Last Jedi", "Tatooine", 172, 73),
                new Item("R2-D2", "Astromech Droid", "Naboo", 109, 32),
                new Item("C-3PO", "Protocol Droid", "Tatooine", 171, 75),
                new Item("Yoda", "Grand Master", "Unknown", 66, 13),
        };
        ItemGroup group1 = new ItemGroup("Star Wars", itemMember1);

        Item[] itemMember2 = {
                new Item("Nobita Nobi", "Fourth Grade Student", "Nerima-ku", 140, 40),
                new Item("Doraemon", "Cat-Type Robot", "Future", 129, 129),
        };
        ItemGroup group2 = new ItemGroup("Doraemon", itemMember2);

        group1.printGroupData();
        group2.printGroupData();

    }
}
