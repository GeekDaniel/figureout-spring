package top.dannystone.aspectAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/26 5:41 PM
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
//        context.refresh();
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.study();
    }
}
