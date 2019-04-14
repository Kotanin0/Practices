package Utils;

public class ValidateUtils {

    /**
     * 正の整数かを判定しfalseなら例外をスロー
     * @param n
     */
    public static void checkPositiveInteger(int n){
        if(n < 0){
            throw new IllegalArgumentException("入力された値が正の整数ではありません");
        }
    }
}
