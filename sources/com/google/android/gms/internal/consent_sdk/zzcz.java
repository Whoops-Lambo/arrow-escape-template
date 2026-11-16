package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import defpackage.e32;
import defpackage.k10;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcz {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final k10 b = new k10();

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        e32.i("Method must be call on main thread.");
    }
}
