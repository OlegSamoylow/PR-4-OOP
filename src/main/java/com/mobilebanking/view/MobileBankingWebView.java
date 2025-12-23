package com.mobilebanking.view;

import com.google.inject.Inject;
import com.mobilebanking.controller.TransactionController;
import com.mobilebanking.webserver.WebServer;

public class MobileBankingWebView {

    private final WebServer webServer;
    private final TransactionController controller;

    @Inject
    public MobileBankingWebView(WebServer webServer, TransactionController controller) {
        this.webServer = webServer;
        this.controller = controller;
    }

    public void start(int port) {
        webServer.start(port);
        webServer.get("/api/transactions", ctx -> ctx.json(controller.getAllTransactions()));
        System.out.println("MobileBanking server started on port " + port);
    }
}
