package cn.xt.dubbo.demo;

import java.util.List;

public interface DemoService {

	String getName(String name);
	
	List<String> getPermissions(Long id);
	
}
