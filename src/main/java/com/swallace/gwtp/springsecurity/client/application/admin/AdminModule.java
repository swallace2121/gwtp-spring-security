package com.swallace.gwtp.springsecurity.client.application.admin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class AdminModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(AdminPagePresenter.class, AdminPagePresenter.MyView.class, AdminPageView.class,
                AdminPagePresenter.MyProxy.class);
    }
}
