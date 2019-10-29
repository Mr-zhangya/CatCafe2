package com.demo.service.impl;

import com.demo.entity.Admin;
import com.demo.mapper.AdminMapper;
import com.demo.service.AdminService;
import com.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    public R isLogin(String username, String password) {
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        int count = adminMapper.selectAdminByUserNameAndPassword(admin);
        return R.setOK(count);
    }
}
