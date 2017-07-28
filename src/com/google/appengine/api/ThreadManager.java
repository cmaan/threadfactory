package com.google.appengine.api;

import java.util.concurrent.ThreadFactory;

import com.google.apphosting.runtime.ApiProxyImpl.CurrentRequestThreadFactory;

public class ThreadManager {

	public static ThreadFactory currentRequestThreadFactory() {
		return new CurrentRequestThreadFactory();
	}

}
