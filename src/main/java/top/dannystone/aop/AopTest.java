package top.dannystone.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/16 4:29 PM
 */
@ComponentScan
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register( PrinterServiceAspect.class,PrinterService.class);
        annotationConfigApplicationContext.refresh();
        PrinterService printerService = (PrinterService) annotationConfigApplicationContext.getBean("printerService");
        printerService.printGreeting(1);
    }
}
