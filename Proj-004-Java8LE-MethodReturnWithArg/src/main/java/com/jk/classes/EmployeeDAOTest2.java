package com.jk.classes;

import java.util.HashMap;
import java.util.Map;

public final class EmployeeDAOTest2 {

	public static void main(String[] args) {
		Map <String, String> map= new HashMap();
		EmployeeDAO2 dao = (msg, name) -> {
			map.put("name1", "Jeeban");
			map.put("name2", "Kishore");
			return map; 
		};
		dao.insertRecords("name", "name");
		System.out.println(map.toString());
	}
}
