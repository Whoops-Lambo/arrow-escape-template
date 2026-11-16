package com.google.android.gms.internal.auth;

import android.util.Base64;
import defpackage.k64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhz implements zzhx {
    static {
        zzcz zzczVar = new zzcz(new zzcz(zzcr.a(), false, false).a().a, true, true);
        Double dValueOf = Double.valueOf(0.0d);
        new k64(zzczVar, dValueOf);
        zzczVar.c(true);
        zzczVar.b(20L);
        zzczVar.b(0L);
        try {
            zzhs zzhsVarI = zzhs.i(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3));
            int i = zzhy.a;
            new k64(zzczVar, zzhsVarI);
            zzczVar.c(true);
            zzczVar.b(20L);
            zzczVar.b(20L);
            zzczVar.c(false);
            zzczVar.c(false);
            zzczVar.b(120L);
            zzczVar.c(true);
            new k64(zzczVar, dValueOf);
        } catch (Exception e) {
            defpackage.d.p(e);
        }
    }
}
