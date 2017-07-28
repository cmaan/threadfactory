package com.google.apphosting.runtime;

import java.util.concurrent.ThreadFactory;

public class ApiProxyImpl {

	public static class CurrentRequestThreadFactory implements ThreadFactory {

		@Override
		public Thread newThread(Runnable runnable) {
			return null;
		}

	}

}
