package com.testing.testing.service;

import com.testing.testing.model.Users;
import com.testing.testing.model.response.BaseResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public BaseResponse<Users> login(Users users){
        BaseResponse<Users>baseResponse = new BaseResponse<Users>();

        baseResponse.setData(users);

        return baseResponse;
    }
}
