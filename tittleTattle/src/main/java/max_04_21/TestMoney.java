package max_04_21;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2020-05-08 16:52
 */
public class TestMoney {

    public static void main(String[] args) {

        String mo = "123,2,32,3,23.89";

        BigDecimal bigDecimal = parseMoneyStr(mo);
        System.out.println(bigDecimal);
    }


    // 金额字符串转为数字
    public static BigDecimal parseMoneyStr(String money) {

        NumberFormat format = NumberFormat.getInstance();
        double value = 0;
        try {
            value = format.parse(money).doubleValue();
        } catch (ParseException e) {
            return new BigDecimal(0);
        }
        return new BigDecimal(value);
    }


}