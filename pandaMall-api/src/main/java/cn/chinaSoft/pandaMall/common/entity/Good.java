package cn.chinaSoft.pandaMall.common.entity;

import java.sql.Timestamp;

import cn.chinaSoft.pandaMall.common.constant.Currency;
/*商品实体类*/
public class Good {
	private String id;
	//商品名称
	private String name;
	//商品图片URL
	private String imgNames;
	//价格
	private double price;
	//商品计价货币
	private String currency=Currency.CNY.getName();
	//产地
	private String productionPlace;
	//销售量
	private int salesCount;
	//销售额
	private double salesAmount;
	//产品介绍
	private String introduce;
	//上架时间
	private Timestamp crtDate;
	//最近修改时间
	private Timestamp modifyDate;
	//下架时间
	private Timestamp unShelveDate;
	//状态，0代表已下架，1代表在售
	private int state;
	//商品所属用户的id
	private int userId;
	
	public Good() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	public String getImgNames() {
		return imgNames;
	}

	public void setImgNames(String imgNames) {
		this.imgNames = imgNames;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProductionPlace() {
		return productionPlace;
	}

	public void setProductionPlace(String productionPlace) {
		this.productionPlace = productionPlace;
	}

	public int getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Timestamp getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(Timestamp crtDate) {
		this.crtDate = crtDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Timestamp getUnShelveDate() {
		return unShelveDate;
	}

	public void setUnShelveDate(Timestamp unShelveDate) {
		this.unShelveDate = unShelveDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}



	
}
