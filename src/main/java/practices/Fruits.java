package practices;

/**
 * 果物クラス
 * - 果物名（日本語
 * - 果物名（英語
 * - 色
 * - 単価
 * - 在庫数
 *
 */

public class Fruits {
    private String name;
    private String englishName;
    private String color;
    private int unitPrice;
    private int stock;

    Fruits(String name, String englishName,String color,int unitPrice, int stock){
        this.name = name;
        this.englishName = englishName;
        this.color = color;
        this.unitPrice = unitPrice;
        this.stock = stock;

    }

    public String getName(){
        return this.name;
    }
    public String getEnglishName(){
        return this.englishName;
    }
    public String getColor(){
        return this.color;
    }
    public int getUnitPrice(){
        return this.unitPrice;
    }
    public int getStock(){
        return this.stock;
    }

}
