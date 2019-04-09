package practices.items;

/**
 * 商品を管理するクラス Item
 */


public class Item {
    private String productName;
    private String productCatchCopy;
    private String makerName;
    private int price;
    private int quantityOfStocks;

    public Item(String productName, String productCatchCopy, String makerName, int price, int quantityOfStocks) {
        this.productName = productName;
        this.productCatchCopy = productCatchCopy;
        this.makerName = makerName;
        this.price = price;
        this.quantityOfStocks = quantityOfStocks;
    }

    public String printInfo() {
        return "商品名："          + this.productName      + " " +
                "キャッチコピー：" + this.productCatchCopy + " " +
                "メーカー名："     + this.makerName        + " " +
                "価格："           + this.price            + " " +
                "在庫数："           + this.quantityOfStocks;
    }
}
