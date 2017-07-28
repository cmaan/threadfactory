package test;

import java.util.concurrent.ThreadFactory;

import com.google.common.base.Verify;

import test.static_globals.Include;

public class MainF {

	private static final ThreadFactory threadFactory;

	static {
		threadFactory = Include.threadFactory;
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("com.google.appengine.runtime.environment","Production");
		String className = threadFactory.getClass().getCanonicalName();
		Verify.verify("java.util.concurrent.Executors.DefaultThreadFactory".equals(className));
	}

}
