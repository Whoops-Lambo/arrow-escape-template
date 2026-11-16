package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ku4;
import defpackage.ue4;
import defpackage.ve4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqo {
    public final Clock a;
    public final zzeqq b;
    public final zzftx c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.a8)).booleanValue();
    public final zzeni f;
    public boolean g;
    public long h;
    public long i;

    public final synchronized void a(List list) {
        this.i = this.a.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzflq zzflqVar = (zzflq) it.next();
            String str = zzflqVar.w;
            if (!TextUtils.isEmpty(str)) {
                this.d.put(zzflqVar, new ve4(str, zzflqVar.f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void c(zzflq zzflqVar) {
        ve4 ve4Var = (ve4) this.d.get(zzflqVar);
        if (ve4Var == null || this.g) {
            return;
        }
        ve4Var.c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                ve4 ve4Var = (ve4) ((Map.Entry) it.next()).getValue();
                if (ve4Var.c != Integer.MAX_VALUE) {
                    arrayList.add(ve4Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void b(zzfmb zzfmbVar, zzflq zzflqVar, ListenableFuture listenableFuture, zzftt zzfttVar) {
        zzflt zzfltVar = zzfmbVar.b.b;
        long jElapsedRealtime = this.a.elapsedRealtime();
        String str = zzflqVar.w;
        if (str != null) {
            this.d.put(zzflqVar, new ve4(str, zzflqVar.f0, 9, 0L, null));
            ue4 ue4Var = new ue4(this, jElapsedRealtime, zzfltVar, zzflqVar, str, zzfttVar, zzfmbVar);
            listenableFuture.addListener(new ku4(0, listenableFuture, ue4Var), zzcgv.h);
        }
    }

    public zzeqo(Clock clock, zzeqq zzeqqVar, zzeni zzeniVar, zzftx zzftxVar) {
        this.a = clock;
        this.b = zzeqqVar;
        this.f = zzeniVar;
        this.c = zzftxVar;
    }
}
