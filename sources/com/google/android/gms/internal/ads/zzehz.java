package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ku4;
import defpackage.q04;
import defpackage.st4;
import defpackage.tc4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehz implements zzeib {
    public final Map a;
    public final zzher b;
    public final zzdhg c;

    @Override // com.google.android.gms.internal.ads.zzeib
    public final ListenableFuture a(zzcch zzcchVar) {
        this.c.R(zzcchVar);
        int i = 3;
        st4 st4VarB = zzheh.b(new zzefo(3));
        int i2 = 0;
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.K9)).split(",")) {
            zzipu zzipuVar = (zzipu) this.a.get(str.trim());
            if (zzipuVar != null) {
                st4VarB = zzheh.f(st4VarB, zzefo.class, new q04(7, zzipuVar, zzcchVar), this.b);
            }
        }
        st4VarB.addListener(new ku4(i2, st4VarB, new tc4(this, i)), zzcgv.h);
        return st4VarB;
    }

    public zzehz(Map map, zzher zzherVar, zzdhg zzdhgVar) {
        this.a = map;
        this.b = zzherVar;
        this.c = zzdhgVar;
    }
}
