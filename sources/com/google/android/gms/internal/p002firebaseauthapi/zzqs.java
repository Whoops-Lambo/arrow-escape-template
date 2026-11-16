package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqs extends RuntimeException {
    public zzqs(Throwable th) {
        super(th);
    }

    public static <T> T a(zzqr<T> zzqrVar) {
        try {
            return (T) zzqrVar.zza();
        } catch (Exception e) {
            throw new zzqs(e);
        }
    }

    public zzqs(String str, Throwable th) {
        super(str, th);
    }
}
