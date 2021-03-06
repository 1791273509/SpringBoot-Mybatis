package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@CacheNamespace
public interface UserMapper {

    User Sel(int id);
    int update(Map<String,String> map);
    int updateExecutor(Map<String,String> map);
    int insertAll(User user);
}
