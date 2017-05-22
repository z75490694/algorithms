package com.example.test;

import java.util.*;


/**
 * Created by WHZ on 2017/4/16.
 */
public class TestCollection {

    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }
    public static void main(String[] args){
        ArrayList<Integer> collection = new ArrayList<>();
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("asdd");
        queue.offer("sdasd");
        queue.poll();
        System.out.println(queue);

        for(Integer a:collection){
            System.out.print(a);
        }
    }
}
