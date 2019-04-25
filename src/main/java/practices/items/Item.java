package practices.items;

/**
 * 商品を管理するクラス Item
 *
 * Itemは以下情報が格納でき、取り出しができること
 *
 * - 商品名
 * - 商品キャッチコピー
 * - メーカー名
 * - 価格
 * - 在庫数
 */


public class Item {
    public String itemName, itemCopy, itemMakerName;
    public int itemPrice, quantity;

    Item(String itemName, String itemCopy, String itemMakerName, int itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemCopy = itemCopy;
        this.itemMakerName = itemMakerName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public void printData() {
        System.out.println("－－－－－－－－－");
        System.out.println("商品名：" + this.itemName);
        System.out.println("商品キャッチコピー：" + this.itemCopy);
        System.out.println("メーカー名：" + this.itemMakerName);
        System.out.println("価格：" + this.itemPrice);
        System.out.println("在庫数：" + this.quantity);
    }
}