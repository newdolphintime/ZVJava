package com.zvi.study.ZCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapDemo {
	public static void main(String[] args) {
		//注意  如果去掉STUDENT类中的hashcode和equal方法 去重的效果将不会生效
		HashMap<Student, String> hm=new HashMap<Student, String>();
		hm.put(new Student("zhang1", 21), "beijing");
		hm.put(new Student("zhang2", 22), "nanjing");
		hm.put(new Student("zhang3", 23), "shanghai");
		hm.put(new Student("zhang4", 24), "hangzhou");
		hm.put(new Student("zhang1", 21), "beijing");
		
		Set<Map.Entry<Student, String>> entrySet =hm.entrySet();
		Iterator<Map.Entry<Student, String>> it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Student, String>me=it.next();
			Student s=me.getKey();
			String addr=me.getValue();
			System.out.println(s.toString()+addr);
		}
	}
	private void methodBase() {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, "kong");
		map.put(null, "kong2");
		map.put("01", "kong1");
		map.put("02", "kong2");
		map.put("03", "kong3");
		map.put("01", "kong2");
		System.out.println(map.get(null));//键值相同取最新的那个
		Collection<String> coll =map.values();
		System.out.println(coll);
		System.out.println(map);
		Set<Map.Entry<String, String>> entrySet= map.entrySet();
		Iterator<Map.Entry<String, String>>it =entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> me=it.next();
			String key=me.getKey();
			String value =me.getValue();
			System.out.println("key:"+key+"value"+value);
			
		}
	}

}
