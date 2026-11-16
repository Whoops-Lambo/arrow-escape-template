package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;
import defpackage.eq3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public final class zzahy implements zzagr {
    public final long a;
    public final zzagr b;

    @Override // com.google.android.gms.internal.ads.zzagr
    public final zzaia b(int i, int i2) {
        return this.b.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void j(zzahr zzahrVar) {
        this.b.j(new eq3(this, zzahrVar, zzahrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void zzw() {
        this.b.zzw();
    }

    public zzahy(long j, zzagr zzagrVar) {
        this.a = j;
        this.b = zzagrVar;
    }
}
