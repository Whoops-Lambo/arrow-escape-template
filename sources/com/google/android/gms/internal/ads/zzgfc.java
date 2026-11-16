package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.al4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgfc extends al4 {
    public static zzgfc i;

    public static final zzgfc f(Context context) {
        zzgfc zzgfcVar;
        synchronized (zzgfc.class) {
            try {
                if (i == null) {
                    i = new zzgfc(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                zzgfcVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgfcVar;
    }
}
