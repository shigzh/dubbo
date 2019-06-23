package com.sgz.service;

/**
 * @Description:接口类（生产者与消费者共用，使用maven引入依赖）
 * @Auther: shigzh
 * @create 2019/6/22 9:19
 */
public interface UserService {
    //使用userid查询 用户信息
    public String getUser(Long userId);
}
