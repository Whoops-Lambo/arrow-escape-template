package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import android.os.Looper;
import defpackage.dr0;
import defpackage.uw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public final uw a = new uw();

    public static Handler a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return new Handler(looperMyLooper);
        }
        dr0.f(Thread.currentThread(), " that has not called Looper.prepare()", "Can't create handler inside thread ");
        return null;
    }
}
