package com.lilijia.service2.service;

import com.lilijia.service2.api.ProviderService;


@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String service() {
        return "Provider invoke";
    }
}
