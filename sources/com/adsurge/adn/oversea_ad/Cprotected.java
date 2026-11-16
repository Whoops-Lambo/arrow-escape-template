package com.adsurge.adn.oversea_ad;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.protected, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Cprotected {
    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    deflaterOutputStream.close();
                    return byteArray;
                } catch (IOException e) {
                    e.printStackTrace();
                    return byteArray;
                }
            } catch (Exception unused) {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    deflaterOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int i = inflaterInputStream.read();
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayInputStream.close();
                            inflaterInputStream.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream.write(i);
                } catch (Exception unused) {
                    byteArrayInputStream.close();
                    inflaterInputStream.close();
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                        inflaterInputStream.close();
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
            e3.printStackTrace();
            return null;
        }
    }
}
