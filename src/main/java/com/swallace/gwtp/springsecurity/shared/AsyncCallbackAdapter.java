package com.swallace.gwtp.springsecurity.shared;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.InvocationException;

public abstract class AsyncCallbackAdapter<T> implements AsyncCallback<T> {
    @Override
    public void onFailure(Throwable caught) {

        if (caught instanceof InvocationException) {
            InvocationException ie = (InvocationException) caught;
            if(ie.getMessage().contains("j_spring_security_check"))
            {
                Window.alert("Session is timed out. Please login again");
                //Window.open(GWT.getHostPageBaseURL() + "login.jsp", "_self", null);
                Window.open("/login.jsp?Callback", "_self", null);
                return;
            }
        }

      //Do other error handling here
    
    }
}