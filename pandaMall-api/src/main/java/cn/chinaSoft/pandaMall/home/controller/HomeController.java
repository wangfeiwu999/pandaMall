package cn.chinaSoft.pandaMall.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.chinaSoft.pandaMall.common.base.ResponseModel;
import cn.chinaSoft.pandaMall.common.constant.PmConstant;
import cn.chinaSoft.pandaMall.common.controller.BaseController;
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.home.service.HomeService;

@Controller
public class HomeController extends BaseController{
	@Autowired
	private HomeService	homeService;
	
	@RequestMapping(value = "/homeInit", method = RequestMethod.POST)
	 @ResponseBody
	private ResponseModel getGoodsListHome(@RequestBody User user,ModelMap map) {
		System.out.println("请求进来了");
		System.out.println(user);
		System.out.println(map);
		System.out.println(request);
		System.out.println(response);
		
		 List<?> dataList=homeService.getGoodsListHome();
		 ResponseModel responseModel=new ResponseModel();
		 responseModel.setResult(PmConstant.SUCCESS);
		 responseModel.setDataList(dataList);
		 return responseModel;
	}


	public HomeService getHomeService() {
		return homeService;
	}

	public void setHomeService(HomeService homeService) {
		this.homeService = homeService;
	}
	
}
