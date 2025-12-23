package com.mobilebanking;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mobilebanking.view.MobileBankingWebView;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MobileBankingModule());
        MobileBankingWebView webView = injector.getInstance(MobileBankingWebView.class);
        webView.start(8080);
    }
}
