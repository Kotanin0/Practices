package practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    private String nameJpn;
    private String nameEng;
    private String color;
    private int price;
    private int stock;

    public Fruits(String nameJpn, String nameEng, String color, int price, int stock) {
        this.nameJpn = nameJpn;
        this.nameEng = nameEng;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }


    public String getNameJpn() {
        return nameJpn;
    }

    public void setNameJpn(String nameJpn) {
        this.nameJpn = nameJpn;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void printData() {
        System.out.println("果物名：" + this.nameJpn);
        System.out.println("（" + this.nameEng+"）");
        System.out.println("色：" + this.color);
        System.out.println("単価：" + this.price);
        System.out.println("在庫数：" + this.stock);
    }

//    public int maxPrice(){
//        return max;
//    }

}
