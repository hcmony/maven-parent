package com.hcmony.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/10/17 15:41
 */
public class ConcurrentMapDemo {
	private static ConcurrentHashMap map = new ConcurrentHashMap();

	/*public static void main(String[] args) {
		map.put("q","a");
		System.out.println(map.putIfAbsent("q","d"));
		System.out.println(map.get("q"));
		System.out.println(map.containsKey("q"));
		System.out.println(map.contains("a"));
		map.put("dd","d");
		System.out.println(map.containsValue("d"));
	}*/
	public static void main(String[] args)throws Exception {
		for (int i=0;i<10;i++){

				System.out.println(i);
				if(i==5){
					throw new Exception("5报错了");
				}

		}
		System.out.println("结束了");
	}
}
