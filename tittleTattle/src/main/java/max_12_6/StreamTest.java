package max_12_6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 描述:
 * ----使用jdk8的stream进行统计
 *
 * @author Administrator
 * @create 2019-12-06 10:57
 */
public class StreamTest {


    public static void main(String[] args) {

//        Runnable aNew = CallDetail::new;
        CallDetail c1 = new CallDetail("123123", "Ais", "234");
        CallDetail c2 = new CallDetail("456", "Ais", "84");
        CallDetail c3 = new CallDetail("456", "DEs", "10");
        CallDetail c4 = new CallDetail("890", "Ais", "4");
        CallDetail c5 = new CallDetail("321", "Ais", "24");

        List<CallDetail> list = new ArrayList();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        Map<String, Long> collect = list.stream().filter(e -> e.getCall_no() != null).
                collect(Collectors.groupingBy(CallDetail::getCall_no, Collectors.counting()));


        Map<String, Long> finalMap = new LinkedHashMap<>();

        List<String> alist = new ArrayList<>();

        collect.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()) //reversed不生效
                .forEachOrdered(x->alist.add(x.getKey()));
        collect.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()) //reversed不生效
                .forEachOrdered(x-> finalMap.put(x.getKey(), x.getValue()));


        list.stream().filter(e -> e.getCall_no() != null).
                collect(Collectors.groupingBy(CallDetail::getCall_no, Collectors.summarizingInt(CallDetail::getAnInt)));


        System.out.println(finalMap);
        System.out.println(alist);

        Long aLong = finalMap.get(0);
        System.out.println(aLong);
        System.out.println("-----------------");
    }
}