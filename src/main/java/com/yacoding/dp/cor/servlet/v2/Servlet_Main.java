package com.yacoding.dp.cor.servlet.v2;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-05-27 上午 10:11
 */

public class Servlet_Main {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好";

        Response response = new Response();
        response.str = "response";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request,response);
        System.out.println(request.str);
        System.out.println(response.str);
    }

}


interface Filter {
    boolean doFilter(Request request, Response response);
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
        response.str += "--HTMLFilter()";
        return true;
    }
}

class Request {
    String str;
}

class Response{
    String str;
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replace("水","果");
        response.str += "--SensitiveFilter()";
        return true;
    }
}

class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();
    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }


    @Override
    public boolean doFilter(Request request, Response response) {
        for (Filter filter :filters) {
            filter.doFilter(request, response);
        }
        return true;
    }
}