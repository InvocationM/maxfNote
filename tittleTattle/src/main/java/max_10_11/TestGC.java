package max_10_11;

import javax.management.ObjectName;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryManagerMXBean;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 描述:
 * ----测试默认的垃圾回收器
 *
 * @author Administrator
 * @create 2019-10-11 16:44
 */
public class TestGC {

    public static void main(String args[]) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
        List<MemoryManagerMXBean> memoryManagerMXBeans = ManagementFactory.getMemoryManagerMXBeans();
        for (MemoryManagerMXBean bean : memoryManagerMXBeans) {
            System.out.println(bean.getName());
        }

        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        ObjectName objectName = classLoadingMXBean.getObjectName();
        System.out.println(objectName);

        System.out.println("22222222222222");
        Map<String, String> getenv = System.getenv();  // 系统的环境变量
        Properties properties = System.getProperties(); // java的进程变量
        System.out.println("111111111111");


    }


}