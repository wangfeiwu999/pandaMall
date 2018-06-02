package cn.chinaSoft.pandaMall.common.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.chinaSoft.pandaMall.common.base.ResponseModel;
import cn.chinaSoft.pandaMall.common.constant.PmConstant;
import cn.chinaSoft.pandaMall.common.service.UploadService;
import cn.chinaSoft.pandaMall.common.util.PropertiesUtil;

@Controller
@RequestMapping(value="/upload")
public class UploadController {
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping(value = "/uploadGoodPic", method = RequestMethod.POST)
	 @ResponseBody
	private ResponseModel uploadGoodPic(MultipartFile file) {
//		private ResponseModel uploadGoodPic(@RequestParam MultipartFile[] file) {
	
		ResponseModel responseModel=new ResponseModel();
		String fileName=file.getOriginalFilename();
		File tmpFile=new File(PmConstant.PATH_UPLOADTMP, fileName);
		if(tmpFile.exists()) {
			tmpFile.delete();
		}
		try {
			file.transferTo(tmpFile);
		} catch (Exception e) {
			e.printStackTrace();
			responseModel.setResult(PmConstant.FAIL);
			responseModel.setMessage("文件上传失败");
			return responseModel;
		}
		
		responseModel.setResult(PmConstant.SUCCESS);
		List dataList=new ArrayList<>();
		Map fileInfo=new HashMap<>();
		fileInfo.put("fileName", fileName);
		fileInfo.put("preview", PmConstant.RESPONSE_PREFIX_PREVIEW+fileName);
		 dataList.add(fileInfo);
		 responseModel.setDataList(dataList);
		 return responseModel;
	}

	public UploadService getUploadService() {
		return uploadService;
	}

	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}
	
	
}
