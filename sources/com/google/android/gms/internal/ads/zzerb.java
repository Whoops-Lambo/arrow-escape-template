package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ee4;
import defpackage.m54;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzerb implements zzenj {
    public final Context a;
    public final Executor b;
    public final zzdxc c;

    @Override // com.google.android.gms.internal.ads.zzenj
    public final Object a(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        m54 m54VarA = this.c.a(new zzczo(zzfmbVar, zzflqVar, zzengVar.a), new zzdwz(new ee4(this, zzengVar, zzflqVar, 1), null));
        m54VarA.h().Z(new zzcue((zzfnh) zzengVar.b), this.b);
        ((zzeos) zzengVar.c).P3((zzerg) m54VarA.z.zzb());
        return m54VarA.d();
    }

    @Override // com.google.android.gms.internal.ads.zzenj
    public final void b(zzfmb zzfmbVar, zzflq zzflqVar, zzeng zzengVar) {
        JSONObject jSONObject = zzflqVar.v;
        zzdfm zzdfmVar = zzengVar.c;
        try {
            zzfmj zzfmjVar = zzfmbVar.a.a;
            zzflx zzflxVar = zzfmjVar.p;
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmjVar.d;
            int i = zzflxVar.a;
            Object obj = zzengVar.b;
            Context context = this.a;
            if (i == 3) {
                zzfnh zzfnhVar = (zzfnh) obj;
                try {
                    zzfnhVar.a.J1(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbwm) zzdfmVar);
                    return;
                } catch (Throwable th) {
                    throw new zzfmq(th);
                }
            }
            zzfnh zzfnhVar2 = (zzfnh) obj;
            try {
                zzfnhVar2.a.W1(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbwm) zzdfmVar);
                return;
            } catch (Throwable th2) {
                throw new zzfmq(th2);
            }
        } catch (Exception e) {
            String str = zzengVar.a;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
        String str2 = zzengVar.a;
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str2)), e);
    }

    public zzerb(Context context, Executor executor, zzdxc zzdxcVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdxcVar;
    }
}
