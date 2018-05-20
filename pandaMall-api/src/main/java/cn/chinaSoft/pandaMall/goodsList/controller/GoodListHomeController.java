package cn.chinaSoft.pandaMall.goodsList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.chinaSoft.pandaMall.common.base.ResponseModel;
import cn.chinaSoft.pandaMall.common.constant.ResultConstant;
import cn.chinaSoft.pandaMall.common.controller.BaseController;
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.goodsList.service.GoodListHomeService;

@Controller
public class GoodListHomeController extends BaseController{
	@Autowired
	private GoodListHomeService	homeService;
	
	@RequestMapping(value = "/getGoodsListHome", method = RequestMethod.POST)
	 @ResponseBody
	private ResponseModel getGoodsListHome(@RequestBody User user,ModelMap map) {
		System.out.println("请求进来了");
		System.out.println(user);
		System.out.println(map);
		System.out.println(request);
		System.out.println(response);
		
		 List<?> dataList=homeService.getGoodsListHome();
		 ResponseModel responseModel=new ResponseModel();
		 responseModel.setResult(ResultConstant.SUCCESS);
		 responseModel.setDataList(dataList);
		 return responseModel;
	}


	public GoodListHomeService getHomeService() {
		return homeService;
	}

	public void setHomeService(GoodListHomeService homeService) {
		this.homeService = homeService;
	}
	
}
