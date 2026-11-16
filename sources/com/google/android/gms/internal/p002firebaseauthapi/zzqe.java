package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.p65;
import defpackage.pv1;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzqe implements zzqh {
    public /* synthetic */ zzqb a;
    public /* synthetic */ zzqi b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqh
    public final Object a(zzck zzckVar) throws GeneralSecurityException {
        zzqb zzqbVar = this.a;
        zzqi zzqiVar = this.b;
        zzbt zzbtVarZzb = zzckVar.zzb();
        p65 p65Var = new p65(zzbtVarZzb.getClass(), zzqiVar.zza());
        if (zzqbVar.a.containsKey(p65Var)) {
            return ((zzpx) zzqbVar.a.get(p65Var)).a(zzbtVarZzb);
        }
        throw new GeneralSecurityException(pv1.n("No PrimitiveConstructor for ", String.valueOf(p65Var), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
