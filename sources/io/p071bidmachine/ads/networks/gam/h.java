package io.p071bidmachine.ads.networks.gam;

import io.p071bidmachine.AdsFormat;
import java.util.EnumMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final int d = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    public final ScheduledExecutorService a = Executors.newScheduledThreadPool(d);
    public final EnumMap b = new EnumMap(AdsFormat.class);
    public final Object c = new Object();
}
