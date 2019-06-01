package com.sky.ad.service;

import com.sky.ad.exception.AdException;
import com.sky.ad.vo.CreateUserRequest;
import com.sky.ad.vo.CreateUserResponse;

public interface IUserService {
    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
