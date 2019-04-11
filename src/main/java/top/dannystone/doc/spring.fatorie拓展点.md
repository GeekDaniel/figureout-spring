# spring.factories 拓展点
## 前言
最近在存在以下的一些应用场景。
- spring boot auto config  
- 在初始化spring容器bean之前，注入外部文件中的属性到system properties,使得后续的bean初始化过程中可以使用。
### 是什么？
spring.factories 可以认为是spring 对外提供的一个拓展点,在spring 规定的时期进行加载。
如果想正确使用这一个拓展点，我们就绕不开它的嵌入时期。
#### 嵌入时期
先找到文件加载是在哪里。
下载spring-framework 源码，或者maven repository jar org/springframework下面grep 下"find  ./  -name "*.jar" -exec zipgrep "spring.factories" '{}' \;"
都可以发现加载源头来自： 
实践下来来自 SpringFactoriesLoader.loadSpringFactories(@Nullable ClassLoader classLoader)方法。
查一下调用链路，其中一条：
![](https://ws4.sinaimg.cn/large/006tNc79ly1g1z6uwcbozj319c0oe7e8.jpg)
看到
![](https://ws3.sinaimg.cn/large/006tNc79ly1g1z6w8dgr6j316m0esdih.jpg)
看到这里大家都应该很熟悉了，执行在scan环节，之后就是refresh bean 到spring容器了。
