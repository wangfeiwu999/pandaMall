package cn.chinaSoft.pandaMall.sellerCenter.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.dao.BaseDao;
import cn.chinaSoft.pandaMall.sellerCenter.entity.SellerGoodInfo;
import cn.chinaSoft.pandaMall.sellerCenter.service.SellerService;

@Service("SellerService")
public class SellerServiceImpl implements SellerService {

	@Autowired
	private BaseDao basedao;
	
	@Override
	public List<?> getGoodsList(SellerGoodInfo sellerGoodInfo) {
		Query query=new Query();
		query.setSqlName("getGoodsListBySellerId");
		Map<String, Object> sqlParameters=new HashMap<>();
		sqlParameters.put("userId", sellerGoodInfo.getGood().getId());
		query.setSqlParameters(sqlParameters);
		return basedao.selectList(query);
	}

}
