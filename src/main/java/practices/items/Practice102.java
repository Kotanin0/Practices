package practices.items;

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
    public static void main(String[] args) {
        Item item = new Item("Water", "hardWater", "MIZU", 100, 200);
        ItemGroup itemGroup = new ItemGroup("waterGroup");
        item.printData();

    }
}
