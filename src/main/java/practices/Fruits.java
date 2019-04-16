package practices;

/**
 * 果物クラス
 * - 果物名（日本語
 * - 果物名（英語
 * - 色
 * - 単価
 * - 在庫数
 */

public class Fruits {
    private String fruitsNameJapanese;
    private String fruitsNameEnglish;
    private String color;
    private int price;
    private int stocks;

    public Fruits(String fruitsNameJapanese, String fruitsNameEnglish, String color, int price, int stocks) {
        this.fruitsNameJapanese = fruitsNameJapanese;
        this.fruitsNameEnglish = fruitsNameEnglish;
        this.color = color;
        this.price = price;
        this.stocks = stocks;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getStocks() {
        return stocks;
    }

    public void printData() {
        System.out.println("果実名：" + this.fruitsNameJapanese + "(" + this.fruitsNameEnglish + ")");
        System.out.println("色：" + this.color);
        System.out.println("単価：" + this.price);
        System.out.println("在庫数：" + this.stocks);
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public void printNameAndStock() {
        System.out.println("果実名：" + this.fruitsNameJapanese + "(" + this.fruitsNameEnglish + ")");
        System.out.println("在庫数：" + this.stocks);
    }

    public void printNamePriceAndStock() {
        System.out.println("果実名：" + this.fruitsNameJapanese + "(" + this.fruitsNameEnglish + ")");
        System.out.println(("単価：" + this.price));
        System.out.println("在庫数：" + this.stocks);
    }

    public void buyUpAlltheFruit() {
        System.out.println(this.fruitsNameJapanese + "（" + this.price + "円） " + this.stocks + "個 " + this.price * this.stocks + "円 お買い上げありがとうございます");
        this.stocks = 0;
    }
}
