package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import defpackage.jy4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbh {
    public final zzbfc a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public final byte[] a() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrD;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    jy4 jy4Var = zzifx.b;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i = 0;
                        while (i < iMin) {
                            int i2 = fileInputStream.read(bArr, i, iMin - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                        }
                        jy4 jy4VarH = i == 0 ? null : zzifx.H(0, i, bArr);
                        if (jy4VarH == null) {
                            break;
                        }
                        arrayList.add(jy4VarH);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrD = zzifx.J(arrayList).d();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrD = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.e = bArrD;
        }
        byte[] bArr2 = this.e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public zzgbh(zzbfc zzbfcVar, File file, File file2, File file3) {
        this.a = zzbfcVar;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }
}
