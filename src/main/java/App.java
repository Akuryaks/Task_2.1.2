import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld FirstBean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld SecondBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(FirstBean == SecondBean);

        Cat FirstCat = (Cat) applicationContext.getBean("cat");
        Cat SecondCat = (Cat) applicationContext.getBean("cat");
        System.out.println(FirstCat == SecondCat);
    }
}