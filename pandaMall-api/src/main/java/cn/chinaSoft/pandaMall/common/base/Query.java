package cn.chinaSoft.pandaMall.common.base;

import java.util.HashMap;

/*查询对象，作为baseDao的参数*/
public class Query {
	/*sql语言在mapper文件中的名称*/
	private String sqlName;
	/*sql查询参数*/
/*	private HashMap<String, T> sqlParameters;*/
	
	public Query() {
		super();
	}

	public String getSqlName() {
		return sqlName;
	}

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}

/*	public HashMap<String, T> getSqlParameters() {
		return sqlParameters;
	}

	public void setSqlParameters(HashMap<String, T> sqlParameters) {
		this.sqlParameters = sqlParameters;
	}*/
	
	
}
