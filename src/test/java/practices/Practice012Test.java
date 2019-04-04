package practices;

/**
 * 配列の中身を小さい順に並べ替える関数 sort を作成しなさい
 *
 * 引数：整数の配列
 * 返却：整数の配列
 *
 * 　例）引数：[0, 2, 3, 1, 9, 7, 6, 4, 5, 8]
 * 　　　返却：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 */

import org.junit.Test;
import main.java.practices.Practice012;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Practice012Test {
    @Test
    public void sortは配列の中身を小さい順に並べ替える(){
        int[] actual = {0, 2, 3, 1, 9, 7, 6, 4, 5, 8};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(Practice012.sort(actual),is(expected));
    }

    @Test
    public void sortは負の数があっても中身を小さい順に並び替える(){
        int[] actual =   {-10,5,2,-8,0,8};
        int[] expected = {-10,-8,0,2,5,8};
        assertThat(Practice012.sort(actual),is(expected));
    }
}