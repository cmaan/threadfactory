package test;

import com.google.common.base.Verify;

public class MainB {

	public static void main(String[] args) {
		System.setProperty("com.google.appengine.runtime.environment","Production");

		String className = test.static_globals.Include.threadFactory.getClass().getCanonicalName();
		Verify.verify("com.google.apphosting.runtime.ApiProxyImpl.CurrentRequestThreadFactory".equals(className));
	}

}
