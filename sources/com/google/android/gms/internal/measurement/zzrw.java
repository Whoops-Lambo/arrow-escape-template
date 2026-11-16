package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzrw {
    public final Context a;

    public /* synthetic */ zzrw(Context context) {
        boolean z;
        new zzsh();
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        zzsq.a(z, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
}
