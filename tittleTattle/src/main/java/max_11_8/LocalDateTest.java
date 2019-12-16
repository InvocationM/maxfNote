package max_11_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 * ----
 *      测试 LocalDateTime的流操作
 * @author Administrator
 * @create 2019-12-05 16:24
 */
public class LocalDateTest {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        List<LocalDateTime> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(LocalDateTime.now());
        }

        List<LocalDate> collect = list.stream().map(e -> e.toLocalDate()).collect(Collectors.toList());

        System.out.println(collect);


    }
}