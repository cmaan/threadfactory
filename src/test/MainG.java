package test;

import java.util.concurrent.ThreadFactory;

import com.google.common.base.Verify;

import test.static_globals.Include;

public class MainG {

	private static final ThreadFactory threadFactory;

	static {
		threadFactory = Include.threadFactory;
	}

	// run with -Dcom.google.appengine.runtime.environment=Production
	public static void main(String[] args) throws Exception {
		String className = threadFactory.getClass().getCanonicalName();
		Verify.verify("com.google.apphosting.runtime.ApiProxyImpl.CurrentRequestThreadFactory".equals(className));
	}

}
