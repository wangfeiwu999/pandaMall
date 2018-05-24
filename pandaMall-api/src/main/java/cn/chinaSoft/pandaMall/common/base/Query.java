package cn.chinaSoft.pandaMall.common.base;

import java.util.HashMap;
import java.util.Map;

/*查询对象，作为baseDao的参数*/
public class Query {
	/*sql语言在mapper文件中的名称*/
	private String sqlName;
	/*sql查询参数*/
	private Map<String, Object> sqlParameters;
	
	public Query() {
		super();
	}

	public String getSqlName() {
		return sqlName;
	}

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}

	public Map<String, Object> getSqlParameters() {
		return sqlParameters;
	}

	public void setSqlParameters(Map<String, Object> sqlParameters) {
		this.sqlParameters = sqlParameters;
	}


	
}
