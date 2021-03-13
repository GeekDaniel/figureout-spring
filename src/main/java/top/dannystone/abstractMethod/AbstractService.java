package top.dannystone.abstractMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: keep it simple and stupid !
 * @Time: 2019/7/28 9:38 PM
 */
public abstract class AbstractService {
    public void doSomething(){
        sayHello();
    }
    protected abstract void sayHello();
}
