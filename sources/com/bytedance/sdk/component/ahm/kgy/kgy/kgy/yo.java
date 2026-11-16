package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class yo extends InputStream {
    HttpURLConnection ahm;
    InputStream kgy;

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            inputStream.close();
            this.kgy = null;
        }
        HttpURLConnection httpURLConnection = this.ahm;
        if (httpURLConnection != null) {
            PangleNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            this.ahm = null;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    public yo(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.kgy = inputStream;
        this.ahm = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.kgy;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }
}
