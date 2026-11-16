package com.google.android.gms.internal.measurement;

import defpackage.em3;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzss implements zzrt {
    public final zzafj a;
    public final zzadf b;

    public zzss(zzafj zzafjVar) {
        zzadf zzadfVar = zzadf.b;
        int i = em3.a;
        this.b = zzadf.c;
        this.a = zzafjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) throws IOException {
        InputStream inputStreamC = zzst.c(zzrsVar);
        try {
            zzadu zzaduVarA = this.a.a(inputStreamC, this.b);
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            return zzaduVarA;
        } catch (Throwable th) {
            if (inputStreamC != null) {
                try {
                    inputStreamC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
