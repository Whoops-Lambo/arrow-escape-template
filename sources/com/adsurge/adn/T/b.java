package com.adsurge.adn.T;

import defpackage.dr0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b implements com.adsurge.adn.H0.b {
    public final HttpURLConnection a;
    public int b;

    @Override // com.adsurge.adn.H0.b
    public int b() {
        return this.b;
    }

    public InputStream d() {
        return this.a.getInputStream();
    }

    public b(HttpURLConnection httpURLConnection) throws IOException {
        this.b = 0;
        if (httpURLConnection != null) {
            this.a = httpURLConnection;
            this.b = httpURLConnection.getResponseCode();
        } else {
            dr0.h("AbstractResponse parameter is null");
            throw null;
        }
    }

    @Override // com.adsurge.adn.H0.b
    public byte[] a() throws IOException {
        if (200 != b()) {
            return null;
        }
        InputStream inputStreamD = d();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamD.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    inputStreamD.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Throwable th) {
            inputStreamD.close();
            throw th;
        }
    }

    @Override // com.adsurge.adn.H0.b
    public String c() throws IOException {
        byte[] bArrA = a();
        String contentEncoding = null;
        if (bArrA == null) {
            return null;
        }
        if (bArrA.length == 0) {
            return "";
        }
        try {
            contentEncoding = this.a.getContentEncoding();
        } catch (Throwable unused) {
        }
        if (contentEncoding == null) {
            contentEncoding = "UTF-8";
        }
        return new String(bArrA, contentEncoding);
    }

    @Override // com.adsurge.adn.H0.b
    public void close() throws IOException {
        d().close();
        this.a.disconnect();
    }

    @Override // com.adsurge.adn.H0.b
    public String a(String str) {
        return this.a.getHeaderField(str);
    }
}
