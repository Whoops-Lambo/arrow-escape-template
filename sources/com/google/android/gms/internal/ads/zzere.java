package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.m54;
import defpackage.ne4;
import defpackage.we4;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzere implements zzenj {
    public final Context a;
    public final zzdxc b;

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        ne4 ne4Var = new ne4(zzflqVar, (zzbyf) zzengVar.b, AdFormat.REWARDED);
        m54 m54VarA = this.b.a(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdwz(ne4Var, null));
        ne4Var.e = m54VarA.b();
        ((zzeos) zzengVar.c).P3(new zzesa((zzdea) m54VarA.m.zzb(), (zzdmh) m54VarA.o.zzb(), (zzdeu) m54VarA.i.zzb(), (zzdfj) m54VarA.l.zzb(), (zzdfo) m54VarA.p.zzb(), (zzdep) m54VarA.v.zzb(), (zzdjg) m54VarA.d.X.zzb(), (zzdnf) m54VarA.s.zzb(), (zzdgn) m54VarA.r.zzb(), (zzdms) m54VarA.x.zzb(), (zzdjc) m54VarA.t.zzb()));
        return m54VarA.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        try {
            Object obj = zzengVar.b;
            zzdfm zzdfmVar = zzengVar.c;
            zzbyf zzbyfVar = (zzbyf) obj;
            String str = zzflqVar.Z;
            JSONObject jSONObject = zzflqVar.v;
            zzbyfVar.zzo(str);
            zzfmj zzfmjVar = zzfmbVar.a.a;
            int i = zzfmjVar.p.a;
            String str2 = zzflqVar.U;
            Context context = this.a;
            if (i == 3) {
                zzbyfVar.P(str2, jSONObject.toString(), zzfmjVar.d, new ObjectWrapper(context), new we4(this, zzengVar), (zzbwm) zzdfmVar);
            } else {
                zzbyfVar.x0(str2, jSONObject.toString(), zzfmjVar.d, new ObjectWrapper(context), new we4(this, zzengVar), (zzbwm) zzdfmVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    public zzere(Context context, zzdxc zzdxcVar) {
        this.a = context;
        this.b = zzdxcVar;
    }
}
