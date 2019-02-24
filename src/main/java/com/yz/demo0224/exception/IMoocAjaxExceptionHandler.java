package com.yz.demo0224.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yz.demo0224.pojo.IMoocJSONResult;

//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public IMoocJSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return IMoocJSONResult.errorException(e.getMessage());
	}
}
