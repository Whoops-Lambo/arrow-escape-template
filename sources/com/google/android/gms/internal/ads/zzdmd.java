package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.mx3;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdmd extends zzdka implements zzbfr {
    public final WeakHashMap b;
    public final Context c;
    public final zzflq d;

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final synchronized void K(zzbfq zzbfqVar) {
        k0(new mx3(zzbfqVar, 20));
    }

    public final synchronized void l0(View view) {
        try {
            WeakHashMap weakHashMap = this.b;
            zzbft zzbftVar = (zzbft) weakHashMap.get(view);
            if (zzbftVar == null) {
                zzbft zzbftVar2 = new zzbft(this.c, view);
                zzbftVar2.l.add(this);
                zzbftVar2.d(3);
                weakHashMap.put(view, zzbftVar2);
                zzbftVar = zzbftVar2;
            }
            if (this.d.X) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.i2)).booleanValue()) {
                    zzbftVar.i.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.h2)).longValue());
                    return;
                }
            }
            zzbftVar.i.zzb(zzbft.o);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzdmd(Context context, Set set, zzflq zzflqVar) {
        super(set);
        this.b = new WeakHashMap(1);
        this.c = context;
        this.d = zzflqVar;
    }
}
