package com.inmobi.media;

import android.os.HandlerThread;
import defpackage.c91;
import defpackage.dk2;
import defpackage.kk2;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4097i7 {
    public static final boolean a(String str) {
        if (str == null || dk2.y0(str).toString().length() == 0) {
            return true;
        }
        return (kk2.L(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, false) || kk2.L(str, "https://", false)) ? false : true;
    }

    public static final void a(HandlerThread handlerThread, String str) {
        handlerThread.getClass();
        str.getClass();
        try {
            handlerThread.start();
        } catch (InternalError e) {
            e.toString();
        }
    }

    public static final void a(c91 c91Var) {
        if (c91Var == null || !c91Var.isActive()) {
            return;
        }
        c91Var.cancel(null);
    }
}
