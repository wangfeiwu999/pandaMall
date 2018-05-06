package cn.chinaSoft.pandaMall.goodsList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.dao.BaseDao;
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.goodsList.service.GoodListHomeService;

@Service("GoodListHomeService")
public class GoodListHomeServiceImpl implements GoodListHomeService {
	
	@Autowired
	private BaseDao basedao;

	@Override
	public List<Object> getGoodsListHome() {
		Query query=new Query();
		query.setSqlName("selectAllUser");
		return basedao.selectList(query);
	}



}
