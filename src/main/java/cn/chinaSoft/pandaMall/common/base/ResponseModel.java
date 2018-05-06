package cn.chinaSoft.pandaMall.common.base;

import java.util.ArrayList;
import java.util.List;

/*响应给前台的数据模型*/
public class ResponseModel<E> {
	/*简要的信息提示*/
	private String message;
	/*响应结果：成功、失败*/
	private String result;
	/*分页信息，适用于查询类操作*/
	private Page page;
	/*查询到的数据list*/
	private List<E> dataList=new ArrayList<E>(10);
	
	public ResponseModel() {
		super();
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<E> getDataList() {
		return dataList;
	}
	public void setDataList(List<E> dataList) {
		this.dataList = dataList;
	}
}
