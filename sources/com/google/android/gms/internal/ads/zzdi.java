package com.google.android.gms.internal.ads;

import defpackage.cj0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzdi {
    public static ExecutorService a;

    public static synchronized Executor a() {
        try {
            if (a == null) {
                String str = zzfq.a;
                a = Executors.newSingleThreadExecutor(new cj0(1, "ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
