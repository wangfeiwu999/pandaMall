package cn.chinaSoft.pandaMall.common.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.chinaSoft.pandaMall.common.base.ResponseModel;
import cn.chinaSoft.pandaMall.common.service.UploadService;
import cn.chinaSoft.pandaMall.sellerCenter.entity.SellerGoodInfo;

@Controller
@RequestMapping(value="/upload")
public class UploadController {
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping(value = "/uploadGoodPic", method = RequestMethod.GET)
	 @ResponseBody
	private ResponseModel uploadGoodPic(@RequestBody SellerGoodInfo sellerGoodInfo,ModelMap map) {
	
		System.out.println("进入上传接口");
		 ResponseModel responseModel=new ResponseModel();
		 return responseModel;
	}

	public UploadService getUploadService() {
		return uploadService;
	}

	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}
	
	
}
