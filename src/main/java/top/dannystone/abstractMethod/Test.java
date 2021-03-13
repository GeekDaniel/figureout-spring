package top.dannystone.abstractMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: keep it simple and stupid !
 * @Time: 2019/7/28 9:44 PM
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
//        context.refresh();
        AbstractService teacherService=  context.getBean(AbstractService.class);
        teacherService.doSomething();

    }
}
