package com.lee.designpattern.construction.builder;

/**
 * @package: com.lee.designpattern.builder
 * @ClassName: BuilderUsage
 * @Description:
 * @author: liting
 * @date: 2018-01-29 10:07
 */
public class BuilderUsage {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("test");
        sb.toString();
        new StringBuffer(10);
    }
}
