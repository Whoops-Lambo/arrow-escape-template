package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.a55;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzon extends zzbt {
    public final zzct a;

    public static void c(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
        zzcw zzcwVar = zzctVar.c;
        if (zzcwVar == zzcw.c || zzcwVar == zzcw.d) {
            zzdd.a(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final zzcs a() {
        zzct zzctVar = this.a;
        return new a55(zzctVar.a, zzctVar.d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.a.e;
    }

    public final zzaau d() throws GeneralSecurityException {
        zzct zzctVar = this.a;
        zzcv zzcvVar = zzctVar.d;
        Integer num = zzctVar.e;
        zzcv zzcvVar2 = zzctVar.d;
        if (zzcvVar.equals(zzcv.e)) {
            return zzaau.a(new byte[0]);
        }
        if (zzcvVar2.equals(zzcv.c)) {
            return zzpj.b(num.intValue());
        }
        if (zzcvVar2.equals(zzcv.d) || zzcvVar2.equals(zzcv.f)) {
            return zzpj.a(num.intValue());
        }
        e.d("Unknown output prefix type");
        return null;
    }

    public zzon(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
        c(zzctVar, zzddVar);
        this.a = zzctVar;
    }
}
