package cn.chinaSoft.pandaMall.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.dao.BaseDao;
import cn.chinaSoft.pandaMall.common.entity.User;
import cn.chinaSoft.pandaMall.home.service.HomeService;

@Service("HomeService")
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private BaseDao basedao;

	@Override
	public List getGoodsListHome() {
		Query query=new Query();
		query.setSqlName("selectAllUser");
		return basedao.selectList(query);
	}



}
