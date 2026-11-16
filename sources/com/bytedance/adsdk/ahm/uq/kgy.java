package com.bytedance.adsdk.ahm.uq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy implements uq {
    private final HttpURLConnection kgy;

    private String kgy(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // com.bytedance.adsdk.ahm.uq.uq
    public InputStream ahm() throws IOException {
        return this.kgy.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.kgy.disconnect();
    }

    @Override // com.bytedance.adsdk.ahm.uq.uq
    public String rz() {
        return this.kgy.getContentType();
    }

    public kgy(HttpURLConnection httpURLConnection) {
        this.kgy = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.ahm.uq.uq
    public String uq() {
        try {
            if (kgy()) {
                return null;
            }
            return "Unable to fetch " + this.kgy.getURL() + ". Failed with " + this.kgy.getResponseCode() + "\n" + kgy(this.kgy);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ahm.uq.uq
    public boolean kgy() {
        try {
            return this.kgy.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
        }
    }
}
