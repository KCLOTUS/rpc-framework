package service;


/**
 * 远程服务接口实现
 *
 * @author flytoyou
 * @version 1.0.0
 *
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String content) {
        return "hello," + content;
    }
}
