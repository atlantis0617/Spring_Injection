package org.spring.ioc.injection.service.impl;

import org.spring.ioc.injection.dao.InjectionDao;
import org.spring.ioc.injection.service.InjectionService;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDao injectDao;

	// 设值注入
	// public void setInjectDao(InjectionDao injectDao) {
	// this.injectDao = injectDao;
	// }
	
	
	public InjectionServiceImpl(InjectionDao injectDao) {
		this.injectDao = injectDao;
	}

	@Override
	public String save(String word) {

		System.out.println("传递过来的参数是：" + word);
        return injectDao.save(word);
        
	}

}
