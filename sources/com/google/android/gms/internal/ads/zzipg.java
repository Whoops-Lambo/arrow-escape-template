package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipg implements zzipf, zzioz {
    public static final zzipg b = new zzipg(null);
    public final Object a;

    public static zzipg a(Object obj) {
        if (obj != null) {
            return new zzipg(obj);
        }
        defpackage.d.w("instance cannot be null");
        return null;
    }

    public static zzipg b(Object obj) {
        return obj == null ? b : new zzipg(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return this.a;
    }

    public zzipg(Object obj) {
        this.a = obj;
    }
}
