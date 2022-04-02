package dcp.common;

import java.util.*;

public class LRUCache_202008329 {

	public static void main(String[] args) {
        System.out.println("Hello, world!");
        Map<String,String> baseMap = new HashMap<>();
        Map<String,String> baseCounterMap = new HashMap<>();
        String key = "";
        String value = getLRUValue(key,baseMap,baseCounterMap);
        //Delete operation based on LRU element
        String ele = getLRUItem(baseMap,baseCounterMap);
    }
    
    //0(1)
    public static String getLRUValue(String key,Map<String,String> baseMap,Map<String,String> baseCounterMap) {
        baseCounterMap.put(key,baseCounterMap.get(key)+1);
        return baseMap.get(key);
    }
    
    //0(1)
    public static void populateLRUMap(String key, String value,Map<String,String> baseMap,Map<String,String> baseCounterMap) {
        baseMap.put(key,value);
        if(baseCounterMap.get(key)!=null) {
            baseCounterMap.put(key,String.valueOf(baseCounterMap.get(key)+1));
        } else {
            baseCounterMap.put(key,String.valueOf(1));
        }
    }
    
    //o(n)
    public static String getLRUItem(Map<String,String> baseMap,Map<String,String> baseCounterMap) {
        List<Integer> counterList = new ArrayList<>();
        for(Map.Entry<String,String> entry : baseCounterMap.entrySet()) {
            counterList.add(Integer.valueOf(entry.getValue()));
        }
        Collections.sort(counterList);
        for(Map.Entry<String,String> entry : baseCounterMap.entrySet()) {
            if(entry.getValue()==String.valueOf(counterList.get(0))){
                return entry.getKey();
            }
        }
        return "";
    }

}
