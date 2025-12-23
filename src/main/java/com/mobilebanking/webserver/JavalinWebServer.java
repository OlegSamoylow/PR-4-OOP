package com.mobilebanking.webserver;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class JavalinWebServer implements WebServer {

    private Javalin app;

    @Override
    public void start(int port) {
        app = Javalin.create().start(port);
    }

    @Override
    public void get(String path, Handler handler) {
        app.get(path, handler);
    }
}
