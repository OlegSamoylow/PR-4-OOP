package com.mobilebanking.webserver;

import io.javalin.http.Handler;

public interface WebServer {
    void start(int port);
    void get(String path, Handler handler);
}
