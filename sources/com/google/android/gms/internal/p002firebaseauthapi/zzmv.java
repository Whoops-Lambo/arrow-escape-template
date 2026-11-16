package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f35;
import defpackage.j35;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzmv {
    public static f35 a(zzch zzchVar, zzqh zzqhVar) throws GeneralSecurityException {
        zzaau zzaauVarD;
        if (zzqu.a(zzchVar)) {
            zzpw zzpwVar = new zzpw();
            for (int i = 0; i < zzchVar.zza(); i++) {
                zzcd zzcdVarZza = zzchVar.zza(i);
                if (zzcdVarZza.c.equals(zzbv.b)) {
                    zzbs zzbsVar = (zzbs) zzqhVar.a(zzcdVarZza);
                    zzbt zzbtVarZzb = zzcdVarZza.zzb();
                    if (zzbtVarZzb instanceof zzlm) {
                        zzaauVarD = ((zzlp) ((zzlm) zzbtVarZzb).zzc()).d();
                    } else if (zzbtVarZzb instanceof zzon) {
                        zzaauVarD = ((zzon) zzbtVarZzb).d();
                    } else {
                        throw new GeneralSecurityException(pv1.o("Cannot get output prefix for key of class ", zzbtVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzbtVarZzb.a())));
                    }
                    zzpwVar.a(zzaauVarD, new j35(zzbsVar, zzcdVarZza.d));
                }
            }
            if (((zzoq) zzchVar.mo302zza()) == null) {
                return new f35(new zzpu(zzpwVar.a), zzow.a);
            }
            throw null;
        }
        e.d("keyset doesn't contain a valid primary key");
        return null;
    }
}
