package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.singular.sdk.internal.Constants;
import defpackage.ku4;
import defpackage.l64;
import defpackage.o24;
import defpackage.o64;
import defpackage.q04;
import defpackage.r04;
import defpackage.tx;
import defpackage.ut4;
import defpackage.vt4;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvl implements zzbfr, zzdex, com.google.android.gms.ads.internal.overlay.zzr, zzdew {
    public final zzcvg a;
    public final zzcvh b;
    public final zzbvy d;
    public final Executor e;
    public final Clock f;
    public final HashSet c = new HashSet();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final zzcvk h = new zzcvk();
    public boolean i = false;
    public WeakReference j = new WeakReference(this);

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final synchronized void K(zzbfq zzbfqVar) {
        zzcvk zzcvkVar = this.h;
        zzcvkVar.a = zzbfqVar.j;
        zzcvkVar.e = zzbfqVar;
        f();
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final synchronized void Q() {
        int i = 0;
        if (this.g.compareAndSet(false, true)) {
            zzcvg zzcvgVar = this.a;
            zzbvv zzbvvVar = zzcvgVar.b;
            l64 l64Var = zzcvgVar.e;
            zzbvvVar.a();
            ListenableFuture listenableFuture = zzbvvVar.b;
            q04 q04Var = new q04(i, "/updateActiveView", l64Var);
            o24 o24Var = zzcgv.h;
            zzbvvVar.b = zzheh.h(listenableFuture, q04Var, o24Var);
            l64 l64Var2 = zzcvgVar.f;
            zzbvvVar.a();
            zzbvvVar.b = zzheh.h(zzbvvVar.b, new q04(i, "/untrackActiveViewUnit", l64Var2), o24Var);
            zzcvgVar.d = this;
            f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final synchronized void d(Context context) {
        this.h.d = Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY;
        f();
        m();
        this.i = true;
    }

    public final synchronized void f() {
        try {
            int i = 1;
            if (this.j.get() == null) {
                synchronized (this) {
                    m();
                    this.i = true;
                }
                return;
            }
            if (this.i || !this.g.get()) {
                return;
            }
            try {
                zzcvk zzcvkVar = this.h;
                zzcvkVar.c = this.f.elapsedRealtime();
                JSONObject jSONObjectZzb = this.b.zzb(zzcvkVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    this.e.execute(new o64(17, jSONObjectZzb, (zzcly) it.next()));
                }
                zzbvy zzbvyVar = this.d;
                zzbvyVar.getClass();
                q04 q04Var = new q04(i, zzbvyVar, jSONObjectZzb);
                ListenableFuture listenableFuture = zzbvyVar.a;
                o24 o24Var = zzcgv.h;
                ut4 ut4VarH = zzheh.h(listenableFuture, q04Var, o24Var);
                ut4VarH.addListener(new ku4(0, ut4VarH, new tx("ActiveViewListener.callActiveViewJs", 15)), o24Var);
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final synchronized void x(Context context) {
        this.h.b = false;
        f();
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final synchronized void zza(Context context) {
        this.h.b = true;
        f();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
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
    public final synchronized void zzdx() {
        this.h.b = true;
        f();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdy() {
        this.h.b = false;
        f();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void m() {
        Iterator it = this.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            zzcvg zzcvgVar = this.a;
            if (!zHasNext) {
                zzbvv zzbvvVar = zzcvgVar.b;
                l64 l64Var = zzcvgVar.e;
                ListenableFuture listenableFuture = zzbvvVar.b;
                int i = 0;
                r04 r04Var = new r04(i, str2, l64Var);
                o24 o24Var = zzcgv.h;
                vt4 vt4VarI = zzheh.i(listenableFuture, r04Var, o24Var);
                zzbvvVar.b = vt4VarI;
                zzbvvVar.b = zzheh.i(vt4VarI, new r04(i, str, zzcvgVar.f), o24Var);
                return;
            }
            zzcly zzclyVar = (zzcly) it.next();
            zzclyVar.J("/updateActiveView", zzcvgVar.e);
            zzclyVar.J("/untrackActiveViewUnit", zzcvgVar.f);
        }
    }

    public zzcvl(zzbvv zzbvvVar, zzcvh zzcvhVar, Executor executor, zzcvg zzcvgVar, Clock clock) {
        this.a = zzcvgVar;
        zzbvvVar.a();
        this.d = new zzbvy(zzbvvVar.b);
        this.b = zzcvhVar;
        this.e = executor;
        this.f = clock;
    }
}
