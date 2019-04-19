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

    private String englishName;
    private String japanName;
    private String color;
    private int price;
    private int stock;


    Fruits(String englishName, String japanName, String color, int tanka, int stock) {

        this.englishName = englishName;
        this.japanName = japanName;
        this.color = color;
        this.price = tanka;
        this.stock = stock;


    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getJapanName() {
        return this.japanName;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }
}

