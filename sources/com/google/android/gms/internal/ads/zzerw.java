package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ee4;
import defpackage.m54;
import defpackage.ne4;
import defpackage.xe4;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzerw implements zzenj {
    public final Context a;
    public final Executor b;
    public final zzdxc c;

    public static final void c(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        try {
            zzfnh zzfnhVar = (zzfnh) zzengVar.b;
            try {
                zzfnhVar.a.E0(zzfmbVar.a.a.d, zzflqVar.v.toString());
            } catch (Throwable th) {
                throw new zzfmq(th);
            }
        } catch (Exception e) {
            String str = zzengVar.a;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        m54 m54VarA = this.c.a(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdwz(new ee4(this, zzengVar, zzflqVar, 2), null));
        m54VarA.h().Z(new zzcue((zzfnh) zzengVar.b), this.b);
        zzdfj zzdfjVar = (zzdfj) m54VarA.l.zzb();
        zzdea zzdeaVarA = m54VarA.a();
        zzdgn zzdgnVar = (zzdgn) m54VarA.r.zzb();
        zzdms zzdmsVarF = m54VarA.f();
        zzeot zzeotVar = (zzeot) zzengVar.c;
        xe4 xe4Var = new xe4(this, zzdgnVar, zzdeaVarA, zzdfjVar, zzdmsVarF);
        synchronized (zzeotVar) {
            zzeotVar.a = xe4Var;
        }
        return m54VarA.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) throws zzfmq {
        zzfnh zzfnhVar = (zzfnh) zzengVar.b;
        if (zzfnhVar.a()) {
            c(zzfmbVar, zzflqVar, zzengVar);
            return;
        }
        ne4 ne4Var = new ne4(this, zzfmbVar, zzflqVar, zzengVar);
        zzdfm zzdfmVar = zzengVar.c;
        zzeot zzeotVar = (zzeot) zzdfmVar;
        synchronized (zzeotVar) {
            zzeotVar.c = ne4Var;
        }
        Context context = this.a;
        zzfmj zzfmjVar = zzfmbVar.a.a;
        zzcde zzcdeVar = (zzcde) zzdfmVar;
        String string = zzflqVar.v.toString();
        try {
            zzfnhVar.a.E3(new ObjectWrapper(context), zzfmjVar.d, zzcdeVar, string);
        } catch (Throwable th) {
            throw new zzfmq(th);
        }
    }

    public zzerw(Context context, Executor executor, zzdxc zzdxcVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdxcVar;
    }
}
