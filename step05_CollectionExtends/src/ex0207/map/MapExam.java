package ex0207.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	private Map<Integer, String> map =new HashMap<Integer, String>();
	//private Map<Integer, String> map =new TreeMap<Integer, String>(); //key 정렬
    public MapExam() {
    	//추가
    	map.put(20, "희정");
    	map.put(10, "나영");
    	
    	map.put(20, "효리");//중복이면 덮어쓴다. 
    	
    	map.put(30, "희정");
    	map.put(40, "미미");
    	
    	System.out.println("저장된 key-value 수 : " + map.size());
    	System.out.println(map);
    	
    	System.out.println("==============================");
    	//////Map의 key와 value 분리 ///////////////////////
    	//모든 key들의 정보를 검색
    	Set<Integer> keys = map.keySet();
    	Iterator<Integer> it = keys.iterator();
    	while(it.hasNext()) {
    		int key = it.next();
    		String value = map.get(key);
    		System.out.println(key+"에 해당하는 value 는  "+ value);
    	}
    	
    	System.out.println("= 위 코드 개선된 for================");
    	for(Integer key : map.keySet() ) {
    		String value = map.get(key);
    		System.out.println(key+"에 해당하는 value 는  "+ value);
    	}
    	
    	System.out.println("====Map.Entry<K,V> 사용하기 ==========");
    	Set<Map.Entry<Integer, String>>  entrySet = map.entrySet(); //Set안에 Entry<K,V> 형태로 저장해준다.
    	Iterator< Entry<Integer, String> >  ite = entrySet.iterator();
    	while(ite.hasNext()) {
    		Map.Entry<Integer, String> entry = ite.next();
    		int key = entry.getKey();
    		String value = entry.getValue();
    		
    		System.out.println(key +" : " + value);
    	}
    	
    	////////////////////////////////////////////////////////////////////
    	System.out.println("====Map.Entry<K,V> 사용하기 - 개선된 for 변경해보자==========");
    	for(Map.Entry<Integer, String> entry : map.entrySet()) {
    		int key = entry.getKey();
    		String value = entry.getValue();
    		System.out.println(key +" : " + value);
    	}
    	
    }
	public static void main(String[] args) {
		new MapExam();

	}

}
