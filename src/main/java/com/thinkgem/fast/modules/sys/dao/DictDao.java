package com.thinkgem.fast.modules.sys.dao;

import java.util.List;

import com.thinkgem.fast.common.persistence.CrudDao;
import com.thinkgem.fast.common.persistence.annotation.MyBatisDao;
import com.thinkgem.fast.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author renshuo
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
