import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean =
                (Cat) applicationContext.getBean("Cat");
      //  System.out.println(bean.getMessage());
        Cat bean2 =
                (Cat) applicationContext.getBean("Cat");


        HelloWorld beanHi =
                (HelloWorld) applicationContext.getBean("helloworld");
      //  System.out.println(beanHi.getMessage());

        HelloWorld beanHi2 =
                (HelloWorld) applicationContext.getBean("helloworld");


        System.out.println(bean == bean2);
        System.out.println(beanHi2 == beanHi);

    }
}