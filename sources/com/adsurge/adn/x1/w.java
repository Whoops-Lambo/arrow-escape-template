package com.adsurge.adn.x1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class w {
    /* JADX WARN: Code duplicated, block: B:51:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        GZIPInputStream gZIPInputStream2 = null;
        byteArray = null;
        byte[] byteArray = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            while (true) {
                try {
                    int i = gZIPInputStream.read(bArr2);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                } catch (Exception e) {
                    e = e;
                    try {
                        e.printStackTrace();
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        gZIPInputStream2 = gZIPInputStream;
                        gZIPInputStream = gZIPInputStream2;
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
            try {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } catch (Exception e5) {
            e = e5;
            gZIPInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream = gZIPInputStream2;
            if (gZIPInputStream != null) {
                gZIPInputStream.close();
            }
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
        return byteArray;
    }
}
