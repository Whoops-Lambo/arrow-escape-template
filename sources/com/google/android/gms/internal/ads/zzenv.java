package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.a54;
import defpackage.fe4;
import defpackage.ne4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenv implements zzenj {
    public final Context a;
    public final zzcwe b;

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        ne4 ne4Var = new ne4(zzflqVar, (zzbyf) zzengVar.b, AdFormat.APP_OPEN_AD);
        a54 a54VarA = this.b.a(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdno(ne4Var, null), new zzcwc(zzflqVar.a0));
        ne4Var.e = a54VarA.b();
        ((zzeos) zzengVar.c).P3(new zzesb((zzdea) a54VarA.n.zzb(), (zzdmh) a54VarA.p.zzb(), (zzdeu) a54VarA.j.zzb(), (zzdfj) a54VarA.m.zzb(), (zzdfo) a54VarA.q.zzb(), (zzdjg) a54VarA.e.T.zzb(), (zzdgn) a54VarA.r.zzb(), (zzdnf) a54VarA.s.zzb(), (zzdjc) a54VarA.t.zzb(), (zzdep) a54VarA.v.zzb()));
        return a54VarA.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        try {
            zzbyf zzbyfVar = (zzbyf) zzengVar.b;
            zzbyfVar.zzo(zzflqVar.Z);
            zzbyfVar.B1(zzflqVar.U, zzflqVar.v.toString(), zzfmbVar.a.a.d, new ObjectWrapper(this.a), new fe4(zzengVar), (zzbwm) zzengVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfmq(e);
        }
    }

    public zzenv(Context context, zzcwe zzcweVar) {
        this.a = context;
        this.b = zzcweVar;
    }
}
