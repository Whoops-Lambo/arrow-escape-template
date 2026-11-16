package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public final class zzahw extends zzahc {
    public final long b;

    public zzahw(zzagp zzagpVar, long j) {
        boolean z;
        super(zzagpVar);
        if (zzagpVar.zzn() >= j) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahc, com.google.android.gms.internal.ads.zzagp
    public final long zzm() {
        return super.zzm() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzahc, com.google.android.gms.internal.ads.zzagp
    public final long zzn() {
        return super.zzn() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzahc, com.google.android.gms.internal.ads.zzagp
    public final long zzo() {
        return super.zzo() - this.b;
    }
}
