package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.d54;
import defpackage.e74;
import defpackage.ke4;
import defpackage.nu4;
import defpackage.tc4;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeom implements zzenj {
    public final Context a;
    public final zzcxv b;
    public View c;
    public zzbwp d;

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m9)).booleanValue() && zzflqVar.g0) {
            try {
                view = (View) ObjectWrapper.z1(this.d.zze());
                boolean zZzf = this.d.zzf();
                if (view == null) {
                    throw new zzfmq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzheh.h(nu4.b, new e74(6, this, view, zzflqVar), zzcgv.f).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfmq(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfmq(e2);
            }
        } else {
            view = this.c;
        }
        d54 d54VarD = this.b.d(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzcwx(view, null, new tc4(zzengVar, 8), (zzflr) zzflqVar.u.get(0)));
        d54VarD.g().l0(view);
        ((zzeos) zzengVar.c).P3(new zzesb((zzdea) d54VarD.k.zzb(), (zzdmh) d54VarD.q.zzb(), (zzdeu) d54VarD.n.zzb(), (zzdfj) d54VarD.j.zzb(), d54VarD.e(), (zzdjg) d54VarD.d.V.zzb(), (zzdgn) d54VarD.t.zzb(), (zzdnf) d54VarD.u.zzb(), (zzdjc) d54VarD.v.zzb(), (zzdep) d54VarD.w.zzb()));
        return d54VarD.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        try {
            Object obj = zzengVar.b;
            zzdfm zzdfmVar = zzengVar.c;
            zzbyf zzbyfVar = (zzbyf) obj;
            String str = zzflqVar.Z;
            JSONObject jSONObject = zzflqVar.v;
            zzbyfVar.zzo(str);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m9)).booleanValue();
            Context context = this.a;
            if (zBooleanValue && zzflqVar.g0) {
                String str2 = zzflqVar.U;
                String string = jSONObject.toString();
                zzfmj zzfmjVar = zzfmbVar.a.a;
                zzbyfVar.v3(str2, string, zzfmjVar.d, new ObjectWrapper(context), new ke4(this, zzengVar), (zzbwm) zzdfmVar, zzfmjVar.f);
                return;
            }
            String str3 = zzflqVar.U;
            String string2 = jSONObject.toString();
            zzfmj zzfmjVar2 = zzfmbVar.a.a;
            zzbyfVar.j0(str3, string2, zzfmjVar2.d, new ObjectWrapper(context), new ke4(this, zzengVar), (zzbwm) zzdfmVar, zzfmjVar2.f);
        } catch (RemoteException e) {
            throw new zzfmq(e);
        }
    }

    public zzeom(Context context, zzcxv zzcxvVar) {
        this.a = context;
        this.b = zzcxvVar;
    }
}
