package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 * <p>
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 * <p>
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

//リファリタリング済み。

public class Practice006 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        String kuku = showKuku(2);
        System.out.println(kuku);
    }

    // 九九の答え
    public static String showKuku(int n) {
        if (n < 0 || n > 9) {
            throw new IllegalArgumentException("引数は１～９で指定してください");
        }

        String strKuku = "";

        for (int i = 1; i < 10; i++) {
            strKuku += (n * i);
            strKuku += " ";
        }
        return strKuku.trim();
    }

}

/*
public class Sample
{
	  public static void main(String args[]){
	        // 配列の宣言。
		    //intの配列を9個格納するために、9個の要素をもつ配列を生成する。
		    //さらに9個の配列を生成する。
		    //これらは、それぞれ9個の要素をもつintの配列。この9個新しい配列の各int型の要素のデフォルト値は0．
		    int kuku[][] = new int[9][9];

		    // 九九の結果を配列に保存。
		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ){
		    	  kuku[i][j] = (i+1) * (j+1);
		      }
		    }

		    // 九九の結果を表示。
		    for( int i=0; i<9; i++ ) {
		      for( int j=0; j<9; j++ ) {
		    	  System.out.print(kuku[i][j] + " ");
		      }
		      	  System.out.println();
		    }
	  }
}


 */
