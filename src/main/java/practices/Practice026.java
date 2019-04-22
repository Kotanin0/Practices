package practices;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * String型のArrayListを作成し、それに47都道府県を格納してください
 *
 * 格納したListから、任意の文字列で都道府県を検索できる関数を作りなさい
 *
 * 関数名、引数、戻り値の指定はしません
 *
 */

public class Practice026 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        System.out.println("都道府県を検索します。文字列を入力してください");

        Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.next();

        List<String> result =Practice025.makeAreaList().stream()
                .filter(s -> s.contains(searchWord))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
