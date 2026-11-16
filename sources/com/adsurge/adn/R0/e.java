package com.adsurge.adn.R0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends FilterInputStream implements d {
    public int a;

    @Override // com.adsurge.adn.R0.d
    public InputStream a() {
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.adsurge.adn.R0.d
    public synchronized void reset() {
        super.reset();
        this.a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.adsurge.adn.R0.d
    public long skip(long j) throws IOException {
        long j2 = j;
        while (j2 > 0) {
            long jSkip = super.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (super.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        long j3 = j - j2;
        this.a = (int) (((long) this.a) + j3);
        return j3;
    }

    @Override // com.adsurge.adn.R0.d
    public int b() {
        return this.a;
    }

    public e(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.adsurge.adn.R0.d
    public byte c() {
        byte b = (byte) read();
        this.a++;
        return b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.adsurge.adn.R0.d
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        this.a = Math.max(0, i3) + this.a;
        return i3;
    }
}
