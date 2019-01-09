package org.lszjaf.dagger.servicefeign.service.impl;

import org.lszjaf.dagger.servicefeign.service.HiService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HiServiceImpl implements HiService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
