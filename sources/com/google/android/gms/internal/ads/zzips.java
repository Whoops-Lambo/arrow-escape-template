package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzips implements zzipo {
    public static final Object c = new Object();
    public volatile zzipo a;
    public volatile Object b;

    public static zzipo a(zzipo zzipoVar) {
        if ((zzipoVar instanceof zzips) || (zzipoVar instanceof zzipe)) {
            return zzipoVar;
        }
        zzips zzipsVar = new zzips();
        zzipsVar.b = c;
        zzipsVar.a = zzipoVar;
        return zzipsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        zzipo zzipoVar = this.a;
        if (zzipoVar == null) {
            return this.b;
        }
        Object objZzb = zzipoVar.zzb();
        this.b = objZzb;
        this.a = null;
        return objZzb;
    }
}
