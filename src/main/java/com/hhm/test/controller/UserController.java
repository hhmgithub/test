package com.hhm.test.controller;
import com.hhm.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hhm.test.mode.User;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {

        return this.userService.queryById(id);
    }


    public static void main(String[] args) {
        new ThreadLocal<User>(){
            @Override
            protected User initialValue()
            {
                System.out.println("调用get方法时，当前线程共享变量没有设置，调用initialValue获取默认值！");
                return null;
            }
        };
        System.out.println( new User());
    }

    class  test implements  Runnable{
        ThreadPoolExecutor
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}