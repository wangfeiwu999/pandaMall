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
import cn.chinaSoft.pandaMall.common.constant.PmConstant;
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.common.util.PropertiesUtil;
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
//		System.out.println(PropertiesUtil.getProperty("pm.good.pic.path"));
		
		 List<?> dataList=sellerService.getGoodsList(sellerGoodInfo);
		 ResponseModel responseModel=new ResponseModel();
		 if(null!=dataList) {
			 responseModel.setResult(PmConstant.SUCCESS);
			 responseModel.setDataList(dataList);
		 }else {
			 responseModel.setResult(PmConstant.FAIL);
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
