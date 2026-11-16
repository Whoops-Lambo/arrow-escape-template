package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaq implements zzbp {
    public final Object a;

    static {
        int i = zzap.a;
    }

    public final Object a() {
        int i = zzae.a;
        if (b.b == null) {
            b.b = new a(null);
        }
        synchronized (b.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public zzaq(Object obj) {
        this.a = obj;
    }
}
