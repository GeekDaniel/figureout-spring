package top.dannystone.abstractMethod;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/26 5:42 PM
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages ="top.dannystone" )
public class AspectConfig {


}
