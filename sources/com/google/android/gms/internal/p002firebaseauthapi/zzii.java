package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ia4;
import defpackage.pv1;
import defpackage.uz4;
import defpackage.vy4;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzii {
    public static uz4 a(zzch zzchVar, zzqh zzqhVar) throws GeneralSecurityException {
        zzaau zzaauVarD;
        if (zzqu.a(zzchVar)) {
            zzpw zzpwVar = new zzpw();
            for (int i = 0; i < zzchVar.zza(); i++) {
                zzcd zzcdVarZza = zzchVar.zza(i);
                if (zzcdVarZza.c.equals(zzbv.b)) {
                    zzbt zzbtVarZzb = zzcdVarZza.zzb();
                    if (zzbtVarZzb instanceof zzdm) {
                        zzaauVarD = ((zzdm) zzbtVarZzb).d();
                    } else if (zzbtVarZzb instanceof zzon) {
                        zzaauVarD = ((zzon) zzbtVarZzb).d();
                    } else {
                        throw new GeneralSecurityException(pv1.o("Cannot get output prefix for key of class ", zzbtVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzbtVarZzb.a())));
                    }
                    zzpwVar.a(zzaauVarD, new vy4((zzbm) zzqhVar.a(zzcdVarZza), zzcdVarZza.d));
                }
            }
            if (((zzoq) zzchVar.mo302zza()) == null) {
                vy4 vy4Var = new vy4((zzbm) zzqhVar.a(zzchVar.zzc()), zzchVar.zzc().d);
                zzpu zzpuVar = new zzpu(zzpwVar.a);
                ia4 ia4Var = zzow.a;
                return new uz4(vy4Var, zzpuVar, ia4Var, ia4Var);
            }
            throw null;
        }
        e.d("keyset doesn't contain a valid primary key");
        return null;
    }
}
