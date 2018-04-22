package cn.chinaSoft.pandaMall.common.base;

import java.util.ArrayList;
import java.util.List;

public class ResponseModel<E> {
	private String message;
	private String result;
	private Page page;
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
