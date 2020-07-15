package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;

public class DemoServiceStub implements DemoService {

    private DemoService demoService;

    public DemoServiceStub(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public String sayHello(String name) {
        return null;
    }

    @Override
    public void bye(Object o) {
        System.out.println("o");
    }

}
