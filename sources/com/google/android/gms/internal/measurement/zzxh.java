package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import defpackage.qb5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzxh {
    public static final qb5 a;

    static {
        qb5 qb5Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            qb5Var = new qb5(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            qb5Var = new qb5(1);
        }
        a = qb5Var;
    }
}
