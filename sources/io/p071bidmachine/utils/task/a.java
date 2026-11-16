package io.p071bidmachine.utils.task;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final int c = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    public final ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(c);
    public final ConcurrentHashMap b = new ConcurrentHashMap();
}
