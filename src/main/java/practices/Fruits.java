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
    private String name;
    private String englishName;
    private String color;
    private int price;
    private int stock;

    public Fruits(String name, String englishName, String color, int price, int stock) {
        this.name = name;
        this.englishName = englishName;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }

    public void printData() {
        System.out.println("果物名:" + this.name + "、" + "果物名(英語):" + this.englishName + "、" + "色:" + this.color + "、" + "金額:" + this.price
                + "、" + "在庫:" + this.stock);
    }

    public String getName() {

        return this.name;
    }

    public String getEnglishName() {

        return this.englishName;
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
