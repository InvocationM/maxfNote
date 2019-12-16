package max_12_6;

import com.github.houbb.word.checker.core.impl.EnWordChecker;

import java.util.List;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-12-13 11:10
 */
public class TestWord {

    public static void main(String[] args) {

        String string = "jakkapah21";

        List<String> strings = EnWordChecker.getInstance().correctList(string);

        for (String s : strings) {
            System.out.println(s);
        }
    }

}