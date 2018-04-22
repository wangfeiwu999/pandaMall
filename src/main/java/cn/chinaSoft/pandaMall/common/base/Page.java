package cn.chinaSoft.pandaMall.common.base;

public class Page {
	private int pageNum=1;
	private int pageSize=10;
	private int total=0;
	
	public Page() {
		super();
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
