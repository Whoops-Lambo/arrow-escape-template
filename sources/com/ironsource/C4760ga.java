package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4760ga {

    @NotNull
    public static final C4760ga a = new C4760ga();

    private C4760ga() {
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str, boolean z) {
        str.getClass();
        if (obj != null) {
            return true;
        }
        if (!z) {
            if (!z) {
                IronLog.API.error(str);
                return false;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return false;
        }
        defpackage.d.w(str);
        return false;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str) {
        str.getClass();
        return a(obj, str, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }

    public static final <T> T a(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }
}
