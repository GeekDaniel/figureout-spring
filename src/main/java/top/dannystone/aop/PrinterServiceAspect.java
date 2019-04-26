package top.dannystone.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/16 4:26 PM
 */
@Aspect
@Slf4j
@Component
public class PrinterServiceAspect {
    @Around("@annotation(markAop)")
    public void logBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("I'm a Printer");
        joinPoint.proceed();
    }
}
