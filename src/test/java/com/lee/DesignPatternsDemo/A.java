package com.lee.DesignPatternsDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: A
 * @Description:
 * @author: liting
 * @date: 2018-07-09 11:10
 */
public class A {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey()+" : " + integerIntegerEntry.getValue());
        }

    }

}

