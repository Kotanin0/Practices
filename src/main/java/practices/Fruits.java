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
    private String fruitsName;
    private String fruitsEnglishName;
    private String fruitsColor;
    private int fruitsUnitPrice;
    private int fruitsStock;

    Fruits(String fruitsName, String fruitsEnglishName,String fruitsColor,int fruitsUnitPrice, int fruitsStock){
        this.fruitsName = fruitsName;
        this.fruitsEnglishName = fruitsEnglishName;
        this.fruitsColor = fruitsColor;
        this.fruitsUnitPrice = fruitsUnitPrice;
        this.fruitsStock = fruitsStock;

    }

    public String getfruitsName(){

        return this.fruitsName;
    }
    public String getFruitsEnglishName(){

        return this.fruitsEnglishName;
    }
    public String getFruitsColor(){

        return this.fruitsColor;
    }
    public int getFruitsUnitPrice(){
        return this.fruitsUnitPrice;
    }
    public int getFruitsstock(){
        return this.fruitsStock;
    }
    public void printCheckFruits(){
        System.out.println("日本名：" + this.fruitsName + "、英名：" + this.fruitsEnglishName + "、色：" + this.fruitsColor + "、価格："
                + this.fruitsUnitPrice + "、在庫数：" + this.fruitsStock);
    }

    public void printThanksForBuyingExpensiveFruitsMessage(){
        System.out.println(this.fruitsName + "("+ this.fruitsUnitPrice +")円 "+ this.fruitsStock +"個 ");
    }

}
