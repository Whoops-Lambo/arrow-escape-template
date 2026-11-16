package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ie {

    @Nullable
    private static Boolean b;

    @NotNull
    public static final Ie a = new Ie();

    @NotNull
    private static He c = He.NOT_INIT;

    public final synchronized void a(@NotNull He he) {
        he.getClass();
        c = he;
    }

    @NotNull
    public final He b() {
        Boolean bool = b;
        if (bool == null || bool.equals(Boolean.FALSE)) {
            return He.NOT_INIT;
        }
        if (bool.equals(Boolean.TRUE)) {
            return c;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }

    private Ie() {
    }

    @NotNull
    public final synchronized He a() {
        return c;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
