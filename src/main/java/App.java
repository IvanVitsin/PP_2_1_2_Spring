import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean.getMessage());

        HelloWorld beanHi =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHi.getMessage());


    }
}