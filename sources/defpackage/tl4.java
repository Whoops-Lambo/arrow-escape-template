package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzggx;
import com.google.android.gms.internal.ads.zzgim;
import com.google.android.gms.internal.ads.zzgjg;
import com.google.android.gms.internal.ads.zzgjh;
import com.google.android.gms.internal.ads.zzgji;
import com.google.android.gms.internal.ads.zzgjs;
import com.google.android.gms.internal.ads.zzgrp;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzioz;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tl4 implements zzgim {
    public final ExecutorService a;
    public final zzioz b;
    public final zzioz c;
    public final zzgrp d;
    public final zzioz e;
    public final gl4 f;
    public final zzgfx g;

    @Override // com.google.android.gms.internal.ads.zzgim
    public final int zzg() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final ListenableFuture a(Context context, String str, View view) {
        zzioz zziozVar = this.e;
        HashMap mapC = this.d.c();
        zzgji zzgjiVar = (zzgji) zziozVar.zzb();
        synchronized (zzgjiVar) {
            try {
                InputEvent inputEvent = zzgjiVar.b;
                if (inputEvent != null) {
                    mapC.put("evt", inputEvent);
                }
                MotionEvent motionEvent = zzgjiVar.c;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", zzgjiVar.d);
                ArrayDeque arrayDeque = zzgjiVar.a;
                mapC.put("ro", arrayDeque.toArray(new zzgjh[arrayDeque.size()]));
                zzgjiVar.d = new zzgjg();
                arrayDeque.clear();
                MotionEvent motionEvent2 = zzgjiVar.c;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    zzgjiVar.c = null;
                }
                zzgjiVar.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        nf nfVarA = ((zzgjs) this.f.zzb()).a(context);
        nfVarA.d = view;
        nfVarA.e = null;
        nfVarA.g = str;
        nfVarA.f = mapC;
        nfVarA.i = zzggx.c;
        nfVarA.j(zzazk.N0());
        return nfVarA.i().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final void b(InputEvent inputEvent) {
        zzgji zzgjiVar = (zzgji) this.e.zzb();
        synchronized (zzgjiVar) {
            try {
                zzgjiVar.b = inputEvent;
                if (inputEvent instanceof MotionEvent) {
                    MotionEvent motionEvent = (MotionEvent) inputEvent;
                    if (motionEvent.getAction() == 1) {
                        zzgjiVar.c = MotionEvent.obtain(motionEvent);
                    }
                    zzgjiVar.d.a(motionEvent);
                    ArrayDeque arrayDeque = zzgjiVar.a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new zzgjh(motionEvent));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final ListenableFuture c(Context context, View view, Activity activity) {
        nf nfVarA = ((zzgjs) this.f.zzb()).a(context);
        nfVarA.d = view;
        nfVarA.e = activity;
        nfVarA.g = true != this.g.c0() ? "" : null;
        nfVarA.f = this.d.b(context, view);
        nfVarA.j(zzazk.N0());
        nfVarA.i = zzggx.b;
        return nfVarA.i().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final ListenableFuture d(Context context) {
        nf nfVarA = ((zzgjs) this.f.zzb()).a(context);
        nfVarA.f = this.d.a();
        nfVarA.j(zzazk.N0());
        nfVarA.i = zzggx.a;
        return nfVarA.i().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final String zza() {
        return "1.960507516";
    }

    @Override // com.google.android.gms.internal.ads.zzgim
    public final ListenableFuture zzb() {
        return zzheh.c(this.a, new hg4(this, 7));
    }

    public tl4(ExecutorService executorService, zzioz zziozVar, zzioz zziozVar2, zzgrp zzgrpVar, zzioz zziozVar3, gl4 gl4Var, zzgfx zzgfxVar) {
        this.a = executorService;
        this.b = zziozVar;
        this.c = zziozVar2;
        this.d = zzgrpVar;
        this.e = zziozVar3;
        this.f = gl4Var;
        this.g = zzgfxVar;
    }
}
