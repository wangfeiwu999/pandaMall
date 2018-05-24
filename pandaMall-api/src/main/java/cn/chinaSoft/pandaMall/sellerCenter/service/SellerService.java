package cn.chinaSoft.pandaMall.sellerCenter.service;

import java.util.List;

import cn.chinaSoft.pandaMall.sellerCenter.entity.SellerGoodInfo;

public interface SellerService {

	List<?> getGoodsList(SellerGoodInfo sellerGoodInfo);

}
