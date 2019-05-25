package max_5_16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-05-22 22:44
 */
public class T02_testRegistry {


    public static void main(String[] args) {
        String a = "zzz";
        List list = new ArrayList();
        retrieveAliases(a, list);


    }

    private static void retrieveAliases(String name, List<String> result) {

        Map<String, String> aliasMap = new HashMap();

        aliasMap.forEach((alias, registeredName) -> {
            if (registeredName.equals(name)) {
                result.add(alias);
                retrieveAliases(alias, result);
            }

        });
    }

    public <K> void method() {

    }

}