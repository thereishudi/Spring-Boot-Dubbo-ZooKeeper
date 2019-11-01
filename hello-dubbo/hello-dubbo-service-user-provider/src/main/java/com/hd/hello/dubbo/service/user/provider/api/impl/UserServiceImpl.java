package com.hd.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hd.hello.dubbo.service.user.api.UserService;


@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    public String sayHi() {
        return "hello dubbo";
    }
}
