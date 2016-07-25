package com.han.service.impl;

import com.han.domain.User;
import com.han.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Override
	public User login(String name, String psw) {
		User user = null;
        if(name.equals("handx") && psw.equals("123")){
            user = new User();
            user.setName("handx");
            user.setQq("908716835");
        }
        return user;
	}

}
