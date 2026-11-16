package io.p071bidmachine.media3.datasource;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.util.a;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends InputStream {
    public final h a;
    public final k b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        a.i(!this.e);
        boolean z = this.d;
        h hVar = this.a;
        if (!z) {
            hVar.a(this.b);
            this.d = true;
        }
        int i3 = hVar.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    public j(h hVar, k kVar) {
        this.a = hVar;
        this.b = kVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
