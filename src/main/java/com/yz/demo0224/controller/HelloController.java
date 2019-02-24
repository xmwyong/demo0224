package com.yz.demo0224.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.yz.demo0224.pojo.IMoocJSONResult;
import com.yz.demo0224.pojo.Resource;

@RestController
public class HelloController {
	@Autowired
	private Resource resource;
	@RequestMapping
	public Object hello() {
		return "hello xiamenamoy";
	}
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return IMoocJSONResult.ok(bean);
	}
}
