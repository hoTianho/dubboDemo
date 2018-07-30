import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2018</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @author GHX
 * @date 2018-07-13 18:03
 */
public class ProviderTest {
    public static void main(String[] args) throws Exception {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-demo-provider.xml"});
        context.start();
        System.out.println("服务提供者向zookeeper注册中心注册成功,端口20880");
        System.in.read(); // press any key to exit
        context.close();
    }
}
