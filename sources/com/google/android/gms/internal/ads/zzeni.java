package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.n30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeni {
    public final String c;
    public zzflt d = null;
    public zzflq e = null;
    public com.google.android.gms.ads.internal.client.zzv f = null;
    public final Map b = n30.r();
    public final List a = Collections.synchronizedList(new ArrayList());

    public final synchronized void b(zzflq zzflqVar, int i) {
        Map map = this.b;
        String strD = d(zzflqVar);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzflqVar.v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzflqVar.E, 0L, null, bundle, zzflqVar.F, zzflqVar.G, zzflqVar.H, zzflqVar.I);
        try {
            this.a.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.b.put(strD, zzvVar);
    }

    public static String d(zzflq zzflqVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.K4)).booleanValue() ? zzflqVar.p0 : zzflqVar.w;
    }

    public zzeni(String str) {
        this.c = str;
    }

    public final void a(zzflq zzflqVar) {
        String strD = d(zzflqVar);
        Map map = this.b;
        Object obj = map.get(strD);
        List list = this.a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f);
        }
        if (iIndexOf >= 0 && iIndexOf < map.size()) {
            this.f = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            while (true) {
                iIndexOf++;
                if (iIndexOf < list.size()) {
                    com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
                    zzvVar.zzb = 0L;
                    zzvVar.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(zzflq zzflqVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String strD = d(zzflqVar);
        Map map = this.b;
        if (map.containsKey(strD)) {
            if (this.e == null) {
                this.e = zzflqVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strD);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.W7)).booleanValue() && z) {
                this.f = zzvVar;
            }
        }
    }
}
