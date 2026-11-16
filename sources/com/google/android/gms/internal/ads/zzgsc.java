package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ku4;
import defpackage.nu4;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsc implements zzgrr, zzghy {
    public final Context a;
    public final zzgsw b;
    public final zzher c;
    public final zzgfx d;
    public final zzghg f;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ListenableFuture g = nu4.b;

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
        map.put("gs", this.g);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
        map.put("gs", this.g);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void c(HashMap map, Context context, View view) {
        map.put("gs", this.g);
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        if (this.e.getAndSet(true)) {
            return nu4.b;
        }
        if (!this.d.a0()) {
            return nu4.b;
        }
        zzhfd zzhfdVarS = zzhfd.s();
        this.g = zzhfdVarS;
        this.b.f(53, new ku4(29, this, zzhfdVarS));
        return nu4.b;
    }

    public zzgsc(Context context, zzgsw zzgswVar, zzher zzherVar, zzgfx zzgfxVar, zzghg zzghgVar) {
        this.a = context;
        this.b = zzgswVar;
        this.c = zzherVar;
        this.d = zzgfxVar;
        this.f = zzghgVar;
    }
}
