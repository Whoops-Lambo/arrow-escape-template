package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import defpackage.d24;
import defpackage.o64;
import defpackage.os0;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class zzebf {
    public final HashMap a;
    public final Context b;
    public final Executor c;
    public final zzu d;
    public final boolean e;
    public final CsiUrlBuilder f;
    public final boolean g;
    public final AtomicBoolean h;
    public final AtomicReference i;

    public final void a(Map map) {
        if (map == null || map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.h.getAndSet(true);
        AtomicReference atomicReference = this.i;
        if (!andSet) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.nc);
            atomicReference.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.b, str, new d24(this, str)));
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public zzebf(Executor executor, zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.a = new HashMap();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.c = executor;
        this.d = zzuVar;
        this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q2)).booleanValue();
        this.f = csiUrlBuilder;
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.h8)).booleanValue();
        this.b = context;
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(map);
        String strGenerateUrl = this.f.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        boolean z = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.g) {
                this.c.execute(new o64(21, (zzebb) this, strGenerateUrl));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String strGenerateUrl = this.f.generateUrl(abstractMap);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.lf)).booleanValue() && !this.e) {
            return;
        }
        this.c.execute(new os0(21, (zzebb) this, strGenerateUrl));
    }
}
