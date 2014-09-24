package com.swallace.gwtp.springsecurity.client.application.admin;

import javax.inject.Inject;

import com.swallace.gwtp.springsecurity.client.application.ApplicationPresenter;
import com.swallace.gwtp.springsecurity.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class AdminPagePresenter extends Presenter<AdminPagePresenter.MyView, AdminPagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.admin)
    public interface MyProxy extends ProxyPlace<AdminPagePresenter> {
    }

    @Inject
    AdminPagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
