package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcoj {
    public final int a;
    public final int b;
    public final int c;

    public static zzcoj a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.zzd) {
            return new zzcoj(3, 0, 0);
        }
        if (zzrVar.zzi) {
            return new zzcoj(2, 0, 0);
        }
        return zzrVar.zzh ? new zzcoj(0, 0, 0) : new zzcoj(1, zzrVar.zzf, zzrVar.zzc);
    }

    public final boolean b() {
        return this.a == 3;
    }

    public zzcoj(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }
}
