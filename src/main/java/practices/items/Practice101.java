package practices.items;

/**
 * 商品を管理するクラスItemを作成しなさい
 * <p>
 * Itemは以下情報が格納でき、取り出しができること
 * <p>
 * - 商品名
 * - 商品キャッチコピー
 * - メーカー名
 * - 価格
 * - 在庫数
 * <p>
 * 作成したItemを利用して、商品情報を5つ登録し、それらを全て出力しなさい
 */

public class Practice101 {
    public static void main(String[] args) {

        Item item1 = new Item("Anakin Skywalker", "Dark Lord of the Sith", "Tatooine", 203, 120);
        item1.printData();

        Item item2 = new Item("Luke Skywalker", "The Last Jedi", "Tatooine", 172, 73);
        item2.printData();

        Item item3 = new Item("R2-D2", "Astromech Droid", "Naboo", 109, 32);
        item3.printData();

        Item item4 = new Item("C-3PO", "Protocol Droid", "Tatooine", 171, 75);
        item4.printData();

        Item item5 = new Item("Yoda", "Grand Master", "Unknown", 66, 13);
        item5.printData();
    }
}
