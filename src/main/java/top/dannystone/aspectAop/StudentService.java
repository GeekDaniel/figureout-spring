package top.dannystone.aspectAop;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/26 5:43 PM
 */
@Component
public class StudentService {
    public void study() {
        System.out.println("I'm studying!!");
    }
}
