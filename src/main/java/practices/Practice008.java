package practices;

/**
 * 2以上の数値を入力し、素因数分解した結果を表示しなさい。
 * <p>
 * 引数：整数
 * 返却：素因数を半角スペースで区切った文字列
 * <p>
 * 　例）引数：20100
 * 　　　返却：2 2 3 5 5 67
 */

public class Practice008 {
    public static void main(String[] args) {
        System.out.println(factorization(7));

    }

    public static String factorization(int n) {
        if (2 > n) throw new IllegalArgumentException("不正な値です");
        String ss = " ";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                while (n % i == 0) {
                    ss += String.valueOf(i) + " ";
                    n = n / i;
                }
            }
        }
        ss = ss + n;
        return ss.trim();
    }

}

/* 別解答考案：最初は、nを素因数分解するための素数リストを実際に配列を使って作り、それを活かせないかと思ったが不要だった。
   しかしこの素数リストを無理矢理使って本問を解く方法を知りたい。どうしても作れず…

        public static String factorization ( int n){

            int i, ss;
            int count = 0;
            int[] numbers = new int[100000];

            //まず素数リスト=numbersを作る(竹)
            for (ss = 2; ss <= n; ss++) {
                for (i = 2; i < ss; i++) {
                    if (ss % i == 0) {
                        break;
                    }
                }
                if (ss == i) {
                    System.out.println(ss);
                    numbers[count] = ss;
                    count++;
                }
            }
            //素因数分解します(竹)
            if (2 > n) throw new IllegalArgumentException("不正な値です");
            String answer = " ";

            for ( numbers[count]; numbers[count] < n; numbers[count]++) {
                if (n % numbers[count] == 0) {

                    while (n % numbers[count] == 0) {
                        answer += String.valueOf(numbers[count]) + " ";
                        n = n / numbers[count];

                        //numbers[0]++;
                    }
                }
                }

            answer = answer + n;
            return answer.trim();


        }

    }
*/
