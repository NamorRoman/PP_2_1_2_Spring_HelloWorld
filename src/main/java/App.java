import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld myBean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean == myBean ? "\"Hello world\" beans is equal"
                : "\"Hello world\" beans are not equal");

        System.out.println(catBean1 == catBean2 ? "\"Cat\" beans is equal"
                : "\"Cat\" beans are not equal");
    }
}