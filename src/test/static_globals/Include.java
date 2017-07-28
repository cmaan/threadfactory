package test.static_globals;

import java.util.concurrent.ThreadFactory;

import com.google.common.util.concurrent.MoreExecutors;

public class Include {

	public static final ThreadFactory threadFactory = MoreExecutors.platformThreadFactory();

}
