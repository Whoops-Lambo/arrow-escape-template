package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqo implements zzcy {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcy
    public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
        String str = zzctVar.a;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return ((zzod) map.get(str)).a(zzctVar, zzddVar);
        }
        throw new GeneralSecurityException(pv1.n("No Key Parser for requested key type ", str, " available"));
    }

    public zzqo(zzqn zzqnVar) {
        this.a = new HashMap(zzqnVar.a);
        this.b = new HashMap(zzqnVar.b);
        this.c = new HashMap(zzqnVar.c);
        this.d = new HashMap(zzqnVar.d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcy
    public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
        Class<?> cls = zzbtVar.getClass();
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            return ((zzoh) map.get(zzbtVar.getClass())).a(zzbtVar, zzddVar);
        }
        throw new GeneralSecurityException(pv1.n("No Key serializer for ", String.valueOf(zzbtVar.getClass()), " available"));
    }
}
