package top.dannystone.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/16 4:11 PM
 */
@Component
@Slf4j
@MarkAop
public class PrinterService {

    public int printGreeting(int i){
        log.info("hello world! ! ");
        return i;
    }
}
