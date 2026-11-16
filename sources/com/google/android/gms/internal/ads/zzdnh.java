package com.google.android.gms.internal.ads;

import defpackage.ep0;
import defpackage.qk4;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdnh implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.ads.internal.client.zza {
    public final zzdyf a;
    public final zzflt b;
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

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzdyf zzdyfVar = this.a;
        if (zzdyfVar.b.get()) {
            zzgew zzgewVar = zzdyfVar.a;
            zzgewVar.getClass();
            zzgve.a(zzgewVar.a, zzgewVar.b, new qk4(zzgewVar, null, 1));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
        if (this.c.getAndSet(true)) {
            return;
        }
        zzdyf zzdyfVar = this.a;
        if (zzdyfVar.b.getAndSet(false)) {
            zzgew zzgewVar = zzdyfVar.a;
            zzgewVar.getClass();
            zzgve.a(zzgewVar.a, zzgewVar.b, new qk4(zzgewVar, null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
        if (this.c.getAndSet(true)) {
            return;
        }
        zzdyf zzdyfVar = this.a;
        if (zzdyfVar.b.getAndSet(false)) {
            zzgew zzgewVar = zzdyfVar.a;
            zzgewVar.getClass();
            zzgve.a(zzgewVar.a, zzgewVar.b, new qk4(zzgewVar, null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        String str = this.b.b;
        boolean zQ = ep0.Q(str);
        zzdyf zzdyfVar = this.a;
        if (zQ) {
            zzdyfVar.getClass();
            return;
        }
        if (!zzdyfVar.c.get() || zzdyfVar.b.getAndSet(true)) {
            return;
        }
        zzgew zzgewVar = zzdyfVar.a;
        zzgewVar.getClass();
        str.getClass();
        zzgve.a(zzgewVar.a, zzgewVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b(zzgewVar, str, null, 22));
    }

    public zzdnh(zzdyf zzdyfVar, zzflt zzfltVar) {
        this.a = zzdyfVar;
        this.b = zzfltVar;
    }
}
