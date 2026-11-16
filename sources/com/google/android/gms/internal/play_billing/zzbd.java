package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import defpackage.nx3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbd {
    public static final zzbo a;

    static {
        nx3 nx3Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            nx3Var = new nx3(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            nx3Var = new nx3(1);
        }
        a = nx3Var;
    }
}
