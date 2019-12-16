package max_11_8;

import java.time.LocalDate;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-12-05 17:32
 */
public class TestNow {

    public static void main(String[] args) {

        System.out.println(LocalDate.now().isAfter(LocalDate.now()));
        System.out.println(LocalDate.now().isAfter(LocalDate.now()));
        System.out.println(LocalDate.now().isAfter(LocalDate.now()));
        System.out.println(LocalDate.now().isBefore(LocalDate.now()));
        System.out.println(LocalDate.now().isBefore(LocalDate.now()));
        System.out.println(LocalDate.now().isBefore(LocalDate.now()));
    }

}