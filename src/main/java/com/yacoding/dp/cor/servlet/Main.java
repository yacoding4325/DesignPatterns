package com.yacoding.dp.cor.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-05-27 上午 9:45
 */

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("hello world!!!");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new FaceFilter()).add(new URLFilter());

        filterChain.add(filterChain2);
        filterChain.doFilter(msg);
        System.out.println(msg);

    }
}

class Msg {

    String name;

    String msg;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}

interface Filter {
    boolean doFilter(Msg m);

}

class FilterChain implements Filter{

    private List<Filter> filters =new ArrayList<>();

    public FilterChain  add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg m) {

        for (Filter filter :filters) {
            if (!filter.doFilter(m)) {
                return false;
            }
        }
        return true;
    }
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        m.setMsg(r);
        return true;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replaceAll("996", "955");
        m.setMsg(r);
        return false;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace(":)", "^V^");
        m.setMsg(r);
        return true;
    }
}

class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("yacoding.com", "http://www.yacoding.com");
        m.setMsg(r);
        return true;
    }
}

