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
    private String fruitsNameJa;
    private String fruitsNameEn;
    private String fruitsColor;
    private int fruitsPrice;
    private int fruitsStocks;

    //コンストラクタ～
    public Fruits(String fruitsNameJa, String fruitsNameEn, String fruitsColor, int fruitsPrice, int fruitsStocks) {
        this.fruitsNameJa = fruitsNameJa;
        this.fruitsNameEn = fruitsNameEn;
        this.fruitsColor = fruitsColor;
        this.fruitsPrice = fruitsPrice;
        this.fruitsStocks = fruitsStocks;
    }

    // - 果物名（日本語
    public String getFruitsNameJa() {
        return fruitsNameJa;
    }

    public void setFruitsNameJa(String fruitsNameJa) {
        this.fruitsNameJa = fruitsNameJa;
    }

    // - 果物名（英語
    public String getFruitsNameEn() {
        return fruitsNameEn;
    }

    public void setFruitsNameEn(String fruitsNameEn) {
        this.fruitsNameEn = fruitsNameEn;
    }

    //色
    public String getFruitsColor() {
        return fruitsColor;
    }

    public void setFruitsColor(String fruitsColor) {
        this.fruitsColor = fruitsColor;
    }

    //価格
    public int getFruitsPrice() {
        return fruitsPrice;
    }

    public void setFruitsPrice(int fruitsPrice) {
        this.fruitsPrice = fruitsPrice;
    }

    //在庫
    public int getFruitsStocks() {
        return fruitsStocks;
    }

    public void setFruitsStocks(int fruitsStocks) {
        this.fruitsStocks = fruitsStocks;
    }

    public void printInfomation() {
        System.out.println("果物名(日本語)：" + this.fruitsNameJa);
        System.out.println("果物名(英語)：" + this.fruitsNameEn);
        System.out.println("色：" + this.fruitsColor);
        System.out.println("単価：" + this.fruitsPrice);
        System.out.println("在庫数：" + this.fruitsStocks);
    }

    public void byUpFruitsInfomation() {
        System.out.println("世界一の" + this.fruitsNameJa + "(" + this.fruitsPrice + ")" + this.fruitsStocks + "個" + this.fruitsStocks * this.fruitsPrice + "円 お買い上げありがとうございます");
        this.fruitsStocks = 0; //買い占めるので0個とする。
    }

}




