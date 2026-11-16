package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzwt;
import defpackage.kb5;
import defpackage.lb5;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzxa extends zzwt {
    public final HashMap i = new HashMap();
    public Handler j;

    public abstract void q(Object obj, zzwt zzwtVar, zzbf zzbfVar);

    public void s(Object obj) {
    }

    public zzxt t(Object obj, zzxt zzxtVar) {
        throw null;
    }

    public void u(long j, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void l() {
        for (lb5 lb5Var : this.i.values()) {
            lb5Var.a.d(lb5Var.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void n() {
        for (lb5 lb5Var : this.i.values()) {
            lb5Var.a.c(lb5Var.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public void o() {
        HashMap map = this.i;
        for (lb5 lb5Var : map.values()) {
            zzxv zzxvVar = lb5Var.a;
            zzxvVar.a(lb5Var.b);
            kb5 kb5Var = lb5Var.c;
            zzxvVar.e(kb5Var);
            zzxvVar.g(kb5Var);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzxu, jb5] */
    public final void r(final Integer num, zzxv zzxvVar) {
        HashMap map = this.i;
        zzgvz.a(!map.containsKey(num));
        ?? r1 = new zzxu() { // from class: jb5
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ void a(zzwt zzwtVar, zzbf zzbfVar) {
                this.a.q(num, zzwtVar, zzbfVar);
            }
        };
        kb5 kb5Var = new kb5(this, num);
        map.put(num, new lb5(zzxvVar, r1, kb5Var));
        Handler handler = this.j;
        handler.getClass();
        zzxvVar.b(handler, kb5Var);
        Handler handler2 = this.j;
        handler2.getClass();
        zzxvVar.h(handler2, kb5Var);
        zzqn zzqnVar = this.g;
        zzqnVar.getClass();
        zzaca zzacaVar = this.h;
        zzacaVar.getClass();
        zzxvVar.j(r1, zzqnVar, zzacaVar);
        if (this.b.isEmpty()) {
            zzxvVar.c(r1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public void zzu() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((lb5) it.next()).a.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public void m(zziu zziuVar) {
        this.j = zzfq.p();
    }
}
