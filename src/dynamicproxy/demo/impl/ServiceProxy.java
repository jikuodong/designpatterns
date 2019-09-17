package dynamicproxy.demo.impl;

import dynamicproxy.demo.Service;

/**
 * describe 如果我们想正式代用服务之前或之后做一些额外工作，比如参数校验、资源关闭等等。
 * 若不使用代理，那么就只能修改源码实现，这就破坏了员服务方法的纯粹性，
 * 更糟糕的是，如果这个服务来自第三方库，那就来源码都改不了了。
 *
 * 这个时候使用代理的方式来增强员方法的行为，首先定义一个代理类实现Service接口，
 * 然后注入原来的服务类ServiceImpl实例，这样代理类就拿到了原服务类的引用。
 * 并且由于代理类本身就是一个Service，所以调用者在用代理类的时候就和在使用原服务类一样。
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ServiceProxy.java
 * @createTime 2019年09月04日 11:01:00
 */
public class ServiceProxy implements Service {
    private Service service;

    public ServiceProxy (Service service) {
        this.service = service;
    }
    @Override
    public void service(String[] args) {
        before();
        service.service(args);
        after();

    }

    private void before() {
        System.out.println("do something before serving...");
    }

    private void after() {
        System.out.println("do something after serving...");
    }
}
