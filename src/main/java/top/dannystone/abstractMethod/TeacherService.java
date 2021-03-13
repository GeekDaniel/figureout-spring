package top.dannystone.abstractMethod;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: keep it simple and stupid !
 * @Time: 2019/7/28 9:39 PM
 */
@Service
public class TeacherService extends AbstractService {
    @Override
    public void sayHello() {
        System.out.println("hello ,I'm a teacher!");
    }
}
