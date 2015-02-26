package javaexamples.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by oztokmakc on 25/02/15.
 */
// leetcode - lru cache
public class LRUCache {

    private Map<Integer, Integer> cache;
    private int initial;

    public LRUCache(int capacity) {
        initial = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity) {

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > initial;
            }
        };
    }

    public int get(int key) {
        Integer value = cache.get(key);
        if (value == null) return -1;
        else {
            int val = cache.remove(key);
            cache.put(key, val);
            return val;
        }
    }

    public void set(int key, int value) {
        cache.remove(key);
        cache.put(key, value);
    }

}
