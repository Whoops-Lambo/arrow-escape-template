package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbdj extends zzbee {
    public static volatile String h;
    public static final Object i = new Object();

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void a() {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (String) this.e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzayj zzayjVar = this.d;
        synchronized (zzayjVar) {
            String str = h;
            zzayjVar.l();
            ((zzazk) zzayjVar.b).s0(str);
        }
    }
}
