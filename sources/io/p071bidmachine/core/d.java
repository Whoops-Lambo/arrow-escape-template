package io.p071bidmachine.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends g {
    @Override // io.p071bidmachine.core.g
    public final byte[] b(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    j.a(gZIPOutputStream2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    j.d(byteArrayOutputStream);
                    j.a(byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    j.d(byteArrayOutputStream);
                    j.a(byteArrayOutputStream);
                    j.d(gZIPOutputStream);
                    j.a(gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    @Override // io.p071bidmachine.core.g
    public final byte[] a(URLConnection uRLConnection, byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if ("gzip".equals(uRLConnection.getContentEncoding())) {
            GZIPInputStream gZIPInputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i = gZIPInputStream2.read(bArr2);
                                if (i != -1) {
                                    byteArrayOutputStream.write(bArr2, 0, i);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    j.d(byteArrayOutputStream);
                                    j.a(byteArrayOutputStream);
                                    j.a(byteArrayInputStream);
                                    j.a(gZIPInputStream2);
                                    return byteArray;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPInputStream = gZIPInputStream2;
                            j.d(byteArrayOutputStream);
                            j.a(byteArrayOutputStream);
                            j.a(byteArrayInputStream);
                            j.a(gZIPInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayInputStream = null;
                }
            } catch (Throwable th5) {
                byteArrayInputStream = null;
                th = th5;
                byteArrayOutputStream = null;
            }
        } else {
            return bArr;
        }
    }
}
