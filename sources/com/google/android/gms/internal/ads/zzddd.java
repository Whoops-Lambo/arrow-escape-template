package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import defpackage.uy3;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzddd implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzfmb b;
    public final zzflq c;
    public final Clock d;
    public final zzeaw e;
    public final ScheduledExecutorService f;
    public final zzftx g;
    public final Object a = new Object();
    public final zzfsv h = zzfsw.E();
    public boolean i = false;
    public boolean j = false;

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        b(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        b(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        b(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        b(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        b(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void a() {
        synchronized (this.a) {
            try {
                String strEncodeToString = Base64.encodeToString(((zzfsw) this.h.m()).h(), 1);
                uy3 uy3Var = zzbjr.Le;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue()) {
                    zzeaw zzeawVar = this.e;
                    String str = this.b.b.b.b;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue()) {
                        zzeav zzeavVarA = zzeawVar.a();
                        zzeavVarA.b("action", "pclma");
                        zzeavVarA.b("pclmd", strEncodeToString);
                        zzeavVarA.b("gqi", str);
                        zzeavVarA.e();
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Me)).booleanValue()) {
                    zzflq zzflqVar = this.c;
                    String str2 = zzflqVar.J0;
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = zzflqVar.F0;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = zzflqVar.G0;
                        if (str4 == null) {
                            str4 = "";
                        }
                        this.g.b(String.valueOf(str2.replace("@label@", str3)).concat(str4).replace("@pclmd@", strEncodeToString), zzflqVar.x0, null, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            try {
                if (!this.j && this.i) {
                    zzfsv zzfsvVar = this.h;
                    zzfrf zzfrfVarE = zzfrg.E();
                    zzfrfVarE.l();
                    ((zzfrg) zzfrfVarE.b).G(i);
                    long jCurrentTimeMillis = this.d.currentTimeMillis();
                    zzfrfVarE.l();
                    ((zzfrg) zzfrfVarE.b).F(jCurrentTimeMillis);
                    zzfrg zzfrgVar = (zzfrg) zzfrfVarE.m();
                    zzfsvVar.l();
                    ((zzfsw) zzfsvVar.b).F(zzfrgVar);
                    if (i == 10) {
                        a();
                        this.j = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
        b(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        b(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        b(9);
    }

    public zzddd(zzfmb zzfmbVar, zzflq zzflqVar, Clock clock, zzeaw zzeawVar, ScheduledExecutorService scheduledExecutorService, zzftx zzftxVar) {
        this.b = zzfmbVar;
        this.c = zzflqVar;
        this.d = clock;
        this.e = zzeawVar;
        this.f = scheduledExecutorService;
        this.g = zzftxVar;
    }
}
