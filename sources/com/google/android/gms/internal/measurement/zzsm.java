package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsm extends zzso implements zzsf {
    public final FileOutputStream a;
    public final File b;

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.b;
    }

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }
}
