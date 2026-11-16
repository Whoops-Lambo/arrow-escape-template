package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzrt {
    public static final zzrl a = (zzrl) zzqs.a(new zzqr() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrs
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqr
        public final Object zza() {
            zzrl zzrlVar = zzrt.a;
            zzrl.zza zzaVarB = zzrl.b();
            zzaVarB.a = 32;
            zzaVarB.b = 16;
            zzaVarB.d = zzrl.zzb.b;
            zzaVarB.c = zzrl.zzc.d;
            return zzaVarB.a();
        }
    });
    public static final zzrl b;
    public static final zzra c;

    static {
        b = (zzrl) zzqs.a(new zzqr() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqr
            public final Object zza() {
                zzrl zzrlVar = zzrt.a;
                zzrl.zza zzaVarB = zzrl.b();
                zzaVarB.a = 64;
                zzaVarB.b = 64;
                zzaVarB.d = zzrl.zzb.b;
                zzaVarB.c = zzrl.zzc.f;
                return zzaVarB.a();
            }
        });
        c = (zzra) zzqs.a(new zzqr() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqr
            public final Object zza() throws GeneralSecurityException {
                zzrl zzrlVar = zzrt.a;
                zzra.zza zzaVar = new zzra.zza(0);
                zzaVar.b(32);
                zzaVar.c(16);
                zzaVar.c = zzra.zzb.b;
                return zzaVar.a();
            }
        });
    }
}
