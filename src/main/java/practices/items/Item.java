package practices.items;

/**
 * 商品を管理するクラス Item
 */


public class Item {
    //インスタンスフィールド(情報)設定やで。privateで設定。
    private String itemName;
    private String itemCatchCopy;
    private String manufactureName;
    private int itemPrice;
    private int numberOfStocks;

    //コンストラクタ～
    public Item(String itemName, String itemCatchCopy, String manufactureName, int itemPrice, int numberOfStocks) {
        this.itemName = itemName;
        this.itemCatchCopy = itemCatchCopy;
        this.manufactureName = manufactureName;
        this.itemPrice = itemPrice;
        this.numberOfStocks = numberOfStocks;
    }

    public void printInfomation() {
        System.out.println("商品名：" + this.itemName);
        System.out.println("商品キャッチコピー：" + this.itemCatchCopy);
        System.out.println("メーカー名：" + this.itemCatchCopy);
        System.out.println("価格：" + this.itemName);
        System.out.println("在庫数：" + this.numberOfStocks);
        System.out.println("----------------------------");
    }

    //returnの観点 102とけなかった～～
    public String printInfomation2() {
        return "商品名：" + this.itemName + " " +
                "キャッチコピー：" + this.itemCatchCopy + " " +
                "メーカー名：" + this.itemCatchCopy + " " +
                "価格：" + this.itemName + " " +
                "在庫数：" + this.numberOfStocks;
    }

}


