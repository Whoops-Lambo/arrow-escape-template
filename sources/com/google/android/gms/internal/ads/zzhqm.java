package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqm implements zzhgy {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgc c(zzhgx zzhgxVar, zzhhg zzhhgVar) throws GeneralSecurityException {
        String str = zzhgxVar.a;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return ((zzhon) map.get(str)).a(zzhgxVar, zzhhgVar);
        }
        throw new GeneralSecurityException(jc1.o("No Key Parser for requested key type ", str, new StringBuilder(String.valueOf(str).length() + 47), " available"));
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgt f(zzhgz zzhgzVar) throws GeneralSecurityException {
        String str = zzhgzVar.b;
        HashMap map = this.d;
        if (map.containsKey(str)) {
            return ((zzhpr) map.get(str)).a(zzhgzVar);
        }
        throw new GeneralSecurityException(jc1.o("No Parameters Parser for requested key type ", str, new StringBuilder(String.valueOf(str).length() + 54), " available"));
    }

    public /* synthetic */ zzhqm(zzhql zzhqlVar) {
        this.a = new HashMap(zzhqlVar.a);
        this.b = new HashMap(zzhqlVar.b);
        this.c = new HashMap(zzhqlVar.c);
        this.d = new HashMap(zzhqlVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgx d(zzhgc zzhgcVar, zzhhg zzhhgVar) throws GeneralSecurityException {
        Class<?> cls = zzhgcVar.getClass();
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            return ((zzhoq) map.get(zzhgcVar.getClass())).a(zzhgcVar, zzhhgVar);
        }
        String strValueOf = String.valueOf(zzhgcVar.getClass());
        throw new GeneralSecurityException(jc1.o("No Key serializer for ", strValueOf, new StringBuilder(strValueOf.length() + 32), " available"));
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgz e(zzhgt zzhgtVar) throws GeneralSecurityException {
        Class<?> cls = zzhgtVar.getClass();
        HashMap map = this.c;
        if (map.containsKey(cls)) {
            return ((zzhpu) map.get(zzhgtVar.getClass())).a(zzhgtVar);
        }
        String strValueOf = String.valueOf(zzhgtVar.getClass());
        throw new GeneralSecurityException(jc1.o("No Key Format serializer for ", strValueOf, new StringBuilder(strValueOf.length() + 39), " available"));
    }
}
