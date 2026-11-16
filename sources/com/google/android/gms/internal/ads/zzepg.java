package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.i54;
import defpackage.ne4;
import defpackage.oe4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepg implements zzenj {
    public final Context a;
    public final zzdor b;

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        ne4 ne4Var = new ne4(zzflqVar, (zzbyf) zzengVar.b, AdFormat.INTERSTITIAL);
        i54 i54VarD = this.b.d(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdno(ne4Var, null));
        ne4Var.e = i54VarD.b();
        ((zzeos) zzengVar.c).P3(new zzesb((zzdea) i54VarD.m.zzb(), (zzdmh) i54VarD.p.zzb(), (zzdeu) i54VarD.i.zzb(), (zzdfj) i54VarD.l.zzb(), (zzdfo) i54VarD.q.zzb(), (zzdjg) i54VarD.d.T.zzb(), (zzdgn) i54VarD.s.zzb(), (zzdnf) i54VarD.t.zzb(), (zzdjc) i54VarD.u.zzb(), (zzdep) i54VarD.w.zzb()));
        return i54VarD.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        try {
            zzbyf zzbyfVar = (zzbyf) zzengVar.b;
            zzbyfVar.zzo(zzflqVar.Z);
            zzbyfVar.f0(zzflqVar.U, zzflqVar.v.toString(), zzfmbVar.a.a.d, new ObjectWrapper(this.a), new oe4(this, zzengVar), (zzbwm) zzengVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfmq(e);
        }
    }

    public zzepg(Context context, zzdor zzdorVar) {
        this.a = context;
        this.b = zzdorVar;
    }
}
