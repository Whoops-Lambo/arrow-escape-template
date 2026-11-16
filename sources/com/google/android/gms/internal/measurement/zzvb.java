package com.google.android.gms.internal.measurement;

import defpackage.c1;
import defpackage.e55;
import defpackage.gc0;
import defpackage.l95;
import defpackage.q95;
import defpackage.rs0;
import defpackage.s21;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzvb extends zztf {
    public final zzafc a;

    public zzvb(zznu zznuVar) {
        this.a = zznuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zztf
    public final c1 a(IOException iOException, l95 l95Var) {
        if (!(iOException.getCause() instanceof zzaeh)) {
            return rs0.c(iOException);
        }
        s21 s21VarD = rs0.d(this.a);
        zzui zzuiVar = l95Var.b;
        q95 q95Var = new q95(zzuiVar, 2);
        int i = zzxa.a;
        return rs0.a(rs0.g(s21VarD, new zzwy(zzvy.a(), q95Var), zzuiVar.d), IOException.class, new e55(iOException, 6), gc0.a);
    }
}
