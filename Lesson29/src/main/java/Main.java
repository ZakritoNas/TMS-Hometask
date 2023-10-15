import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.RacingServiceImpl;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("config");
        RacingServiceImpl bean = context.getBean(RacingServiceImpl.class);
        bean.startRacing();
    }

}
