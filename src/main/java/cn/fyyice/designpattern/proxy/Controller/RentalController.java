package cn.fyyice.designpattern.proxy.Controller;

import cn.fyyice.designpattern.proxy.common.ProxyObjClazz;
import cn.fyyice.designpattern.proxy.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/proxy/rental")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @RequestMapping(value = "callback")
    public Map<String, Object> getRentalsCallback() {
        RentalService proxyObj = (RentalService) new ProxyObjClazz(rentalService).getProxyInstance();
        Map<String, Object> map = proxyObj.rentalHouse();
        return map;
    }

}
