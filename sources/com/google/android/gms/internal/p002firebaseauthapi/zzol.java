package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzol<P> implements zzbw<P> {
    public final String a;
    public final Class b;
    public final zzxg.zza c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final Object b(zzakb zzakbVar) throws GeneralSecurityException {
        zzct zzctVarA = zzct.a(this.a, zzakbVar, zzqk.c(this.c), zzqk.b(zzyi.RAW), null);
        zzpf zzpfVar = zzpf.b;
        return zzpg.b.a(((zzqo) zzpfVar.a.get()).a(zzctVarA, zzdd.a), this.b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final zzxg c(zzakb zzakbVar) throws GeneralSecurityException {
        zzcx zzcxVarA = zzcx.a(zzakbVar, zzcv.e, this.a);
        zzpf zzpfVar = zzpf.b;
        zzct zzctVarB = ((zzqo) zzpfVar.a.get()).b(zzoy.b.a(zzpfVar.a(zzcxVarA), null), zzdd.a);
        zzxg.zzb zzbVarU = zzxg.u();
        String str = zzctVarB.a;
        zzbVarU.i();
        zzxg.x((zzxg) zzbVarU.b, str);
        zzakb zzakbVar2 = zzctVarB.b;
        zzbVarU.i();
        zzxg.v((zzxg) zzbVarU.b, zzakbVar2);
        zzxg.zza zzaVarD = zzqk.d(zzctVarB.c);
        zzbVarU.i();
        ((zzxg) zzbVarU.b).zzg = zzaVarD.zza();
        return (zzxg) zzbVarU.f();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final Class zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final String zzb() {
        return this.a;
    }

    public zzol(String str, Class cls, zzxg.zza zzaVar) {
        this.a = str;
        this.b = cls;
        this.c = zzaVar;
    }
}
