package com.google.android.gms.internal.measurement;

import defpackage.fs1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzse implements zzro {
    public OutputStream a;
    public zzsm b;

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zzb() throws IOException {
        if (this.b == null) {
            throw new zzsk("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.a.getFD().sync();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void a(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) fs1.w(arrayList);
        if (outputStream instanceof zzsm) {
            this.b = (zzsm) outputStream;
            this.a = (OutputStream) arrayList.get(0);
        }
    }
}
