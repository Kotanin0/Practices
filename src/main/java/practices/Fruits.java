package practices;

import java.util.ArrayList;
import java.util.List;

/**
 * 果物クラス
 * - 果物名（日本語
 * - 果物名（英語
 * - 色
 * - 単価
 * - 在庫数
 */

class Fruits {


    //インスタンスフィールド
    private String jpName;
    private String name;
    private String color;
    private double unitPrice;
    private int stock;


    //コンストラクタ
    Fruits(String jpName, String name, String color, double unitPrice, int stock) {
        this.jpName = jpName;
        this.name = name;
        this.color = color;
        this.unitPrice = unitPrice;
        this.stock = stock;

        System.out.println(jpName + "入荷しました");

    }

    public String getjpName(){
        return this.jpName;
    }
    public String getName(){
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
    public double getUnitPrice() {
        return this.unitPrice;
    }
    public int getStock(){
        return this.stock;
    }

    public void setName(String name) {
        this.jpName = name;
    }

}







