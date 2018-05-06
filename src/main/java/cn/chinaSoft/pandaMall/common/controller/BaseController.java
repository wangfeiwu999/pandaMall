package cn.chinaSoft.pandaMall.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
//	找不到这个bean所以报错
	@Autowired
	protected HttpServletResponse response;
	
}
