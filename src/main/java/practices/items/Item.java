package practices.items;

/**
 * 商品を管理するクラス Item
 */


public class Item {
    public String itemName;
    public String catchCopy;
    public String manufacturer;
    public int price;
    public int stock;

    Item(String itemName, String catchCopy, String manufacturer, int price, int stock) {
        this.itemName = itemName;
        this.catchCopy = catchCopy;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stock = stock;
    }

    public void printData() {
        System.out.println("商品：" + this.itemName);
        System.out.println("キャッチコピー：" + this.catchCopy);
        System.out.println("メーカー：" + this.manufacturer);
        System.out.println("価格：" + this.price);
        System.out.println("在庫：" + this.stock);
    }
}
