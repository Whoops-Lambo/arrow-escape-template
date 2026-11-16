package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface zznk {
    String a();

    int b(zzv zzvVar);

    default void s(zznj zznjVar) {
    }

    int zza();

    int zzu();

    default void zzw() {
    }

    static boolean e(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }
}
