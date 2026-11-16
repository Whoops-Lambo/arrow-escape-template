package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzcoj;
import com.google.android.gms.internal.ads.zzcwq;
import com.google.android.gms.internal.ads.zzcyw;
import com.google.android.gms.internal.ads.zzcyx;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzdro;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzioz;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r64 extends zzcwq {
    public final Context l;
    public final View m;
    public final zzcly n;
    public final zzflr o;
    public final zzcyw p;
    public final zzdro q;
    public final zzdml r;
    public final zzioz s;
    public final Executor t;
    public zzr u;

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void a() {
        this.t.execute(new b04(this, 17));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final View c() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void d(FrameLayout frameLayout, zzr zzrVar) {
        zzcly zzclyVar;
        if (frameLayout == null || (zzclyVar = this.n) == null) {
            return;
        }
        zzclyVar.D(zzcoj.a(zzrVar));
        frameLayout.setMinimumHeight(zzrVar.zzc);
        frameLayout.setMinimumWidth(zzrVar.zzf);
        this.u = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final zzea e() {
        try {
            return this.p.zza();
        } catch (zzfmq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final zzflr f() {
        zzr zzrVar = this.u;
        if (zzrVar != null) {
            return zzrVar.zzi ? new zzflr(-3, 0, true) : new zzflr(zzrVar.zze, zzrVar.zzb, false);
        }
        zzflq zzflqVar = this.b;
        if (zzflqVar.c0) {
            for (String str : zzflqVar.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.m;
            return new zzflr(view.getWidth(), view.getHeight(), false);
        }
        return (zzflr) zzflqVar.r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final zzflr g() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final int h() {
        if (((Boolean) zzba.zzc().a(zzbjr.m9)).booleanValue() && this.b.g0) {
            if (!((Boolean) zzba.zzc().a(zzbjr.n9)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final int i() {
        return this.a.b.b.d;
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void j() {
        zzdml zzdmlVar = this.r;
        synchronized (zzdmlVar) {
            zzdmlVar.k0(c95.b);
        }
    }

    public r64(zzcyx zzcyxVar, Context context, zzflr zzflrVar, View view, zzcly zzclyVar, zzcyw zzcywVar, zzdro zzdroVar, zzdml zzdmlVar, zzioz zziozVar, Executor executor) {
        super(zzcyxVar);
        this.l = context;
        this.m = view;
        this.n = zzclyVar;
        this.o = zzflrVar;
        this.p = zzcywVar;
        this.q = zzdroVar;
        this.r = zzdmlVar;
        this.s = zziozVar;
        this.t = executor;
    }
}
