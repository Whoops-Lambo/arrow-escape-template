package com.google.android.gms.internal.ads;

import defpackage.hw4;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhou extends zzhgc {
    public final zzhgx a;

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final zzhgt a() {
        zzhgx zzhgxVar = this.a;
        return new hw4(zzhgxVar.a, zzhgxVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final Integer b() {
        return this.a.e;
    }

    public final zzidx c() throws GeneralSecurityException {
        zzhgx zzhgxVar = this.a;
        zzhgw zzhgwVar = zzhgxVar.d;
        Integer num = zzhgxVar.e;
        if (zzhgwVar == zzhgw.e) {
            return zzidx.a(new byte[0]);
        }
        if (zzhgwVar == zzhgw.c) {
            return zzhpo.b(num.intValue());
        }
        if (zzhgwVar == zzhgw.d || zzhgwVar == zzhgw.f) {
            return zzhpo.a(num.intValue());
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Unknown output prefix type");
        return null;
    }

    public zzhou(zzhgx zzhgxVar) {
        this.a = zzhgxVar;
    }
}
