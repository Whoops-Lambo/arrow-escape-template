package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgju implements zzipf {
    public final zzipg a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.a.a).getResources().getDisplayMetrics();
        zzipn.a(displayMetrics);
        return displayMetrics;
    }

    public zzgju(zzipg zzipgVar) {
        this.a = zzipgVar;
    }
}
