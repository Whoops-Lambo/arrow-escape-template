package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbva implements zzbtr, zzbuz {
    public final zzbub a;
    public final HashSet b = new HashSet();

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void A(String str, zzbqs zzbqsVar) {
        this.a.A(str, zzbqsVar);
        this.b.add(new AbstractMap.SimpleEntry(str, zzbqsVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void z(String str, zzbqs zzbqsVar) {
        this.a.z(str, zzbqsVar);
        this.b.remove(new AbstractMap.SimpleEntry(str, zzbqsVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtr, com.google.android.gms.internal.ads.zzbuc
    public final void zza(String str) {
        this.a.zza(str);
    }

    public zzbva(zzbub zzbubVar) {
        this.a = zzbubVar;
    }
}
