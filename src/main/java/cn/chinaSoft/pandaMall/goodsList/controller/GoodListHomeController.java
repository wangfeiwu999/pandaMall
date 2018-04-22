package cn.chinaSoft.pandaMall.goodsList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.chinaSoft.pandaMall.goodsList.service.GoodListHomeService;

@Controller
public class GoodListHomeController {
	@Autowired
	private GoodListHomeService	homeService;
	
	@RequestMapping("/getGoodsListHome")
	private String getGoodsListHome(ModelMap map) {
		System.out.println("请求进来了");
		return homeService.getGoodsListHome();
	}


	public GoodListHomeService getHomeService() {
		return homeService;
	}

	public void setHomeService(GoodListHomeService homeService) {
		this.homeService = homeService;
	}
	
}
