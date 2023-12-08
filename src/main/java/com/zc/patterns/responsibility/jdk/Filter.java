package com.zc.patterns.responsibility.jdk;


public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
