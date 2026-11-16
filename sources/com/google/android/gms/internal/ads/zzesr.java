package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ca4;
import defpackage.hg4;
import defpackage.ma4;
import defpackage.o24;
import defpackage.vt;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesr implements zzend {
    public final zzbkm a;
    public final zzher b;
    public final zzfqv c;
    public final zzeta d;

    @Override // com.google.android.gms.internal.ads.zzend
    public final ListenableFuture a(zzfmb zzfmbVar, zzflq zzflqVar) {
        zzcha zzchaVar = new zzcha();
        zzesw zzeswVar = new zzesw();
        vt vtVar = new vt(14, (Object) this, (Object) zzchaVar, (Object) zzfmbVar, (Object) zzflqVar, (Object) zzeswVar, false);
        synchronized (zzeswVar) {
            zzeswVar.a = vtVar;
        }
        zzflv zzflvVar = zzflqVar.s;
        zzbkh zzbkhVar = new zzbkh(zzeswVar, zzflvVar.b, zzflvVar.a);
        zzfqp zzfqpVar = zzfqp.CUSTOM_RENDER_SYN;
        zzfqv zzfqvVar = this.c;
        Objects.requireNonNull(zzfqvVar);
        ca4 ca4Var = new ca4(this, zzbkhVar, false, 10);
        zzfqm zzfqmVar = new zzfqm(zzfqvVar, zzfqpVar, null, zzfqn.d, Collections.EMPTY_LIST, this.b.submit(new hg4(ca4Var, 5)));
        zzfqm zzfqmVarA = zzfqmVar.f.a(zzfqmVar.d(), zzfqp.CUSTOM_RENDER_ACK);
        ma4 ma4Var = new ma4(1, zzchaVar);
        o24 o24Var = zzcgv.h;
        return new zzfqm(zzfqmVarA.f, zzfqmVarA.a, zzfqmVarA.b, zzfqmVarA.c, zzfqmVarA.d, zzheh.h(zzfqmVarA.e, ma4Var, o24Var)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final boolean b(zzfmb zzfmbVar, zzflq zzflqVar) {
        zzflv zzflvVar;
        return (this.a == null || (zzflvVar = zzflqVar.s) == null || zzflvVar.a == null) ? false : true;
    }

    public zzesr(zzfqv zzfqvVar, zzher zzherVar, zzbkm zzbkmVar, zzeta zzetaVar) {
        this.c = zzfqvVar;
        this.b = zzherVar;
        this.a = zzbkmVar;
        this.d = zzetaVar;
    }
}
