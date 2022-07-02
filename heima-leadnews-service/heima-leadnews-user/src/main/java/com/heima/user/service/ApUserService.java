package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.pojos.ApUser;
import com.heima.model.user.dtos.LoginDto;

public interface ApUserService extends IService<ApUser>{

    /**
     * app端登录
     * @param dto 手机号+密码
     * @return 登陆响应结果
     */
    public ResponseResult login(LoginDto dto);
    
}