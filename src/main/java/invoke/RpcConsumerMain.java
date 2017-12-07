package invoke;

import framework.ConsumerProxy;
import service.HelloService;

/**
 * 服务的调用方发起调用
 * @author flytoyou
 * @version 1.0.0
 */
public class RpcConsumerMain {
    public static void main(String[] args) throws Exception {
        HelloService service = ConsumerProxy.consume(HelloService.class,"127.0.0.1", 8083);
        for (int i = 0; i <1000; i++){
            String hello = service.sayHello("bfylu" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }
}
