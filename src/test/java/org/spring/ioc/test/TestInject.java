package org.spring.ioc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.spring.ioc.injection.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class) // 指定JUnit默认执行类
public class TestInject extends UnitTestBase{
	public TestInject() {// 通过构造方法传入spring配置文件路径

		super("classpath*:spring-ioc.xml");

	}

	@Test
	public void testInj() {

		InjectionService injectService = super.getBean("injectService");// 从spring容器中获取依赖对象
		System.out.println(injectService.save("Word."));

	}
}
