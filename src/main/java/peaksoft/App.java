package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat catBean =  applicationContext.getBean("cat", Cat.class);
        Cat catBean2 =  applicationContext.getBean("cat", Cat.class);

        System.out.println(catBean == catBean2);
        System.out.println(catBean.getName());
        System.out.println(catBean2.getName());

    }
}
