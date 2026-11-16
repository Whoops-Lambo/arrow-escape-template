package com.google.android.gms.internal.ads;

import defpackage.nl4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghq implements nl4 {
    public final byte[] a;

    @Override // defpackage.nl4
    public final /* synthetic */ void b(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // defpackage.nl4
    public final /* synthetic */ Object zzc() {
        return this.a;
    }

    public zzghq(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.nl4
    public final /* bridge */ /* synthetic */ Object a(FileInputStream fileInputStream) {
        try {
            return zzhca.a(fileInputStream);
        } catch (IOException e) {
            throw new t("Cannot read bytes.", e);
        }
    }
}
