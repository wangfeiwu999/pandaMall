package cn.chinaSoft.pandaMall.sellerCenter.entity;

import org.springframework.web.multipart.MultipartFile;

import cn.chinaSoft.pandaMall.common.base.Page;
import cn.chinaSoft.pandaMall.common.entity.Good;

public class SellerGoodInfo {
	private Good good;
	private Page page=new Page();
	private MultipartFile file;
	
	public SellerGoodInfo() {
		super();
	}
	public Good getGood() {
		return good;
	}
	public void setGood(Good good) {
		this.good = good;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
}
