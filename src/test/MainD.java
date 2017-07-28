package test;

import java.lang.reflect.Field;
import java.util.concurrent.ThreadFactory;

import com.google.common.base.Verify;

public class MainD {

	// run with -Dcom.google.appengine.runtime.environment=Production
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("test.static_globals.Include");

		Field f = clazz.getField("threadFactory");
		ThreadFactory threadFactory = (ThreadFactory)f.get(null);
		String className = threadFactory.getClass().getCanonicalName();
		Verify.verify("com.google.apphosting.runtime.ApiProxyImpl.CurrentRequestThreadFactory".equals(className));
	}

}
