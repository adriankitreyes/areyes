package com.tpg.main;

import com.tpg.util.Map;
import com.tpg.util.UseMap;

public class MainClass {

	public static void main(String[] args) {
		Map<Integer,String> map = new UseMap<Integer,String>();
		map.put(1, "Value 1");
		map.put(2, "Value 2");
		map.put(3, "Value 3");
		
		System.out.println("get value: " + map.get(1));
	}

}
