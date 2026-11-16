package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.q63;
import defpackage.tb4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeaz implements zzfqw {
    public final zzear b;
    public final Clock c;
    public final HashMap a = new HashMap();
    public final HashMap d = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void K(zzfqp zzfqpVar, String str, Throwable th) {
        HashMap map = this.a;
        if (map.containsKey(zzfqpVar)) {
            long jElapsedRealtime = this.c.elapsedRealtime() - ((Long) map.get(zzfqpVar)).longValue();
            this.b.a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.d.containsKey(zzfqpVar)) {
            a(zzfqpVar, false);
        }
    }

    public final void a(zzfqp zzfqpVar, boolean z) {
        tb4 tb4Var = (tb4) this.d.get(zzfqpVar);
        if (tb4Var == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        zzfqp zzfqpVar2 = tb4Var.b;
        HashMap map = this.a;
        if (map.containsKey(zzfqpVar2)) {
            long jElapsedRealtime = this.c.elapsedRealtime() - ((Long) map.get(zzfqpVar2)).longValue();
            this.b.a.put("label.".concat(tb4Var.a), q63.g(jElapsedRealtime, str, new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void f(zzfqp zzfqpVar, String str) {
        this.a.put(zzfqpVar, Long.valueOf(this.c.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void n(zzfqp zzfqpVar, String str) {
        HashMap map = this.a;
        if (map.containsKey(zzfqpVar)) {
            long jElapsedRealtime = this.c.elapsedRealtime() - ((Long) map.get(zzfqpVar)).longValue();
            this.b.a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.d.containsKey(zzfqpVar)) {
            a(zzfqpVar, true);
        }
    }

    public zzeaz(zzear zzearVar, Set set, Clock clock) {
        this.b = zzearVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tb4 tb4Var = (tb4) it.next();
            HashMap map = this.d;
            tb4Var.getClass();
            map.put(zzfqp.RENDERER, tb4Var);
        }
        this.c = clock;
    }
}
