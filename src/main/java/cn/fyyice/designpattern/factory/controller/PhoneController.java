package cn.fyyice.designpattern.factory.controller;

import cn.fyyice.designpattern.factory.entity.Huawei;
import cn.fyyice.designpattern.factory.entity.Phone;
import cn.fyyice.designpattern.factory.service.PhoneContext;
import cn.fyyice.designpattern.factory.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/***
 *
 * 抽象类不能被实例化，因此在调用的时候入参为Phone则会报错
 *
 */
@RestController
@RequestMapping(value = "/factory/phone")
public class PhoneController {

    @Autowired
    private PhoneContext phoneContext;

    @RequestMapping(value = "create")
    public Object create(Huawei phone) {

        PhoneService phoneService = phoneContext.returnRecourse(phone.getType());
        String manufactureInfo = phoneService.manufacture();
        String purchaseInfo = phoneService.purchase();

        Map<String, Object> map = new HashMap<>();
        map.put("msg1",manufactureInfo);
        map.put("msg2",purchaseInfo);

        return map;
    }

}
