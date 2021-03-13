package top.dannystone.abstractMethod;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
    @Before("execution(* top.dannystone.abstractMethod.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("before joinPoint!!");
    }
}
