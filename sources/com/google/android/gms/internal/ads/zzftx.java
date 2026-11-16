package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ix3;
import defpackage.ku4;
import defpackage.ne4;
import defpackage.o24;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzftx {
    public final Context a;
    public final Executor b;
    public final zzhes c;
    public final zzu d;
    public final zzftp e;
    public final zzfrw f;
    public final zzcol g;

    public zzftx(Context context, o24 o24Var, zzhes zzhesVar, zzu zzuVar, zzftp zzftpVar, zzfrw zzfrwVar, zzcol zzcolVar) {
        this.a = context;
        this.b = o24Var;
        this.c = zzhesVar;
        this.d = zzuVar;
        this.e = zzftpVar;
        this.f = zzfrwVar;
        this.g = zzcolVar;
    }

    public final void a(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), zzvVar, null, null);
        }
    }

    public final void b(String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfrt zzfrtVar, zzdgr zzdgrVar) {
        ListenableFuture listenableFutureSubmit;
        zzfrj zzfrjVarB = null;
        if (zzfrw.a() && ((Boolean) zzbll.d.c()).booleanValue()) {
            zzfrjVarB = zzfrj.b(this.a, 14);
            zzfrjVarB.zza();
        }
        zzfrj zzfrjVar = zzfrjVarB;
        if (zzvVar != null) {
            listenableFutureSubmit = new zzfto(zzvVar.zza(), this.d, this.c, this.e, this.g).a(str);
        } else {
            listenableFutureSubmit = this.c.submit(new ix3(8, this, str));
        }
        listenableFutureSubmit.addListener(new ku4(0, listenableFutureSubmit, new ne4(this, zzfrjVar, zzfrtVar, zzdgrVar, 5)), this.b);
    }
}
