package cn.chinaSoft.pandaMall.common.constant;

import java.io.File;

import cn.chinaSoft.pandaMall.common.util.PropertiesUtil;

public class PmConstant {
	/*结果类常量*/
	public static final String SUCCESS="SUCCESS";
	public static final String FAIL="FAIL";
	
	
	/*文件夹名称常量*/
	public static final String FOLDER_IMG="img";
	public static final String FOLDER_FILE="file";
	public static final String FOLDER_UPLOADTMP="uploadTmp";
	

	//	服务器临时文件夹路径
	public static final String PATH_UPLOADTMP=PropertiesUtil.getProperty("pm.good.static.path")+File.separator+"uploadTmp";
	//服务器图片文件路径
	public static final String PATH_IMG=PropertiesUtil.getProperty("pm.good.static.path")+File.separator+"img";
	//服务器其他文件路径
	public static final String PATH_FILE=PropertiesUtil.getProperty("pm.good.static.path")+File.separator+"file";
	
	//展示在前台的正式图片路径前缀（预览图除外）
	public static final String RESPONSE_PREFIX_PIC="api"+File.separator+"static"+File.separator+"img"+File.separator;
	//展示在前台的临时图片路径前缀（预览图）
	public static final String RESPONSE_PREFIX_PREVIEW="api"+File.separator+"static"+File.separator+"uploadTmp"+File.separator;
}
