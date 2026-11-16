package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzaia {
    default void b(int i, zzey zzeyVar) {
        g(zzeyVar, i, 0);
    }

    int c(zzj zzjVar, int i, boolean z);

    void e(long j, int i, int i2, int i3, zzahz zzahzVar);

    void f(zzv zzvVar);

    void g(zzey zzeyVar, int i, int i2);

    default int d(zzj zzjVar, int i, boolean z) {
        return c(zzjVar, i, z);
    }
}
