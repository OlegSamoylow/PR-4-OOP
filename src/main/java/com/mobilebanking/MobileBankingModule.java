package com.mobilebanking;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.Provides;
import com.mobilebanking.service.TransactionService;
import com.mobilebanking.webserver.JavalinWebServer;
import com.mobilebanking.webserver.WebServer;

public class MobileBankingModule extends AbstractModule {

    @Provides
    @Singleton
    TransactionService provideTransactionService() {
        return new TransactionService();
    }

    @Provides
    @Singleton
    WebServer provideWebServer() {
        return new JavalinWebServer();
    }
}
