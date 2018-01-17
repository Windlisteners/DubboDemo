package cn.xt.dubbo.demo.impl;

import java.util.ArrayList;
import java.util.List;

import cn.xt.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	public String getName(String name) {
		return "hello," + name;
	}

	public List<String> getPermissions(Long id) {
		List<String> list = new ArrayList<String>();
		list.add(String.format("Permissions_%d", id - 1));
		list.add(String.format("Permissions_%d", id));
		list.add(String.format("Permissions_%d", id + 1));
		return list;
	}

}
