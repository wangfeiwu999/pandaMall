package cn.chinaSoft.pandaMall.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
		//property文件路径，如“properties/global-config.properties”
		private static Properties properties=new Properties();

		//加载property文件
		static {
			InputStream inputStream = null;
	         try {
	        	 inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream( "properties/global-config.properties");
	             properties.load(inputStream);
	         } catch (IOException e) {
	             e.printStackTrace();
	         } finally {
	             try {
	            	 inputStream.close();
	             } catch (IOException e) {
	                 e.printStackTrace();
	             }
	         }
		}
		
	     public static String getProperty(String key) {
	         return properties.getProperty(key);
	     }
}
