package com.lee.DesignPatternsDemo;


import com.lee.designpattern.construction.builder.AirShip;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestHeapStack
 * @Description:
 * @author: liting
 * @date: 2018-06-19 9:27
 */
public class TestHeapStack {
    public static ThreadLocal<AirShip> threadLocal = new ThreadLocal<AirShip>();

    @Test
    public void testString() {
        String a = "123";
        String b = "123";
        System.out.println(a == b);
        AirShip airShip = BeanUtils.instantiate(AirShip.class);
        System.out.println(0x61c88647);
        int intA = 1;
        System.out.println(intA);
        boolean bB = false;
        System.out.println(bB);
        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai.get());
        threadLocal.set(airShip);
        AirShip airShip2 = threadLocal.get();
    }

    @Test
    public void testShort() {
        short s = 1;
        s = (short) (s + 1);
        System.out.println(s);
    }

    @Test
    public void testArray() {
        int[] a = {1, 3, 4};
        System.out.println(a.length);
    }

    @Test
    public void testSet() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        System.out.println(set.contains("a"));
    }

    @Test
    public void testWy() {
        System.out.println(2 << 3);
        float f = 3.4f;
        System.out.println(f);
        ArrayList<String> list = new ArrayList<String>();
        list.ensureCapacity(list.size());
        Vector<String> vector = new Vector<String>();
        Stack<String> stack = new Stack<String>();
        stack.push("");
        StringBuffer sb = new StringBuffer();
        System.out.println(sb == null);
    }

    @Test
    public void testFor() {
        label:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) break label;
            }
        }
    }

    @Test
    public void testBlank() {
        String x = "a    a   jkajdfah adf hfjad hfkadf ajflka jahf   anhdfhajfhadfu   adfjiuiaf ";
        char a = 'a';
        System.out.println((int)a);
        System.out.println(replaceWhiteSpace(x));
    }

    public static String replaceWhiteSpace(String originStr) {
        StringBuilder sb = new StringBuilder(originStr.length());
        boolean flag = true;
        for (int i = 0; i < originStr.length(); i++) {
            char a = originStr.charAt(i);
            if (a == ' ') {
                if (flag) {
                    sb.append(a);
                    flag = false;
                }
            } else {
                sb.append(a);
                flag = true;
            }
        }
        return sb.toString();
    }

    @Test
    public void testUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println("{"+uuid.toString().toUpperCase()+"}");
    }
}
