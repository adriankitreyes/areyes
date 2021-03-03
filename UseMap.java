package com.tpg.util;

import java.util.ArrayList;
import java.util.List;

public class UseMap<K,V> implements Map<K, V> {

	private static final String DELIMETER = ";";
	List<Object> list = new ArrayList<Object>();
	
	@SuppressWarnings("unchecked")
	@Override
	public V get(Object key) {
		for (Object obj : list)
		{
			if (obj.toString().contains(key.toString()))
			{
				String[] arrStr = obj.toString().split(DELIMETER);
				return (V) arrStr[1];
			}
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		String obj = key.toString() + DELIMETER + value.toString();
		list.add(obj);
	}

}
