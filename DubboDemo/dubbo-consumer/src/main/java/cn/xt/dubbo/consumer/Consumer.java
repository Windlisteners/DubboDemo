package cn.xt.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xt.dubbo.demo.DemoService;

public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println(demoService.getName("bear"));
		System.out.println(demoService.getPermissions(1L));
	}

}
