import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.RacingServiceImpl;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");
        RacingServiceImpl bean = context.getBean(RacingServiceImpl.class);
        bean.startRacing();
    }

}
