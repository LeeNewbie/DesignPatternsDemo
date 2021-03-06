package com.lee.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.lee.designpattern.structural.composite
 * @ClassName: Composite
 * @Description: 容器构件，该节点下还有其他子节点，理解为一个容器，里面包含了其他子节点。就叫做容器构件
 * @author: liting
 * @date: 2018-02-07 10:25
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer("-");
        for (int i = 0; i <= depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
        for (Component com : children) {
            com.display(depth + 2);
        }
    }
}
