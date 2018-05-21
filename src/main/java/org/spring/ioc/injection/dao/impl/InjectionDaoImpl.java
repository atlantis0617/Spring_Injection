package org.spring.ioc.injection.dao.impl;

import org.spring.ioc.injection.dao.InjectionDao;

public class InjectionDaoImpl implements InjectionDao{

	@Override
	public String save(String word) {
		
		return "数据保存成功！保存的数据是：" + word.hashCode();
		
	}

}
