package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.entity.UserAddress;
import com.ant.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 收货地址
 *
 * @Author: lic
 * @data: 2019/10/16
 */
@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("list")
    public Result list(@SessionAttribute int userId) {
        return addressService.list(userId);
    }

    @RequestMapping("add")
    public Result add(@RequestBody UserAddress userAddress) {
        return addressService.add(userAddress);
    }

    @RequestMapping("update")
    public Result update(@RequestBody UserAddress userAddress) {
        return addressService.update(userAddress);
    }

    @RequestMapping("delete")
    public Result delete(@RequestBody UserAddress userAddress) {
        return addressService.delete(userAddress);
    }

}
