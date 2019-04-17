package practices;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;
/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 *
 * 格納したListから、都・道・府・県をそれぞれ返す関数を作成しなさい
 *
 * 関数名：お好きなもので
 * 引数：都道府県が格納されたリスト、返却したいもの（都・道・府・県のいずれか）
 * 戻り値：リスト
 *
 * 例）府を返却したいときに戻る値は 大阪府・京都府の2つが格納されたリストとなる
 *
 *
 */

public class Practice024 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        //都道府県を格納
        ArrayList<String> prefecturesList = new ArrayList<>(Arrays.asList("北海道","青森県","岩手県","宮城県","秋田県","山形県","福島県","茨城県","栃木県","群馬県","埼玉県","千葉県","東京都","神奈川県","新潟県","富山県","石川県","福井県","山梨県","長野県","岐阜県","静岡県","愛知県","三重県","滋賀県","京都府","大阪府","兵庫県","奈良県","和歌山県","鳥取県","島根県","岡山県","広島県","山口県","徳島県","香川県","愛媛県","高知県","福岡県","佐賀県","長崎県","熊本県","大分県","宮崎県","鹿児島県","沖縄県"));
        //都道府県チェックメソッド呼び出し
        String searchPrefectures = "府";
        System.out.println("戻り値確認："+checkPre(prefecturesList, searchPrefectures));

    } //main終わり

    public static List<String> checkPre(List<String> preList, String searchPrefectures){
//引数確認
//      System.out.println(preList);
        ArrayList<String> check = new ArrayList<>();
//引数の文字列「都道府県」を基に返却するリストのみを作成するパターン
        for(int i = 0; i< preList.size();i++){
            if(preList.get(i).endsWith(searchPrefectures)) {
                check.add(preList.get(i));
            }
        }
        return check;

//一度全てのリストを作成してから、返却するパターン
/*各都道府県を語尾ごとのリスト化
        ArrayList<String> ken = new ArrayList<String>();
        ArrayList<String> fu = new ArrayList<String>();
        ArrayList<String> dou = new ArrayList<String>();
        ArrayList<String> to = new ArrayList<String>();
        for(int i = 0; i< preList.size();i++){
            if(preList.get(i).endWith("県")) {
                ken.add(preList.get(i));
            }else if(preList.get(i).endWith("府")){
                fu.add(preList.get(i));
            }else if(preList.get(i).endWith("道")){
                dou.add(preList.get(i));
            }else{
                to.add(preList.get(i));
            }
        }
        System.out.println(ken);
        System.out.println(fu);
        System.out.println(dou);
        System.out.println(to);
        if(order == "県"){ return ken;}
        if(order == "府"){ return fu;}
        if(order == "道"){ return dou;}
        return to;
*/

    }//都道府県チェックメソッド呼び出し

}//practice24終わり
