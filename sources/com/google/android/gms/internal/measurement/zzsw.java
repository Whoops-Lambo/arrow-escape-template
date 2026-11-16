package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsw implements zzrt {
    public zzro[] a;

    public static zzsw b() {
        return new zzsw();
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        ArrayList arrayListA = zzrsVar.a(zzrsVar.a.a(zzrsVar.d));
        zzro[] zzroVarArr = this.a;
        if (zzroVarArr != null) {
            zzroVarArr[0].a(arrayListA);
        }
        return (OutputStream) arrayListA.get(0);
    }

    private zzsw() {
    }
}
