package cn.chinaSoft.pandaMall.sellerCenter.controller;

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
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.sellerCenter.entity.SellerGoodInfo;
import cn.chinaSoft.pandaMall.sellerCenter.service.SellerService;

@Controller
@RequestMapping(value="/SellerCenter")
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(value = "/getGoodsList", method = RequestMethod.POST)
	 @ResponseBody
	private ResponseModel getGoodsList(@RequestBody SellerGoodInfo sellerGoodInfo,ModelMap map) {
		System.out.println("getGoodsList请求进来了");
		
		 List<?> dataList=sellerService.getGoodsList(sellerGoodInfo);
		 ResponseModel responseModel=new ResponseModel();
		 if(null!=dataList) {
			 responseModel.setResult(ResultConstant.SUCCESS);
			 responseModel.setDataList(dataList);
		 }else {
			 responseModel.setResult(ResultConstant.FAIL);
		} 
		 return responseModel;
	}

	public SellerService getSellerService() {
		return sellerService;
	}

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	
}
