package cn.chinaSoft.pandaMall.common.dao;

import java.util.ArrayList;
import java.util.List;

import cn.chinaSoft.pandaMall.common.base.Query;
import cn.chinaSoft.pandaMall.common.entity.User;

public interface BaseDao {

	List selectList(Query query);
}
