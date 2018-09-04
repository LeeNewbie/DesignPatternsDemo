package com.lee.designpattern.structural.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @package: com.lee.designpattern.structural.adapter
 * @ClassName: Usage
 * @Description:
 * @author: liting
 * @date: 2018-02-06 16:02
 */
public class Usage {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
    }
}
