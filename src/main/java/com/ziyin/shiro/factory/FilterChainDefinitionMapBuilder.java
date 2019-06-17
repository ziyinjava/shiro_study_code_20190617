package com.ziyin.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("/jsp/login.jsp", "anon");
		map.put("/shiro/login", "anon");
		map.put("/shiro/logout", "logout");
		map.put("/jsp/user.jsp", "authc,roles[user]");
		map.put("/jsp/admin.jsp", "authc");
		map.put("/jsp/list.jsp", "user");
		
		map.put("/**", "authc");
		
		return map;
	}
	
}
