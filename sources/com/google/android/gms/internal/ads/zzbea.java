package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbea extends zzbee {
    public zzbea(zzbcr zzbcrVar, zzayj zzayjVar, int i) {
        super(zzbcrVar, "O8qfkV4xiwXPHiRd2hJ4MmfnNAmVkjY5RlomMTcyKvcjXsKUKdcw5SdTGzigSGvF", "Ho2oXpvwAH2wkTK/qQg7551UqKcxBHGQPl8v/EyXYgQ=", zzayjVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void a() {
        zzayj zzayjVar = this.d;
        zzayjVar.o(zzazv.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
        synchronized (zzayjVar) {
            try {
                if (zBooleanValue) {
                    zzayjVar.o(zzazv.ENUM_TRUE);
                } else {
                    zzayjVar.o(zzazv.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
