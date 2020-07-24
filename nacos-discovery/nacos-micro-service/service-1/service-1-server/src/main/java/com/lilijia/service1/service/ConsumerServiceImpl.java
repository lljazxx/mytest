package com.lilijia.service1.service;

import com.lilijia.service1.api.ConsumerService;
import com.lilijia.service2.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    @Override
    public String service() {

        String service=providerService.service();
        return "Consumer invoke |"+service;
    }
}
