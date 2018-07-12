package com.caiduoduo.component;

import com.caiduoduo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Auhtor: Cazen
 * @Description:
 * @version: Created in 13:30 2018/7/11
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}