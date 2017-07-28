package test;

import com.google.common.base.Verify;

import test.static_globals.Include;

public class MainA {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Class<?> clazz = test.static_globals.Include.class;

		System.setProperty("com.google.appengine.runtime.environment","Production");

		String className = Include.threadFactory.getClass().getCanonicalName();
		Verify.verify("com.google.apphosting.runtime.ApiProxyImpl.CurrentRequestThreadFactory".equals(className));
	}

}
