package com.adsurge.adn.oversea_ad;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Leo {
    public final String[] a;
    public volatile int b = 0;

    public final Phoenix a(byte[] bArr) {
        byte[] byteArray;
        Lynx lynx = new Lynx();
        int iA = lynx.a(this.a[this.b], bArr);
        if (iA != 0) {
            return new Phoenix(iA, new byte[0]);
        }
        AtomicReference atomicReference = new AtomicReference();
        HttpURLConnection httpURLConnection = lynx.a;
        int i = -4000;
        if (httpURLConnection != null && lynx.b) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = inputStream.read();
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(i2);
                }
                byteArray = byteArrayOutputStream.toByteArray();
                i = 0;
            } catch (IOException e) {
                e.printStackTrace();
                i = -4056;
                byteArray = null;
            } catch (Exception e2) {
                e2.printStackTrace();
                byteArray = null;
            }
            atomicReference.set(byteArray);
            HttpURLConnection httpURLConnection2 = lynx.a;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                lynx.a = null;
            }
        }
        return i != 0 ? new Phoenix(i, new byte[0]) : new Phoenix(i, (byte[]) atomicReference.get());
    }

    public Leo(String[] strArr) {
        this.a = strArr;
    }
}
