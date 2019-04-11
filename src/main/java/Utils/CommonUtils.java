package Utils;

public class CommonUtils {
    /**
     * n倍数チェック
     * @param n 引数
     * @param multiNum　倍数
     * @return　引数がそのmultiNumの倍数ならtrue
     */
    public static boolean isMultiple(int n, int multiNum){
        if(n == 0 || multiNum == 0) return false;
        return n % multiNum == 0;
    }
}
