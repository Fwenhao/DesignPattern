package cn.fyyice.designpattern.factory.service;

import cn.fyyice.designpattern.factory.entity.Phone;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PhoneContext {

    private final Map<String, PhoneService> phoneStrategy = new ConcurrentHashMap<>();

    public PhoneContext(Map<String, PhoneService> myPhones) {
        this.phoneStrategy.clear();
        myPhones.forEach((k,v) -> {
            phoneStrategy.put(k,v);
        });
    }

    public PhoneService returnRecourse(String type){
        return phoneStrategy.get(type);
    }
}
