
import com.java1234.service.DemoProviderServiceApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2018</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @author GHX
 * @date 2018-07-27 17:34
 */
public class ConsumerTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoProviderServiceApi demoProviderService = (DemoProviderServiceApi) context.getBean("demoProviderServiceApi");
        String result = demoProviderService.sayHello("您好");
        System.out.println("远程调用的结果:" + result);
        context.close();
    }
}
