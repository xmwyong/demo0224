package com.yz.demo0224.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yz.demo0224.pojo.IMoocJSONResult;
import com.yz.demo0224.pojo.User;

//@Controller
@RestController
public class UserController {
	@RequestMapping("/getUser")
	//@ResponseBody
	public User hello() {
		User u = new User();
		u.setName("wy");
		u.setAge(18);
		u.setPassword("123");
		u.setBirthday(new Date());
		return u;
	}
	@RequestMapping("/getUserJson")
	//@ResponseBody
	public IMoocJSONResult hello1() {
		User u = new User();
		u.setName("wyxzmj");
		u.setAge(18);
		u.setPassword("123456");
		u.setBirthday(new Date());
		u.setDesc("i love xiamen");
		return IMoocJSONResult.ok(u);
	}

}
