package top.dannystone.aspectAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/26 5:40 PM
 */
@Component
@Aspect
public class AspectAdvice {
    @Before("execution(* top.dannystone.aspectAop.StudentService.study())")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("teach is moniting!!");
    }
}
