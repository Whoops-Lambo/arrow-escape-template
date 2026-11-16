package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcza implements zzczb {
    public final Map a;

    @Override // com.google.android.gms.internal.ads.zzczb
    public final zzend a(int i, String str) {
        return (zzend) this.a.get(str);
    }

    public zzcza(Map map) {
        this.a = map;
    }
}
