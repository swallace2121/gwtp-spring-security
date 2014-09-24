package com.swallace.gwtp.springsecurity.client.application.admin;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class AdminPageView extends ViewImpl implements AdminPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, AdminPageView> {
    }

    @Inject
    AdminPageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
