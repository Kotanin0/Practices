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
        Item item = new Item("Water", "hardWater", "MIZU", 100, 200);
        item.printData();
    }
}
