package com.google.android.gms.internal.games_v2;

import defpackage.jj4;
import defpackage.ur4;
import defpackage.uw4;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhi extends jj4 implements Serializable {
    public static final zzhi b;
    public static final zzhi c;
    public final transient zzhd a;

    static {
        ur4 ur4Var = zzhd.b;
        b = new zzhi(a.e);
        Object[] objArr = {zzhw.c};
        zzhs.a(0, objArr[0]);
        c = new zzhi(new a(objArr, 1));
    }

    @Override // com.google.android.gms.internal.games_v2.zzhy
    public final /* bridge */ /* synthetic */ zzhk zzc() {
        zzhd zzhdVar = this.a;
        if (zzhdVar.isEmpty()) {
            return b.i;
        }
        zzhw zzhwVar = zzhw.c;
        return new c(zzhdVar, uw4.a);
    }

    public zzhi(zzhd zzhdVar) {
        this.a = zzhdVar;
    }
}
