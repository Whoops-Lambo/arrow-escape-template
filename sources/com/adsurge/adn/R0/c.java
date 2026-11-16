package com.adsurge.adn.R0;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements d {
    public d a;

    @Override // com.adsurge.adn.R0.d
    public int available() {
        return this.a.available();
    }

    @Override // com.adsurge.adn.R0.d
    public int b() {
        return this.a.b();
    }

    @Override // com.adsurge.adn.R0.d
    public byte c() {
        return this.a.c();
    }

    @Override // com.adsurge.adn.R0.d
    public void close() {
        this.a.close();
    }

    @Override // com.adsurge.adn.R0.d
    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // com.adsurge.adn.R0.d
    public void reset() {
        this.a.reset();
    }

    @Override // com.adsurge.adn.R0.d
    public long skip(long j) {
        return this.a.skip(j);
    }

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // com.adsurge.adn.R0.d
    public InputStream a() {
        reset();
        return this.a.a();
    }
}
