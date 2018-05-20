package cn.chinaSoft.pandaMall.common.base;
/*分页器对象*/
public class Page {
	/*当前页码*/
	private int pageNum=1;
	/*每页条数*/
	private int pageSize=10;
	/*数据库存在的总条数*/
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
