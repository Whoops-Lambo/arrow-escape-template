package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhsu extends zzhsx {
    public final zzhsv a;
    public final zzidz b;

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final Integer b() {
        return null;
    }

    public static zzhsu c(zzhsv zzhsvVar, zzidz zzidzVar) throws GeneralSecurityException {
        if (zzhsvVar.a == zzidzVar.a.a.length) {
            return new zzhsu(zzhsvVar, zzidzVar);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhsx, com.google.android.gms.internal.ads.zzhgc
    public final /* synthetic */ zzhgt a() {
        return this.a;
    }

    public zzhsu(zzhsv zzhsvVar, zzidz zzidzVar) {
        this.a = zzhsvVar;
        this.b = zzidzVar;
    }
}
