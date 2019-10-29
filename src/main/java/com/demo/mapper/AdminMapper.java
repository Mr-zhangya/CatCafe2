package com.demo.mapper;


import com.demo.entity.Admin;
import org.springframework.stereotype.Repository;

public interface AdminMapper {
    int selectAdminByUserNameAndPassword(Admin admin);
}
