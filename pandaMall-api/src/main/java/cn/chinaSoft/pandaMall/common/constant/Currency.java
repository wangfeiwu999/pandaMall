package cn.chinaSoft.pandaMall.common.constant;

public enum Currency {
	CNY("CNY",1),USD("USD",2);
	private String name;
	private int index;
	
	
	private Currency(String name, int index) {
		this.name = name;
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
