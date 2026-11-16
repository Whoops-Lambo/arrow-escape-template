package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.h42;
import defpackage.k04;
import defpackage.mx3;
import defpackage.os0;
import defpackage.uf0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbuy {
    public final Context b;
    public final String c;
    public final VersionInfoParcel d;
    public final zzfrw e;
    public zzbux g;
    public final Object a = new Object();
    public int h = 1;
    public final h42 f = zzbvm.b;

    public final zzbux a() {
        zzfrj zzfrjVarB = zzfrj.b(this.b, 6);
        zzfrjVarB.zza();
        zzbux zzbuxVar = new zzbux(this.f);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcgv.f.execute(new os0(11, this, zzbuxVar));
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbuxVar.a(new k04(this, zzbuxVar, zzfrjVarB), new k04(this, zzbuxVar, zzfrjVarB));
        return zzbuxVar;
    }

    public final zzbus b() {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbux zzbuxVar = this.g;
                        if (zzbuxVar != null && this.h == 0) {
                            zzbuxVar.a(new mx3(this, 7), uf0.k);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbux zzbuxVar2 = this.g;
        if (zzbuxVar2 != null && zzbuxVar2.b.get() != -1) {
            int i = this.h;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.g.d();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.g.d();
            }
            this.h = 2;
            a();
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.g.d();
        }
        this.h = 2;
        this.g = a();
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.g.d();
    }

    public zzbuy(Context context, VersionInfoParcel versionInfoParcel, String str, zzfrw zzfrwVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = zzfrwVar;
    }
}
