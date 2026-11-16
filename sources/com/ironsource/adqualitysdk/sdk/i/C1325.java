package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｯ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1325 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static C1325 f3937;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public C0422 f3938;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public ChoreographerFrameCallbackC1340 f3939;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f3942;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f3941 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Handler f3940 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m944(C1325 c1325) {
        if (c1325.f3942 || new HashMap(c1325.f3941).isEmpty()) {
            return;
        }
        c1325.f3942 = true;
        AbstractC4631n.m402(new C1337(c1325));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C1325 m943() {
        try {
            if (f3937 == null) {
                f3937 = new C1325();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3937;
    }
}
