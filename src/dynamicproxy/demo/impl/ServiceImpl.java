package dynamicproxy.demo.impl;

import dynamicproxy.demo.Service;

import java.util.Arrays;

/**
 * describe 实现服务类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ServiceImpl.java
 * @createTime 2019年09月04日 10:59:00
 */
public class ServiceImpl implements Service {
    @Override
    public void service(String[] args) {
        System.out.println("serving....." + Arrays.toString(args));
    }
}

