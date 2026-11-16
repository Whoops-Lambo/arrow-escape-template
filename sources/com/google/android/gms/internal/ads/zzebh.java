package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzebh {
    public final String e;
    public final zzebb f;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final com.google.android.gms.ads.internal.util.zzj a = com.google.android.gms.ads.internal.zzt.zzh().g();

    public final synchronized void a(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S2)).booleanValue() && !this.c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.b.add(mapE);
            this.c = true;
        }
    }

    public final HashMap e() {
        zzebb zzebbVar = this.f;
        zzebbVar.getClass();
        HashMap map = new HashMap(zzebbVar.a);
        map.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), 10));
        map.put("tid", this.a.zzx() ? "" : this.e);
        return map;
    }

    public zzebh(String str, zzebb zzebbVar) {
        this.e = str;
        this.f = zzebbVar;
    }
}
