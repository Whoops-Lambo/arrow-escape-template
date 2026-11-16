package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.dr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzoy {
    public static final zzoy b;
    public final HashMap a = new HashMap();

    public final zzbt a(zzcs zzcsVar, Integer num) {
        zzbt zzbtVarA;
        synchronized (this) {
            zzob zzobVar = (zzob) this.a.get(zzcsVar.getClass());
            if (zzobVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(zzcsVar) + ": no key creator for this class was registered.");
            }
            zzbtVarA = zzobVar.a(zzcsVar, num);
        }
        return zzbtVarA;
    }

    public final synchronized void b(zzob zzobVar, Class cls) {
        try {
            zzob zzobVar2 = (zzob) this.a.get(cls);
            if (zzobVar2 != null && !zzobVar2.equals(zzobVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.a.put(cls, zzobVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    static {
        zzob zzobVar = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzox
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) throws GeneralSecurityException {
                zzoy zzoyVar = zzoy.b;
                zzcx zzcxVar = ((zzor) zzcsVar).a;
                zzoe zzoeVar = zzoe.d;
                zzbw zzbwVarE = zzoeVar.e(zzcxVar.b);
                if (((Boolean) zzoeVar.b.get(zzcxVar.b)).booleanValue()) {
                    zzxg zzxgVarC = zzbwVarE.c(zzcxVar.a);
                    return new zzon(zzct.a(zzxgVarC.C(), zzxgVarC.B(), zzqk.c(zzxgVarC.y()), zzcxVar.c, num), zzdd.a);
                }
                e.d("Creating new keys is not allowed.");
                return null;
            }
        };
        zzoy zzoyVar = new zzoy();
        try {
            zzoyVar.b(zzobVar, zzor.class);
            b = zzoyVar;
        } catch (GeneralSecurityException e) {
            dr0.l("unexpected error.", e);
        }
    }
}
