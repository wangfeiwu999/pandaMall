package cn.chinaSoft.pandaMall.common.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.dao.BaseDao;
import cn.chinaSoft.pandaMall.common.entity.User;

@Repository("BaseDao")
public class BaseDaoImpl  implements BaseDao{
	@Autowired  
    private SqlSessionTemplate sqlSession;  
	


	@Override
	public List selectList(Query query) {
		return sqlSession.selectList(query.getSqlName());
	} 
}
