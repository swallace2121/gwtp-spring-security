package com.swallace.gwtp.springsecurity.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>AuthService</code>.
 */
public interface AuthServiceAsync {
	void retrieveUsername(AsyncCallback<String> callback);
}
