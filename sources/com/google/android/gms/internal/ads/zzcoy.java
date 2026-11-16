package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcoy implements zzipf {
    public final zzcoq a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        WeakReference weakReference = this.a.d;
        zzipn.a(weakReference);
        return weakReference;
    }

    public zzcoy(zzcoq zzcoqVar) {
        this.a = zzcoqVar;
    }
}
