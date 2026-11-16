package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ca4;
import defpackage.cf4;
import defpackage.d54;
import defpackage.hg4;
import defpackage.ma4;
import defpackage.o24;
import defpackage.s94;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesm implements zzend {
    public final Context a;
    public final zzcxv b;
    public final zzbkm c;
    public final zzher d;
    public final zzfqv e;

    @Override // com.google.android.gms.internal.ads.zzend
    public final ListenableFuture a(zzfmb zzfmbVar, zzflq zzflqVar) {
        cf4 cf4Var = new cf4(new View(this.a), null, s94.f, (zzflr) zzflqVar.u.get(0));
        d54 d54VarD = this.b.d(new zzczo(zzfmbVar, zzflqVar, null), cf4Var);
        zzesl zzeslVar = new zzesl((zzdea) d54VarD.k.zzb(), (zzdeu) d54VarD.n.zzb(), (zzdml) d54VarD.p.zzb(), (zzdmd) d54VarD.y.zzb(), (zzcvl) d54VarD.e.zzb());
        zzflv zzflvVar = zzflqVar.s;
        zzbkh zzbkhVar = new zzbkh(zzeslVar, zzflvVar.b, zzflvVar.a);
        zzfqv zzfqvVar = this.e;
        Objects.requireNonNull(zzfqvVar);
        hg4 hg4Var = new hg4(new ca4(this, zzbkhVar, false, 9), 5);
        zzfqm zzfqmVar = new zzfqm(zzfqvVar, zzfqp.CUSTOM_RENDER_SYN, null, zzfqn.d, Collections.EMPTY_LIST, this.d.submit(hg4Var));
        zzfqm zzfqmVarA = zzfqmVar.f.a(zzfqmVar.d(), zzfqp.CUSTOM_RENDER_ACK);
        ma4 ma4Var = new ma4(1, zzheh.a(d54VarD.d()));
        o24 o24Var = zzcgv.h;
        return new zzfqm(zzfqmVarA.f, zzfqmVarA.a, zzfqmVarA.b, zzfqmVarA.c, zzfqmVarA.d, zzheh.h(zzfqmVarA.e, ma4Var, o24Var)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final boolean b(zzfmb zzfmbVar, zzflq zzflqVar) {
        zzflv zzflvVar;
        return (this.c == null || (zzflvVar = zzflqVar.s) == null || zzflvVar.a == null) ? false : true;
    }

    public zzesm(Context context, zzcxv zzcxvVar, zzfqv zzfqvVar, zzher zzherVar, zzbkm zzbkmVar) {
        this.a = context;
        this.b = zzcxvVar;
        this.e = zzfqvVar;
        this.d = zzherVar;
        this.c = zzbkmVar;
    }
}
