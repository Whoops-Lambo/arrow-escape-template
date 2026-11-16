package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zzhos implements zzhgd {
    public final String a;
    public final Class b;
    public final int c;

    @Override // com.google.android.gms.internal.ads.zzhgd
    public final zzhvg a(zzifx zzifxVar) throws GeneralSecurityException {
        zzhgz zzhgzVarA = zzhgz.a(zzhgw.e, zzifxVar, this.a);
        zzhpn zzhpnVar = zzhpn.b;
        zzhgx zzhgxVarD = ((zzhqm) zzhpnVar.a.get()).d(zzhpd.b.b(((zzhqm) zzhpnVar.a.get()).f(zzhgzVarA), null), zzhhg.a);
        zzhvf zzhvfVarG = zzhvg.G();
        String str = zzhgxVarD.a;
        zzhvfVarG.l();
        ((zzhvg) zzhvfVarG.b).I(str);
        zzifx zzifxVar2 = zzhgxVarD.b;
        zzhvfVarG.l();
        ((zzhvg) zzhvfVarG.b).J(zzifxVar2);
        int iB = zzhqi.b(zzhgxVarD.c);
        zzhvfVarG.l();
        ((zzhvg) zzhvfVarG.b).L(iB);
        return (zzhvg) zzhvfVarG.m();
    }

    @Override // com.google.android.gms.internal.ads.zzhgd
    public final Object b(zzifx zzifxVar) throws GeneralSecurityException {
        zzhgx zzhgxVarA = zzhgx.a(this.a, zzifxVar, zzhqi.c(this.c), zzhqi.d(5), null);
        zzhpn zzhpnVar = zzhpn.b;
        return ((zzhqf) zzhpj.b.a.get()).a(((zzhqm) zzhpnVar.a.get()).c(zzhgxVarA, zzhhg.a), this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhgd
    public final String zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgd
    public final Class zzc() {
        return this.b;
    }

    public zzhos(String str, int i, Class cls) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }
}
