package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqp extends RuntimeException {
    public zzhqp(String str, Throwable th) {
        super(str, th);
    }

    public static Object a(zzhqo zzhqoVar) {
        try {
            return zzhqoVar.zza();
        } catch (Exception e) {
            throw new zzhqp(e);
        }
    }

    public zzhqp(Throwable th) {
        super(th);
    }
}
