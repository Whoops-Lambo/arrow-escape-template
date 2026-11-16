package com.google.android.gms.internal.ads;

import defpackage.xb2;
import defpackage.xl1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzczt implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzdfj a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.a.k0(xb2.s);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
        this.b.set(true);
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.a.k0(xb2.s);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.a.k0(xl1.p);
    }

    public zzczt(zzdfj zzdfjVar) {
        this.a = zzdfjVar;
    }
}
