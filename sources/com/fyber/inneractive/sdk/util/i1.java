package com.fyber.inneractive.sdk.util;

import defpackage.nj;
import defpackage.oc1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    @NotNull
    public static final i1 a = new i1();
    private static final String b = IAlog.a(i1.class);

    @NotNull
    private static final AtomicBoolean c = new AtomicBoolean(false);

    private static /* synthetic */ void b() {
    }

    public static final void a() throws Throwable {
        if (c.compareAndSet(false, true)) {
            String strQ = nj.q(new StringBuilder(), b, "SDK integration health check — Kotlin runtime %s");
            oc1.b.getClass();
            IAlog.c(strQ, "2.3.0");
        }
    }

    private i1() {
    }
}
