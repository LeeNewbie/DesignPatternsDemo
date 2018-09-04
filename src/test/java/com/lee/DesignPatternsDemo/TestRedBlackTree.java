package com.lee.DesignPatternsDemo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestRedBlackTree
 * @Description:
 * @author: liting
 * @date: 2018-08-14 14:22
 */
public class TestRedBlackTree {

    @Test
    public void testMap() throws Exception {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(8);
        for (int i = 0; i < 6; i++) {
            map.put(i, i+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey()+" : "+integerIntegerEntry.getValue());
        }
    }
}
