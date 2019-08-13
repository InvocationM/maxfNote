package max_07_26;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 描述:
 * ----
 *
 * @author Administrator
 * @create 2019-08-05 20:30
 */
public class TestAware implements BeanNameAware, ApplicationContextAware {

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}