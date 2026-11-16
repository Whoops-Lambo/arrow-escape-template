package com.google.android.gms.internal.ads;

import defpackage.oq4;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzgzj<K, V> extends oq4 implements Serializable {
    public final transient zzgze d;
    public final transient int e;

    @Override // defpackage.nq4
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.nq4
    public final boolean f(Object obj) {
        return obj != null && super.f(obj);
    }

    @Override // defpackage.nq4, com.google.android.gms.internal.ads.zzhaj
    public /* synthetic */ Map zzu() {
        return this.d;
    }

    public zzgzj(zzgze zzgzeVar, int i) {
        this.d = zzgzeVar;
        this.e = i;
    }
}
