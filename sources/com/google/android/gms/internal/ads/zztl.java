package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zztl {
    public final Context a;
    public zzqp b;
    public zztr c;

    public zztl(Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.a = applicationContext;
        zzud zzudVar = zztt.a;
        if (context == null) {
            this.b = zzqp.f;
        }
    }
}
